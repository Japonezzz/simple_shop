package view;

import com.jfoenix.controls.JFXDatePicker;
import enums.CategoryType;
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
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Clothes;
import model.DataInfo;
import model.DateTerm;
import model.Eating.SweetDrinks;
import model.Eating.Vegetables;
import model.Eating.Water;
import model.Goods;
import model.Technics.CPU;
import model.Technics.Cellphone;
import model.Technics.Computer;
import model.Technics.RAM;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;

public class FXML_ADD_Controller implements Initializable {

    static Goods g;
    private int count = 100;

    @FXML
    private DatePicker field_creationdate;

    @FXML
    private DatePicker field_dateterm;


    @FXML
    private Label label_wcount;

    @FXML
    private Label label_ccount;

    @FXML
    private JFXTextField field_wcount;

    @FXML
    private JFXTextField field_ccount;


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
    private Label label_daterm;

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
     void onAction_Button_OK(ActionEvent event) throws Exception{

        Integer advisor = combo_categories.getSelectionModel().getSelectedIndex();
        switch (advisor)
        {
            case 0:
            {
                if(field_name.getText()=="" || field_quantity.getText() == "" || field_desc.getText() == "" || field_price.getText() == ""
                        || field_gurantee.getText()=="" || field_ram.getText()=="" || field_ram2.getText()=="" || field_cpu.getText() ==""
                        || field_cpu2.getText()=="" || field_cpugp.getText()=="" || field_cpugp2.getText()=="" || field_ramgp.getText()==""
                        || field_ramgp2.getText()=="")
                {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Warning");
                    alert.setContentText("You didn't enter all data");
                    alert.setHeaderText(null);
                    alert.showAndWait();
                }
                else
                {
                    g = new Computer(++count, field_name.getText(),Integer.valueOf(field_quantity.getText()), field_desc.getText(),
                            Double.valueOf(field_price.getText()), CategoryType.Computer.toString(), Integer.valueOf(field_gurantee.getText()),
                            new RAM(Integer.valueOf(field_ram.getText()), field_ram2.getText()), new CPU(Integer.valueOf(field_cpu.getText()),
                            Double.valueOf(field_cpu2.getText())), new CPU(Integer.valueOf(field_cpugp.getText()), Double.valueOf(field_cpugp2.getText())),
                            new RAM(Integer.valueOf(field_ramgp.getText()), field_ramgp2.getText()));
                }
                break;
            }

            case 1:
            {
                if(field_name.getText()=="" || field_quantity.getText() == "" || field_desc.getText() == "" || field_price.getText() == ""
                        || field_gurantee.getText()=="" || field_ram.getText()=="" || field_ram2.getText()=="" || field_cpu.getText() ==""
                        || field_cpu2.getText()=="" || field_diagonal.getText()=="" || field_os.getText()=="" || field_timework.getText()=="")
                {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Warning");
                    alert.setContentText("You didn't enter all data");
                    alert.setHeaderText(null);
                    alert.showAndWait();
                }
                else
                {
                    g = new Cellphone(++count, field_name.getText(),Integer.valueOf(field_quantity.getText()), field_desc.getText(),
                            Double.valueOf(field_price.getText()), CategoryType.CellPhone.toString(), Integer.valueOf(field_gurantee.getText()),
                            new RAM(Integer.valueOf(field_ram.getText()), field_ram2.getText()), new CPU(Integer.valueOf(field_cpu.getText()),
                            Double.valueOf(field_cpu2.getText())), field_os.getText(), Double.valueOf(field_diagonal.getText()),
                            Integer.valueOf(field_timework.getText()));

                }
                break;
            }

            case 2:
            {
                if(field_name.getText()=="" || field_quantity.getText() == "" || field_desc.getText() == "" || field_price.getText() == ""
                        || field_brend.getText()=="" || field_wcount.getText()=="" || field_ccount.getText() =="")
                {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Warning");
                    alert.setContentText("You didn't enter all data");
                    alert.setHeaderText(null);
                    alert.showAndWait();
                }
                else
                {
                    g = new Clothes(++count, field_name.getText(),Integer.valueOf(field_quantity.getText()), field_desc.getText(),
                            Double.valueOf(field_price.getText()), CategoryType.Clothes.toString(), new Date(2018,03,20),
                            field_brend.getText(), Integer.valueOf(field_wcount.getText()), Integer.valueOf(field_ccount.getText())) ;

                }
                break;
            }

            case 3:
            {
                if(field_name.getText()=="" || field_quantity.getText() == "" || field_desc.getText() == "" || field_price.getText() == ""
                        || field_sort.getText() == "")
                {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Warning");
                    alert.setContentText("You didn't enter all data");
                    alert.setHeaderText(null);
                    alert.showAndWait();
                }
                else
                {
                    g = new Vegetables(++count, field_name.getText(),Integer.valueOf(field_quantity.getText()), field_desc.getText(),
                            Double.valueOf(field_price.getText()), CategoryType.Vegetables.toString(),
                            new DateTerm( new Date(2018,03,20), (double)15, 4), field_sort.getText());

                }
                break;
            }

            case 4:
            {
                if(field_name.getText()=="" || field_quantity.getText() == "" || field_desc.getText() == "" || field_price.getText() == "")
                {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Warning");
                    alert.setContentText("You didn't enter all data");
                    alert.setHeaderText(null);
                    alert.showAndWait();
                }
                else
                {
                    g = new Water(++count, field_name.getText(),Integer.valueOf(field_quantity.getText()), field_desc.getText(),
                            Double.valueOf(field_price.getText()), CategoryType.Water.toString());

                }
                break;
            }

            case 5:
            {
                if(field_name.getText()=="" || field_quantity.getText() == "" || field_desc.getText() == "" || field_price.getText() == "")
                {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Warning");
                    alert.setContentText("You didn't enter all data");
                    alert.setHeaderText(null);
                    alert.showAndWait();
                }
                else
                {
                    g = new SweetDrinks(++count, field_name.getText(),Integer.valueOf(field_quantity.getText()), field_desc.getText(),
                            Double.valueOf(field_price.getText()), CategoryType.SweetDrinks.toString(),
                            new DateTerm( new Date(2018,03,20), (double)15, 4));

                }
                break;
            }

            case 6:
            {
                if(field_name.getText()=="" || field_quantity.getText() == "" || field_desc.getText() == "" || field_price.getText() == "")
                {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Warning");
                    alert.setContentText("You didn't enter all data");
                    alert.setHeaderText(null);
                    alert.showAndWait();
                }
                else
                {

                    g = new SweetDrinks(++count, field_name.getText(),Integer.valueOf(field_quantity.getText()), field_desc.getText(),
                           Double.valueOf(field_price.getText()), CategoryType.SweetDrinks.toString(),
                           new DateTerm(new Date(2018,03,20), (double)15, 4));
                }
                break;
            }
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information");
        alert.setContentText("Good successfully added");
        alert.setHeaderText(null);
        alert.showAndWait();

        Parent root = FXMLLoader.load(getClass().getResource("/FXMLShop.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Magazine");
        stage.setScene(scene);
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();

    }

    @FXML
    void OnAction_categories(ActionEvent event) {

        Integer selected = combo_categories.getSelectionModel().getSelectedIndex();

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
                field_category.setText(combo_categories.getSelectionModel().getSelectedItem());
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

                field_os.setVisible(false);
                label_OS.setVisible(false);
                field_brend.setVisible(false);
                label_brend.setVisible(false);
                field_dateterm.setVisible(false);
                label_daterm.setVisible(false);
                field_diagonal.setVisible(false);
                label_diagonal.setVisible(false);
                field_timework.setVisible(false);
                label_timework.setVisible(false);
                field_sort.setVisible(false);
                label_sort.setVisible(false);
                field_creationdate.setVisible(false);
                label_creationdate.setVisible(false);
                field_wcount.setVisible(false);
                label_wcount.setVisible(false);
                field_ccount.setVisible(false);
                label_ccount.setVisible(false);

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
                field_category.setText(combo_categories.getSelectionModel().getSelectedItem());
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

                label_cpu_gp.setVisible(false);
                field_cpugp.setVisible(false);
                field_cpugp2.setVisible(false);
                label_ram_gp.setVisible(false);
                field_ramgp.setVisible(false);
                field_ramgp2.setVisible(false);
                field_brend.setVisible(false);
                label_brend.setVisible(false);
                field_dateterm.setVisible(false);
                label_daterm.setVisible(false);
                field_sort.setVisible(false);
                label_sort.setVisible(false);
                field_creationdate.setVisible(false);
                label_creationdate.setVisible(false);
                field_wcount.setVisible(false);
                label_wcount.setVisible(false);
                field_ccount.setVisible(false);
                label_ccount.setVisible(false);

                break;
            }

            case 2:
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
                field_category.setText(combo_categories.getSelectionModel().getSelectedItem());
                label_guarantee.setVisible(false);
                field_gurantee.setVisible(false);
                label_RAM.setVisible(false);
                field_ram.setVisible(false);
                field_ram2.setVisible(false);
                label_CPU.setVisible(false);
                field_cpu.setVisible(false);
                field_cpu2.setVisible(false);
                label_OS.setVisible(false);
                field_os.setVisible(false);
                label_diagonal.setVisible(false);
                field_diagonal.setVisible(false);
                label_timework.setVisible(false);
                field_timework.setVisible(false);

                label_cpu_gp.setVisible(false);
                field_cpugp.setVisible(false);
                field_cpugp2.setVisible(false);
                label_ram_gp.setVisible(false);
                field_ramgp.setVisible(false);
                field_ramgp2.setVisible(false);
                field_brend.setVisible(true);
                label_brend.setVisible(true);
                field_dateterm.setVisible(false);
                label_daterm.setVisible(false);
                field_sort.setVisible(false);
                label_sort.setVisible(false);
                field_creationdate.setVisible(true);
                label_creationdate.setVisible(true);
                field_wcount.setVisible(true);
                label_wcount.setVisible(true);
                field_ccount.setVisible(true);
                label_ccount.setVisible(true);

                break;
            }

            case 3:
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
                field_category.setText(combo_categories.getSelectionModel().getSelectedItem());
                label_guarantee.setVisible(false);
                field_gurantee.setVisible(false);
                label_RAM.setVisible(false);
                field_ram.setVisible(false);
                field_ram2.setVisible(false);
                label_CPU.setVisible(false);
                field_cpu.setVisible(false);
                field_cpu2.setVisible(false);
                label_OS.setVisible(false);
                field_os.setVisible(false);
                label_diagonal.setVisible(false);
                field_diagonal.setVisible(false);
                label_timework.setVisible(false);
                field_timework.setVisible(false);

                label_cpu_gp.setVisible(false);
                field_cpugp.setVisible(false);
                field_cpugp2.setVisible(false);
                label_ram_gp.setVisible(false);
                field_ramgp.setVisible(false);
                field_ramgp2.setVisible(false);
                field_brend.setVisible(false);
                label_brend.setVisible(false);
                field_dateterm.setVisible(true);
                label_daterm.setVisible(true);
                field_sort.setVisible(true);
                label_sort.setVisible(true);
                field_creationdate.setVisible(false);
                label_creationdate.setVisible(false);
                field_wcount.setVisible(false);
                label_wcount.setVisible(false);
                field_ccount.setVisible(false);
                label_ccount.setVisible(false);

                break;
            }

