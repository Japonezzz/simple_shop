package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class FXML_ADD_Controller implements Initializable {

    @FXML
    private AnchorPane main_pain;

    @FXML
    private JFXTextField field_ram2;

    @FXML
    private JFXTextField field_cpu2;

    @FXML
    private JFXTextField field_ramgp2;

    @FXML
    private JFXTextField field_cpugp2;

    @FXML
    private ComboBox<String> combo_categories;

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

    @FXML
    void OnAction_categories(ActionEvent event) {
        
        Integer selected = combo_categories.getSelectionModel().getSelectedIndex();
        for (Node a:main_pain.getChildren()) {
            if(!(a.getId()!="combo_categories") || !(a.getId()!="main_label") || !(a.getId()!="Add_button") || !(a.getId()!="Cancel_button"))
                a.setVisible(false);
        }
        switch (selected)
        {
            case 0:
            {
                label_name.setVisible(true);
                field_name.setVisible(true);
                label_quntity.setVisible(true);
                field_quantity.setVisible(true);
                label_desc.setVisible(true);
                field_desc.setVisible(true);
                label_price.setVisible(true);
                field_price.setVisible(true);
                label_category.setVisible(true);
                field_category.setVisible(true);
                label_guarantee.setVisible(true);
                field_gurantee.setVisible(true);
                label_RAM.setVisible(true);
                field_ram.setVisible(true);
                field_ram2.setVisible(true);
                label_CPU.setVisible(true);
                field_cpu.setVisible(true);
                field_cpu2.setVisible(true);
                label_cpu_gp.setVisible(true);
                field_cpugp.setVisible(true);
                field_cpugp2.setVisible(true);
                label_ram_gp.setVisible(true);
                field_ramgp.setVisible(true);
                field_ramgp2.setVisible(true);
                break;
            }
            case 1:
            {
                label_name.setVisible(true);
                field_name.setVisible(true);
                label_quntity.setVisible(true);
                field_quantity.setVisible(true);
                label_desc.setVisible(true);
                field_desc.setVisible(true);
                label_price.setVisible(true);
                field_price.setVisible(true);
                label_category.setVisible(true);
                field_category.setVisible(true);
                label_guarantee.setVisible(true);
                field_gurantee.setVisible(true);
                label_RAM.setVisible(true);
                field_ram.setVisible(true);
                field_ram2.setVisible(true);
                label_CPU.setVisible(true);
                field_cpu.setVisible(true);
                field_cpu2.setVisible(true);
                label_OS.setVisible(true);
                field_os.setVisible(true);
                label_diagonal.setVisible(true);
                field_diagonal.setVisible(true);
                label_timework.setVisible(true);
                field_timework.setVisible(true);
            }
        }
    }


    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> items = FXCollections.observableArrayList (
                "PC", "Смартфони", "Одяг", "Овочі", "Вода", "Солодка вода", "Солодощі");
        combo_categories.setItems(items);

    }
}
