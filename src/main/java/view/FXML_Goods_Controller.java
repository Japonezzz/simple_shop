package view;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;

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

    public void initialize(URL location, ResourceBundle resources) {

    }
}
