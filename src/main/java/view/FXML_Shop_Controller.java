package view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import controller.StoreController;
import enums.CategoryType;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Clothes;
import model.DataInfo;
import model.DateTerm;
import model.Eating.SweetDrinks;
import model.Eating.Sweets;
import model.Eating.Vegetables;
import model.Eating.Water;
import model.Goods;
import model.Technics.CPU;
import model.Technics.Cellphone;
import model.Technics.Computer;
import model.Technics.RAM;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class FXML_Shop_Controller implements Initializable{

    public ArrayList<Goods> goods;
    ArrayList<Goods> founded;

    @FXML
    private JFXButton add_button;

    @FXML
    void OnAddButtonPressed(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/FXMLAdd.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Добавлення товару");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private JFXButton delete_button;

    @FXML
    void On_Action_Delete(ActionEvent event) {
        Integer selected = lv_info.getSelectionModel().getSelectedIndex();
        if(!(lv_info.getSelectionModel().isEmpty())) {
            DataInfo di = new DataInfo();
            di.setGoods(goods);
            di.removeGood(selected);
            FillingListView(di.getGoods());
        }
        else
        {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Warning");
            alert.setContentText("You didn't chosen the good");
            alert.setHeaderText(null);
            alert.showAndWait();
        }
    }

    @FXML
    private JFXButton MoreInfoButton;

    @FXML
    void On_Action_MoreInfo(ActionEvent event) {

    }


    @FXML
    private JFXListView<Goods> lv_info;

    @FXML
    private JFXButton b_tosecondary;

//    @FXML
//    private JFXTextField fld_search;

//    @FXML
//    private JFXButton b_search;

    @FXML
    private JFXRadioButton rb_down;

    @FXML
    private JFXRadioButton rb_up;

    @FXML
    private JFXListView<String> lv_category;

    @FXML
    void OnActionB_tosecondary(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/FXMLGoods.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Tовари");
        stage.setScene(scene);
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

//    @FXML
//    void OnActionFld_search(ActionEvent event) {
//
//    }

//    @FXML
//    void OnEnterPressed(KeyEvent event) {
//        if(event.getCode()== KeyCode.ENTER)
//        {
//            OnActionB_search(new ActionEvent());
//        }
//    }
    @FXML
    void OnMouseClickLV_category(MouseEvent event) {
        founded = new ArrayList<Goods>();
        Integer selected = lv_category.getSelectionModel().getSelectedIndex();
        CategoryType local_category = CategoryType.All;
    switch (selected)
    {
        case(0):
            {
            founded.addAll(goods);
            break;
        }

        case(1):
        {
            local_category = CategoryType.Computer;
            break;
        }

        case(2):
        {
            local_category = CategoryType.CellPhone;
            break;
        }

        case(3):
            {
                local_category = CategoryType.Clothes;
                break;
            }
        case(4):
        {
            local_category = CategoryType.Vegetables;
            break;
        }
        case(5):
        {
            local_category = CategoryType.Water;
            break;
        }
        case(6):
        {
            local_category = CategoryType.SweetDrinks;
            break;
        }
        case(7):
        {
            local_category = CategoryType.Sweets;
            break;
        }
    }
    for(Goods a : goods)
        if(a.getCategory() == local_category)
            founded.add(a);
    FillingListView(founded);
}


//    @FXML
//    void OnActionB_search(ActionEvent event) {
//        founded =  StoreController.Search_in_category(goods,fld_search.getText());
//
//        FillingListView(founded);
//
//    }

    @FXML
    void OnActionRB_up(ActionEvent event) {

        ObservableList<Goods> increase = lv_info.getItems();
        Collections.sort(increase, new Comparator<Goods>(){
            public int compare(Goods o1, Goods o2){
                if(o1.getPrice() == o2.getPrice())
                    return 0;
                return o1.getPrice() > o2.getPrice() ? -1 : 1;
            }
        });
        lv_info.setItems(increase);
    }

    @FXML
    void OnActionRB_down(ActionEvent event) {
        ObservableList<Goods> decrease = lv_info.getItems();
        Collections.sort(decrease, new Comparator<Goods>(){
            public int compare(Goods o1, Goods o2){
                if(o1.getPrice() == o2.getPrice())
                    return 0;
                return o1.getPrice() < o2.getPrice() ? -1 : 1;
            }
        });
        lv_info.setItems(decrease);
    }

    public void initialize(URL location, ResourceBundle resources) {
        final ToggleGroup Rbuttons = new ToggleGroup();
        rb_down.setToggleGroup(Rbuttons);
        rb_up.setToggleGroup(Rbuttons);
        InitCategory();
        InitGoods();
    }
    private void InitCategory(){
        ObservableList<String> items = FXCollections.observableArrayList (
                "Усі категорії", "PC", "Смартфони", "Одяг", "Овочі", "Вода", "Солодка вода", "Солодощі");
        lv_category.setItems(items);
    }
    private void InitGoods(){
        DataInfo dataInfo = new DataInfo();
        dataInfo.InitTestData();
        goods = dataInfo.getGoods();
        FillingListView(goods);
    }
    private void FillingListView(ArrayList<Goods> Items){
        ObservableList<Goods> goodsCollection = FXCollections.observableArrayList(Items);
        lv_info.setItems(goodsCollection);
    }
}