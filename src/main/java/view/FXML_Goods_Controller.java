package view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import controller.StoreController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
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

    ArrayList<Goods> founded;

    @FXML
    private TableView<?> tv_supply;

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
    void OnEnterPressed(KeyEvent event) throws Exception {
        if(event.getCode()== KeyCode.ENTER)
        {
            OnActionB_search(new ActionEvent());
        }
    }

        @FXML
    void OnActionB_search(ActionEvent event) throws Exception {

//            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXMLShop.fxml"));
//            Parent root = loader.load();
//            FXML_Shop_Controller control = loader.getController();
//            ArrayList<Goods> goods = control.getGoods();
//            founded =  StoreController.Search_in_category(goods,fld_search.getText());

        //FillingListView(founded);

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
        stage.setScene(scene);
        stage.show();
    }

    public void initialize(URL location, ResourceBundle resources) {
    }
}