package application;

import application.controller.ProductPanelController;
import application.model.Account;
import application.controller.SignInController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author cloudJiang
 */
public class MainApp extends Application {
    public static Account account;

    private SignInController signInController = new SignInController();
    private ProductPanelController productPanelController = new ProductPanelController();

    @Override
    public void start(Stage primaryStage) {
        signInController.setMainApp(this);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
