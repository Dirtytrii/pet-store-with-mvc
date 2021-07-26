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
import javafx.scene.control.*;
import javafx.scene.control.cell.MapValueFactory;
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
    private TableView<Product> productTable;
    @FXML
    private TableColumn<Product, String> productNumbers = new TableColumn<>();
    @FXML
    private TableColumn<Product, String> productTypes = new TableColumn<>();
    @FXML
    private TableColumn<Product, String> productCNNames = new TableColumn<>();
    @FXML
    private TableColumn<Product, String> productENNames = new TableColumn<>();
    /***
     * only when product is selected,this three label will be fill
     */
    @FXML
    private Label productMarketPrice;
    @FXML
    private Label productPrice;
    @FXML
    private Label productDescription;

    private MainApp mainApp;

    public MainApp getMainApp() {
        return mainApp;
    }

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
        initPanel();
    }

    /**
     * creat a map used as save cart with type
     */
    private Map<String, Integer> cart = new HashMap<String, Integer>();

    /**
     * only when user successfully login this function will be called
     * the product table will be fill
     */
    private void initPanel() {
        //fill the combobox
        ObservableList<String> types = FXCollections.observableArrayList();
        comboBox.setTooltip(new Tooltip("Select the type of products"));
        types.addAll(cartType);
        comboBox.setItems(types);

        // Initialize the product table with the four columns.
        products = dao.findAll();

        System.out.println(products.get(0));
        for (Product product : products) {
            productNumbers.setCellValueFactory(new MapValueFactory(product.getProductid()));
        }
    }

    @FXML
    private void selectButton() {

    }

    @FXML
    private void restartButton() {

    }

    @FXML
    private void addToShoppingCart() {

    }

    @FXML
    private void checkShoppingCart() {

    }

}
