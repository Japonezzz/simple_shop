package view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import controller.StoreController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import model.DataInfo;
import model.Goods;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class FXML_Goods_Controller implements Initializable{

    private ObservableList<Goods> Data = FXCollections.observableArrayList(DataInfo.getGoods());


    @FXML
    private TableView<Goods> tv_supply;

    @FXML
    private TableColumn<Goods, Integer> N_column;

    @FXML
    private TableColumn<Goods, String> NameColumn;

    @FXML
    private TableColumn<Goods, Double> Price_column;

    @FXML
    private GridPane main_grid;

    @FXML
    private JFXButton b_tomain;

    @FXML
    private JFXButton b_goods;

    @FXML
    private JFXButton b_supply;

    @FXML
    private JFXTextField fld_search;

        @FXML
    void OnActionB_search(ActionEvent event) throws Exception {

        ArrayList<Goods> founded = StoreController.Search_in_category(DataInfo.getGoods(), fld_search.getText());
        Fill_table(founded);
    }

    @FXML
    void On_Enter_pressed(KeyEvent event) throws Exception {
        if(event.getCode()== KeyCode.ENTER)
        {
            OnActionB_search(new ActionEvent());
        }
    }

    @FXML
    private JFXButton b_search;

    @FXML
    void GoToMainForm(ActionEvent event) throws Exception {
        FXML_Goods_Controller cont = new FXML_Goods_Controller();
        FXMLLoader loader = new FXMLLoader();
        loader.setController(cont);

        Parent root = loader.load(getClass().getResource("/FXMLShop.fxml"));

        Scene scene = new Scene(root);
        Stage stage = (Stage)main_grid.getScene().getWindow();
        stage.setTitle("Magazine");
        stage.setScene(scene);
        stage.show();
    }

    public void initialize(URL location, ResourceBundle resources) {

        Fill_table(DataInfo.getGoods());
    }

    public void Fill_table (ArrayList<Goods> goods)
    {
        ObservableList<Goods> Data = FXCollections.observableArrayList(goods);
        N_column.setCellValueFactory(new PropertyValueFactory<Goods, Integer>("id"));
        NameColumn.setCellValueFactory(new PropertyValueFactory<Goods, String>("name"));
        Price_column.setCellValueFactory(new PropertyValueFactory<Goods, Double>("price"));
        tv_supply.setItems(Data);
        tv_supply.getSortOrder().addAll(N_column);
    }
}