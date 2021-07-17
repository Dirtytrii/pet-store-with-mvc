package application.controller;

import application.MainApp;
import dao.mysql.AccountDaoImp;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


/**
 * @author DELL
 */
public class SignInController {
    @FXML
    private TextField user;
    @FXML
    private TextField password;

    private MainApp mainApp;

    public MainApp getMainApp() {
        return mainApp;
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    public void SingIn() {
        AccountDaoImp accountDaoImp = new AccountDaoImp();
        mainApp.account = accountDaoImp.findById(user.getText());

        if (user.getText().equals("")) {
            ;
        } else if (password.getText().equals("")) {
            ;
        } else if (mainApp.account != null &&
                mainApp.account.getPassword().equals(password.getText())) {
            System.out.println("Success login!");
            mainApp.showProductPanel();
        } else {
            System.out.println("Field to login!");
        }
    }

    /**
     * Event Listener on Button[#btnCancel].onAction
     */
    @FXML
    public void handleCancel(ActionEvent event) {
        Platform.exit();
    }
}
