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
    @FXML
    private JFXTextField text_id;
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
    User onAction_btn_add_user(ActionEvent event) {
        if(text_id.getText()!=null | text_name.getText()!=null | text_email.getText() != null|text_id.getText().matches("\\d+")) {
            int id = Integer.parseInt(text_id.getText());
            String name = text_name.getText();
            String email = text_email.getText();
            Date date_of_reg = new Date();
            boolean shouldsend = check_shouldsend.isSelected();
            User adding = new User(id, name, email, date_of_reg, shouldsend);
            System.out.println(adding.getId());
            return adding;
        }
        else
            return null;

        //if(isValodationEmail(text_email.getText()))
            //subs.addUser(new User(text_name.getText(),text_email.getText(),date.getTime(),check_shouldsend.getBo));
        //else return;
    }

    public void initialize(URL location, ResourceBundle resources) {
        subs = new SubscriptionManager();
    }
}
