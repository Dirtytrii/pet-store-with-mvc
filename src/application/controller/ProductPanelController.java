package application.controller;

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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author DELL
 */
public class ProductPanelController {
    private List<Product> products = null;
    private ProductDao dao = new ProductDaoImp();

    private final String[] cartType = {"鱼类", "狗类", "爬行类", "猫类", "鸟类"};
    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private Label productMarketPrice;
    @FXML
    private Label productPrice;
    @FXML
    private Label productDescription;
    @FXML
    private TableColumn productNumber;
    @FXML
    private TableColumn productType;
    @FXML
    private TableColumn productCNName;
    @FXML
    private TableColumn productENName;

    private MainApp mainApp;
    /**
     * creat a map used as save cart with type
     */
    private Map<String, Integer> cart = new HashMap<String, Integer>();

    /**
     * only when user successfully login this function will be called
     */


}
