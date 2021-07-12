package application;

import application.model.Account;
import application.controller.SignInController;
import javafx.application.Application;
import javafx.stage.Stage;

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
