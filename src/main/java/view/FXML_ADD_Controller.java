package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class FXML_ADD_Controller implements Initializable {

    @FXML
    private Label label_name;

    @FXML
    private Label label_quntity;

    @FXML
    private Label label_desc;

    @FXML
    private Label label_price;

    @FXML
    private Label label_category;

    @FXML
    private Label label_guarantee;

    @FXML
    private Label label_OS;

    @FXML
    private Label label_CPU;

    @FXML
    private Label label_RAM;

    @FXML
    private Label label_diagonal;

    @FXML
    private Label label_timework;

    @FXML
    private JFXTextField field_name;

    @FXML
    private JFXTextField field_quantity;

    @FXML
    private JFXTextField field_desc;

    @FXML
    private JFXTextField field_price;

    @FXML
    private JFXTextField field_category;

    @FXML
    private JFXTextField field_gurantee;

    @FXML
    private JFXTextField field_os;

    @FXML
    private JFXTextField field_cpu;

    @FXML
    private JFXTextField field_ram;

    @FXML
    private JFXTextField field_diagonal;

    @FXML
    private JFXTextField field_timework;

    @FXML
    private Label label_cpu_gp;

    @FXML
    private JFXTextField field_cpugp;

    @FXML
    private Label label_ram_gp;

    @FXML
    private JFXTextField field_ramgp;

    @FXML
    private Label label_cpu_gp1;

    @FXML
    private JFXTextField field_dateterm;

    @FXML
    private Label label_sort;

    @FXML
    private JFXTextField field_sort;

    @FXML
    private Label label_brend;

    @FXML
    private JFXTextField field_brend;

    @FXML
    private Label label_creationdate;

    @FXML
    private JFXTextField field_creationdate;

    @FXML
    void OnAction_Button_Cancel(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/FXMLShop.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Magazine");
        stage.setScene(scene);
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    void onAction_Button_OK(ActionEvent event) {

    }


    public void initialize(URL location, ResourceBundle resources) {

    }
}
