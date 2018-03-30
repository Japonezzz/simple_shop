package view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import model.Subscription.SubscriptionManager;
import model.Subscription.User;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

public class FXMLUsers_Controller implements Initializable {

    @FXML
    private JFXButton btn_add_user;

    @FXML
    private JFXTextField text_name;

    @FXML
    private CheckBox check_shouldsend;

    @FXML
    private JFXTextField text_email;

    public JFXTextField getText_name() {
        return text_name;
    }

    private Boolean isValodationEmail(String text_email) {
        if(text_email.contains("@")&&text_email.contains("."))
            return false;
        return true;
    }
    private Date date = new Date();
    private SubscriptionManager subs;
    @FXML
    void onAction_btn_add_user(ActionEvent event) {
        System.out.println(text_name.getText());

        //if(isValodationEmail(text_email.getText()))
            //subs.addUser(new User(text_name.getText(),text_email.getText(),date.getTime(),check_shouldsend.getBo));
        //else return;
    }

    public void initialize(URL location, ResourceBundle resources) {
        subs = new SubscriptionManager();
    }
}