            case 4:
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
                field_category.setText(combo_categories.getSelectionModel().getSelectedItem());
                label_guarantee.setVisible(false);
                field_gurantee.setVisible(false);
                label_RAM.setVisible(false);
                field_ram.setVisible(false);
                field_ram2.setVisible(false);
                label_CPU.setVisible(false);
                field_cpu.setVisible(false);
                field_cpu2.setVisible(false);
                label_OS.setVisible(false);
                field_os.setVisible(false);
                label_diagonal.setVisible(false);
                field_diagonal.setVisible(false);
                label_timework.setVisible(false);
                field_timework.setVisible(false);

                label_cpu_gp.setVisible(false);
                field_cpugp.setVisible(false);
                field_cpugp2.setVisible(false);
                label_ram_gp.setVisible(false);
                field_ramgp.setVisible(false);
                field_ramgp2.setVisible(false);
                field_brend.setVisible(false);
                label_brend.setVisible(false);
                field_dateterm.setVisible(false);
                label_daterm.setVisible(false);
                field_sort.setVisible(false);
                label_sort.setVisible(false);
                field_creationdate.setVisible(false);
                label_creationdate.setVisible(false);
                field_wcount.setVisible(false);
                label_wcount.setVisible(false);
                field_ccount.setVisible(false);
                label_ccount.setVisible(false);

