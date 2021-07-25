package application;

import application.controller.ProductPanelController;
import application.controller.SignInController;
import application.model.Account;
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
    public Account account;

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    private Stage stage = new Stage();

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    /* cannot new a controller to link mainApp and controller
    private SignInController signInController = new SignInController();
    private ProductPanelController productPanelController = new ProductPanelController();*/

    @Override
    public void start(Stage primaryStage) {
        try {
            showLoginPane();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showLoginPane() throws IOException{
        FXMLLoader loader = new FXMLLoader(
                MainApp.class.getResource("/application/view/Signin.fxml"));
        AnchorPane Pane = null;
        Pane = loader.load();

        SignInController controller = loader.getController();
        controller.setMainApp(this);

        Scene scene = new Scene(Pane);
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(event -> {
            System.out.println("Closing Stage");
        });
    }

    public void showProductPanel() {

    }

    public static void main(String[] args) {
        launch(args);
    }
}
