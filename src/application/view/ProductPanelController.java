package application.view;

import application.MainApp;
import application.model.Product;
import dao.ProductDao;
import dao.mysql.ProductDaoImp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductPanelController {
    private List<Product> products = null;
    private ProductDao dao = new ProductDaoImp();
    //cart type (just for u to know all the type)
    private final String[] cartType = {"鱼类", "狗类", "爬行类", "猫类", "鸟类"};
    @FXML//查询商品类型列
    private ComboBox<String> comboBox;

    private Stage productPanel = new Stage();
    private AnchorPane anchorPane;

    private MainApp mainApp;
    //creat a map used as save cart with type
    private Map<String, Integer> cart = new HashMap<String, Integer>();

    public void initProductPane() {
        //初始化ComboBox
        comboBox = new ComboBox<>();

        //add the cart type at comboBox,not work here,it actually worked in ProductPane.fxml
        for (int i = 0; i < cartType.length; i++)
            comboBox.setValue(cartType[i]);
        /*should do something to filed all the pane and massage*/

    }

    //only when user successfully login this function will be called
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
        initProductPane();
        showProductPanel();
    }


    private void showProductPanel() {
        FXMLLoader ProductPanelLoader = new FXMLLoader();
        ProductPanelLoader.setLocation(MainApp.class.getResource("view/ProductPanel.fxml"));
        try {
            anchorPane = ProductPanelLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        productPanel.setScene(new Scene(anchorPane));
        productPanel.setTitle("productPanel");
        productPanel.show();
    }

    @FXML
    private void reload() {

    }

    @FXML
    private void selectByType() {

    }


}
