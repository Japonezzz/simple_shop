import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Subscription.SubscriptionManager;
import model.Subscription.User;

import java.util.Date;

public class MainClass extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/FXMLShop.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("/FXMLUsers.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Magazine");
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}