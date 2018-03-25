package view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class FXML_Shop_Controller implements Initializable{

    @FXML
    private JFXTreeTableView<?> ttv_info;

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
    private JFXListView<?> lv_category;

    @FXML
    void OnActionBtn_goods(ActionEvent event) {

    }

    @FXML
    void OnActionFld_search(ActionEvent event) {

    }

    @FXML
    void OnActionB_search(ActionEvent event) {

    }

    @FXML
    void OnActionRB_up(ActionEvent event) {

    }

    @FXML
    void OnActionRB_down(ActionEvent event) {

    }

    public void initialize(URL location, ResourceBundle resources) {

    }
}
