package application;

import application.model.Account;
import application.view.SignInController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    public static Account account;

    private SignInController signInController = new SignInController();

    @Override
    public void start(Stage primaryStage) {

        signInController.setMainApp(this);
        signInController.showSignIn();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
