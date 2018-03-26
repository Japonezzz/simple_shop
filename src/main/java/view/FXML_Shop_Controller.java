package view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import controller.StoreController;
import enums.CategoryType;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import model.DataInfo;
import model.Goods;

import javax.xml.crypto.Data;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

public class FXML_Shop_Controller implements Initializable{

    ArrayList<Goods> goods;
    ArrayList<Goods> founded;

    @FXML
    private JFXListView<Goods> lv_info;

    @FXML
    private JFXButton b_tosecondary;

    @FXML
    private JFXTextField fld_search;

    @FXML
    private JFXButton b_search;

    @FXML
    private JFXRadioButton rb_down;

    @FXML
    private JFXRadioButton rb_up;

    @FXML
    private JFXListView<String> lv_category;

    @FXML
    void OnActionB_tosecondary(ActionEvent event) {

    }

    @FXML
    void OnActionFld_search(ActionEvent event) {

    }

    @FXML
    void OnEnterPressed(KeyEvent event) {
        if(event.getCode()== KeyCode.ENTER)
        {
            OnActionB_search(new ActionEvent());
        }
    }
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


    @FXML
    void OnActionB_search(ActionEvent event) {
        founded =  StoreController.Search_in_category(goods,fld_search.getText());

        FillingListView(founded);

    }

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
        lv_category.setItems(DataInfo.getCategories());
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