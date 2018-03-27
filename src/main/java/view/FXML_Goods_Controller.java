package view;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class FXML_Goods_Controller implements Initializable{


    @FXML
    private TableView<?> tv_supply;

    @FXML
    private JFXButton b_tomain;

    @FXML
    private JFXButton b_goods;

    @FXML
    private JFXButton b_supply;

    @FXML
    void GoToMainForm(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/FXMLShop.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Magazine");
        stage.setScene(scene);
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    public void initialize(URL location, ResourceBundle resources) {

    }
}