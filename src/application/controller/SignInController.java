package application.controller;

import application.MainApp;
import dao.mysql.AccountDaoImp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class SignInController {
    @FXML
    private TextField user;
    @FXML
    private TextField password;

    private Stage signInStage = new Stage();
    private AnchorPane signInBord;

    private ProductPanelController productPanelController = new ProductPanelController();
    private MainApp mainApp;

    public SignInController() {

    }
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    public void showSignIn() {
        FXMLLoader SignLoader = new FXMLLoader();
        SignInController controller = new SignInController();
        SignLoader.setLocation(MainApp.class.getResource("view/Signin.fxml"));
        try {
            signInBord = SignLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        signInStage.setScene(new Scene(signInBord));
        signInStage.setTitle("UserLogin");
        signInStage.show();
    }
    @FXML
    private void SingIn() {
        AccountDaoImp accountDaoImp = new AccountDaoImp();
        mainApp.account = accountDaoImp.findById(user.getText());

        if (mainApp.account != null &&
                mainApp.account.getPassword().equals(password.getText())) {
            signInStage.close();
            System.out.println("Success login!");
            productPanelController.setMainApp(mainApp);
        } else
            System.out.println("Field to login!");
    }

    @FXML
    private void handleClose() {
        signInStage.close();
    }
}
