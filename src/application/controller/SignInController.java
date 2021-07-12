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

    private AnchorPane signInBord;
    private Stage signInStage = new Stage();

    private MainApp mainApp;
    private ProductPanelController productPanelController = new ProductPanelController();


    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
        showSignIn();
    }

    //the interface show in MainApp.java
    //return a AnchorPane to MainApp to show it
    private void showSignIn() {
        FXMLLoader SignLoader = new FXMLLoader();
        SignLoader.setLocation(MainApp.class.getResource("view/Signin.fxml"));
        try {
            signInBord = SignLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //show sign in interface
        signInStage.setScene(new Scene(signInBord));
        signInStage.setTitle("UserLogin");
        signInStage.show();

        signInStage.setOnCloseRequest(event -> {
            System.out.println("Closing Stage");
        });
    }

    @FXML
    public void SingIn() {
        AccountDaoImp accountDaoImp = new AccountDaoImp();
        mainApp.account = accountDaoImp.findById(user.getText());

        if (user.getText().equals("")) ;
        else if (password.getText().equals("")) ;
        else if (mainApp.account != null &&
                mainApp.account.getPassword().equals(password.getText())) {
            System.out.println("Success login!");
            signInStage.hide();

            //wait for sign in
            //if success login,change scene
            //change the sign panel to product panel
            productPanelController.setMainApp(mainApp);

        } else
            System.out.println("Field to login!");
    }

    @FXML
    private void handleClose() {
        signInStage.close();
    }
}