                break;
            }

            case 5:
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
                field_category.setText(combo_categories.getSelectionModel().getSelectedItem());
                label_guarantee.setVisible(false);
                field_gurantee.setVisible(false);
                label_RAM.setVisible(false);
                field_ram.setVisible(false);
                field_ram2.setVisible(false);
                label_CPU.setVisible(false);
                field_cpu.setVisible(false);
                field_cpu2.setVisible(false);
                label_OS.setVisible(false);
                field_os.setVisible(false);
                label_diagonal.setVisible(false);
                field_diagonal.setVisible(false);
                label_timework.setVisible(false);
                field_timework.setVisible(false);

                label_cpu_gp.setVisible(false);
                field_cpugp.setVisible(false);
                field_cpugp2.setVisible(false);
                label_ram_gp.setVisible(false);
                field_ramgp.setVisible(false);
                field_ramgp2.setVisible(false);
                field_brend.setVisible(false);
                label_brend.setVisible(false);
                field_dateterm.setVisible(true);
                label_daterm.setVisible(true);
                field_sort.setVisible(false);
                label_sort.setVisible(false);
                field_creationdate.setVisible(false);
                label_creationdate.setVisible(false);
                field_wcount.setVisible(false);
                label_wcount.setVisible(false);
                field_ccount.setVisible(false);
                label_ccount.setVisible(false);

                break;
            }

            case 6:
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
                field_category.setText(combo_categories.getSelectionModel().getSelectedItem());
                label_guarantee.setVisible(false);
                field_gurantee.setVisible(false);
                label_RAM.setVisible(false);
                field_ram.setVisible(false);
                field_ram2.setVisible(false);
                label_CPU.setVisible(false);
                field_cpu.setVisible(false);
                field_cpu2.setVisible(false);
                label_OS.setVisible(false);
                field_os.setVisible(false);
                label_diagonal.setVisible(false);
                field_diagonal.setVisible(false);
                label_timework.setVisible(false);
                field_timework.setVisible(false);

                label_cpu_gp.setVisible(false);
                field_cpugp.setVisible(false);
                field_cpugp2.setVisible(false);
                label_ram_gp.setVisible(false);
                field_ramgp.setVisible(false);
                field_ramgp2.setVisible(false);
                field_brend.setVisible(false);
                label_brend.setVisible(false);
                field_dateterm.setVisible(true);
                label_daterm.setVisible(true);
                field_sort.setVisible(false);
                label_sort.setVisible(false);
                field_creationdate.setVisible(false);
                label_creationdate.setVisible(false);
                field_wcount.setVisible(false);
                label_wcount.setVisible(false);
                field_ccount.setVisible(false);
                label_ccount.setVisible(false);

                break;
            }
        }
    }


    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> items = FXCollections.observableArrayList (
                "PC", "Смартфони", "Одяг", "Овочі", "Вода", "Солодка вода", "Солодощі");
        combo_categories.setItems(items);
    }

    public Goods send()
    {
        return g;
    }
}
