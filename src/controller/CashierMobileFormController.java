package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.input.KeyEvent;

public class CashierMobileFormController {
    @FXML
    public JFXTextField tf_barcode_search;

    @FXML
    public JFXTextField tf_name_search;

    @FXML
    public TableView tb_mobiles;

    @FXML
    public JFXButton btnAddToBill;

    @FXML
    void initialize(){

    }

    public void tfTypeSearchAction(KeyEvent keyEvent) {
    }

    public void tfNameSearchAction(KeyEvent keyEvent) {
    }

    public void btnAddToBillOnAction(ActionEvent actionEvent) {
    }
}
