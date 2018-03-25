package view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import controller.StoreController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import model.Clothes;
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

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;

public class FXML_Shop_Controller implements Initializable{

    ArrayList<Goods> goods;

    @FXML
    private JFXListView<String> lv_info;

    @FXML
    private JFXButton btn_goods;

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
    void OnActionBtn_goods(ActionEvent event) {

    }

    @FXML
    void OnActionFld_search(ActionEvent event) {

    }

    @FXML
    void OnMouseClickLV_category(ActionEvent event) {

    }

    @FXML
    void OnActionB_search(ActionEvent event) {
        //StoreController storeController = new StoreController();
        ArrayList<Goods> founded =  StoreController.Search_in_category(goods,fld_search.getText());

        FillingListView(founded);

    }

    @FXML
    void OnActionRB_up(ActionEvent event) {

    }

    @FXML
    void OnActionRB_down(ActionEvent event) {

    }

    public void initialize(URL location, ResourceBundle resources) {
        InitCategory();
        InitGoods();
    }
    private void InitCategory(){
        ObservableList<String> items = FXCollections.observableArrayList (
                "Усі категорії", "PC", "Смартфони", "Одяг", "Овочі", "Одяг", "Вода", "Солодка вода", "Солодощі");
        lv_category.setItems(items);
    }
    private void InitGoods(){
        //StoreController store = new StoreController();
        goods = new ArrayList();
        goods.add(new Water(3, "Dobra Voda", 10, "Voda z krana", (double)1));
        goods.add( new Cellphone(1, "iPhone", 20, "Sell Phone from Apple", (double) 400,
                12, new RAM(12, "DDR5"), new CPU(5, 1.2),
                "IOS", 5.2, 10));
        goods.add(new Computer(2, "DELL", 15, "Famous NoteBook in the world", (double)800, 12,
                new RAM(12, "DDR5"), new CPU(5, 7.2),
                new CPU(2, 5.0), new RAM(4, "DDR4")));
        goods.add(new SweetDrinks(4, "Dobra Voda z limonom", 10, "Voda z krana", (double)1,
                new DateTerm(new Date(2018,01,20), (double)27,
                        12)));
        goods.add( new Sweets(5, "Kartoha", 10, "Mnogo kroxmalia", (double)1,
                new DateTerm(new Date(2018,03,20), (double)22,
                        2)));
        goods.add(new Vegetables(6, "Romashka", 10, "Vkusno", (double)1,
                new DateTerm(new Date(2018,03,20), (double)15,
                        4), "best of the best"));
        goods.add(new Clothes(7, "Krosovki", 10, "Kloviu brend", (double)1,
                new Date(2018, 02, 20), "Adibas",
                2000, 20));

        FillingListView(goods);

    }
    private void FillingListView(ArrayList<Goods> Items){
        ArrayList<String> names = new ArrayList();
        for (Goods S:Items) {
            names.add(S.GetListItem());
        }
        ObservableList<String> goodsCollection = FXCollections.observableArrayList(names);
        lv_info.setItems(goodsCollection);
    }


}
/*  TreeItem<Student> root = new RecursiveTreeItem<Student>(student, RecursiveTreeObject::getChildren);
    JFXTreeTableView<Student> table = new JFXTreeTableView<>();
    table.getColumns().setAll(studentUOB, studentName, emailAddress, studentYear, personalContact, dept);
    table.setRoot(root);
    table.setShowRoot(false);
    */