package view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
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
import java.util.*;

public class FXML_Shop_Controller implements Initializable{

    ArrayList<Goods> goods;
    ArrayList<Goods> founded;

    @FXML
    private JFXListView<String> lv_info;

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

        ArrayList<Goods> increase = goods;
        Collections.sort(increase, new Comparator<Goods>(){
            public int compare(Goods o1, Goods o2){
                if(o1.getPrice() == o2.getPrice())
                    return 0;
                return o1.getPrice() > o2.getPrice() ? -1 : 1;
            }
        });
        FillingListView(increase);
    }

    @FXML
    void OnActionRB_down(ActionEvent event) {
        ArrayList<Goods> decrease = goods;
        Collections.sort(decrease, new Comparator<Goods>(){
            public int compare(Goods o1, Goods o2){
                if(o1.getPrice() == o2.getPrice())
                    return 0;
                return o1.getPrice() < o2.getPrice() ? -1 : 1;
            }
        });
        FillingListView(decrease);
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
        //StoreController store = new StoreController();
        goods = new ArrayList();
        goods.add(new Water(3, "Dobra Voda", 10, "Voda z krana", (double)1, "Water"));
        goods.add( new Cellphone(1, "iPhone", 20, "Sell Phone from Apple", (double) 400, "CellPhone",
                12, new RAM(12, "DDR5"), new CPU(5, 1.2),
                "IOS", 5.2, 10));
        goods.add(new Computer(2, "DELL", 15, "Famous NoteBook in the world", (double)800, "Computer", 12,
                new RAM(12, "DDR5"), new CPU(5, 7.2),
                new CPU(2, 5.0), new RAM(4, "DDR4")));
        goods.add(new SweetDrinks(4, "Dobra Voda z limonom", 10, "Voda z krana", (double)1, "SweetDrinks",
                new DateTerm(new Date(2018,01,20), (double)27,
                        12)));
        goods.add( new Sweets(5, "Romashka", 10, "Mnogo kroxmalia", (double)1, "Sweets",
                new DateTerm(new Date(2018,03,20), (double)22,
                        2)));
        goods.add(new Vegetables(6, "Kartoha", 10, "Vkusno", (double)1, "Vegetables",
                new DateTerm(new Date(2018,03,20), (double)15,
                        4), "best of the best"));
        goods.add(new Clothes(7, "Krosovki", 10, "Kloviu brend", (double)1,"Clothes",
                new Date(2018, 02, 20), "Adibas",
                2000, 20));

        StoreController control = new StoreController(goods);
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