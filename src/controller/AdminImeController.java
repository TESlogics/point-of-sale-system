package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import model.Ime;
import model.ProductItem;

public class AdminImeController {

	@FXML
	public JFXButton bt_new;

	@FXML
	public JFXButton bt_ime_add;

	@FXML
	public JFXTextField tf_ime_number;

	@FXML
	public JFXTextField tf_color;

	@FXML
	public JFXTextField tf_ram;

	@FXML
	public JFXTextField tf_rom;

	@FXML
	public JFXButton bt_ime_update;

	@FXML
	public JFXTextField tf_barcode;

	@FXML
	public JFXTextField tf_price;

	@FXML
	public JFXTextField tf_date_added;

	@FXML
	public JFXTextField tf_stock;

	@FXML
	public JFXComboBox cbo_category;

	@FXML
	public JFXComboBox cbo_supplier;

	@FXML
	public JFXTextField tf_name_search;

	@FXML
	public JFXTextField tf_barcode_search;

	@FXML
	public JFXComboBox cbo_mobile_brand;

	@FXML
	public JFXTextField tf_ime;

	@FXML
	public JFXTextField tf_selling_price;

	@FXML
	public JFXTextField tf_buying_price;

	@FXML
	private TableView<Ime> tb_ime;

	private TableColumn<Ime, String> col_ime_number;

	private TableColumn<Ime, String> col_mobile_brand;

	private TableColumn<Ime, String> col_item_barcode;

	private TableColumn<Ime, String> col_item_categroy;

	private TableColumn<Ime, String> col_item_supplier;

	private TableColumn<Ime, String> col_item_dateadded;

	private TableColumn<Ime, String> col_item_stock;

	private TableColumn<Ime, String> col_item_price;

	private TableColumn<Ime, String> col_color;

	private TableColumn<Ime, String> col_rom;

	private TableColumn<Ime, String> col_ram;

	private TableColumn<Ime, String> col_buying_price;

	private TableColumn<Ime, String> col_selling_price;

	@FXML
	void initialize(){
		assert cbo_mobile_brand != null : "fx:id=\"cbo_mobile_brand\" was not injected: check your FXML file 'Admin_ime.fxml'.";
		assert tf_buying_price != null : "fx:id=\"tf_buying_price\" was not injected: check your FXML file 'Admin_ime.fxml'.";
		assert tf_selling_price != null : "fx:id=\"tf_selling_price\" was not injected: check your FXML file 'Admin_ime.fxml'.";
		assert tf_ime != null : "fx:id=\"tf_ime\" was not injected: check your FXML file 'Admin_ime.fxml'.";
		assert tb_ime != null : "fx:id=\"tb_ime\" was not injected: check your FXML file 'Admin_ime.fxml'.";
		assert bt_ime_add != null : "fx:id=\"bt_ime_add\" was not injected: check your FXML file 'Admin_ime.fxml'.";
		assert bt_ime_update != null : "fx:id=\"bt_ime_update\" was not injected: check your FXML file 'Admin_ime.fxml'.";
		assert tf_ime_number != null : "fx:id=\"tf_ime_number\" was not injected: check your FXML file 'Admin_ime.fxml'.";
		assert tf_color != null : "fx:id=\"tf_color\" was not injected: check your FXML file 'Admin_ime.fxml'.";
		assert tf_ram != null : "fx:id=\"tf_ram\" was not injected: check your FXML file 'Admin_ime.fxml'.";
		assert tf_rom != null : "fx:id=\"tf_rom\" was not injected: check your FXML file 'Admin_ime.fxml'.";
		assert bt_new != null : "fx:id=\"bt_new\" was not injected: check your FXML file 'Admin_ime.fxml'.";

		col_item_barcode = new TableColumn<Ime, String>("Barcode");
		col_mobile_brand = new TableColumn<Ime, String>("Mobile Brand");
		col_buying_price = new TableColumn<Ime, String>("Buying Price");
		col_selling_price = new TableColumn<Ime, String>("Selling Price");
		col_color = new TableColumn<Ime, String>("Color");
		col_ram = new TableColumn<Ime, String>("Ram");
		col_rom = new TableColumn<Ime, String>("Rom");
		col_ime_number = new TableColumn<Ime, String>("Mobile Number");
		col_item_categroy = new TableColumn<Ime, String>("Category");
		col_item_supplier = new TableColumn<Ime, String>("Supplier");
		col_item_dateadded = new TableColumn<Ime, String>("Date Added");
		col_item_stock = new TableColumn<Ime, String>("Stock");
		col_item_price = new TableColumn<Ime, String>("Price");

		col_item_barcode.setMinWidth(180.0);
		col_buying_price.setMinWidth(180.0);
		col_selling_price.setMinWidth(180.0);
		col_mobile_brand.setMinWidth(180.0);
		col_color.setMinWidth(180.0);
		col_ram.setMinWidth(180.0);
		col_rom.setMinWidth(180.0);
		col_ime_number.setMinWidth(180.0);
		col_item_categroy.setMinWidth(180.0);
		col_item_supplier.setMinWidth(180.0);
		col_item_dateadded.setMinWidth(180.0);
		col_item_stock.setMinWidth(180.0);
		col_item_price.setMinWidth(180.0);

		col_item_barcode.setStyle("-fx-font-size: 18");
		col_mobile_brand.setStyle("-fx-font-size: 18");
		col_buying_price.setStyle("-fx-font-size: 18");
		col_selling_price.setStyle("-fx-font-size: 18");
		col_color.setStyle("-fx-font-size: 18");
		col_ram.setStyle("-fx-font-size: 18");
		col_rom.setStyle("-fx-font-size: 18");
		col_ime_number.setStyle("-fx-font-size: 18");
		col_item_categroy.setStyle("-fx-font-size: 18");
		col_item_supplier.setStyle("-fx-font-size: 18");
		col_item_dateadded.setStyle("-fx-font-size: 18");
		col_item_stock.setStyle("-fx-font-size: 18");
		col_item_price.setStyle("-fx-font-size: 18");

		col_item_barcode.setCellValueFactory(
				new PropertyValueFactory<Ime, String>("barcode"));
		col_mobile_brand.setCellValueFactory(
				new PropertyValueFactory<Ime, String>("mobileBrand"));
		col_buying_price.setCellValueFactory(
				new PropertyValueFactory<Ime, String>("buyingPrice"));
		col_selling_price.setCellValueFactory(
				new PropertyValueFactory<Ime, String>("sellingPrice"));
		col_color.setCellValueFactory(
				new PropertyValueFactory<Ime, String>("color"));
		col_ram.setCellValueFactory(
				new PropertyValueFactory<Ime, String>("ram"));
		col_rom.setCellValueFactory(
				new PropertyValueFactory<Ime, String>("rom"));
		col_ime_number.setCellValueFactory(
				new PropertyValueFactory<Ime, String>("mobile Number"));
		col_item_categroy.setCellValueFactory(
				new PropertyValueFactory<Ime, String>("category"));
		col_item_supplier.setCellValueFactory(
				new PropertyValueFactory<Ime, String>("supplier"));
		col_item_dateadded.setCellValueFactory(
				new PropertyValueFactory<Ime, String>("dateAdded"));
		col_item_stock.setCellValueFactory(
				new PropertyValueFactory<Ime, String>("stock"));
		col_item_price.setCellValueFactory(
				new PropertyValueFactory<Ime, String>("price"));

		tb_ime.getColumns().addAll(col_item_barcode
				,col_mobile_brand
				,col_buying_price
				,col_selling_price
				,col_color
				,col_ram
				,col_rom
				,col_ime_number
				,col_item_categroy
				,col_item_supplier
				,col_item_dateadded
				,col_item_stock
				,col_item_price);
	}

	public void onbtUpdateAction(ActionEvent actionEvent) {
	}

	public void onBtAddAction(ActionEvent actionEvent) {
	}

	public void onbtNewAction(ActionEvent actionEvent) {
	}

	public void onBarcodeSearchActionn(KeyEvent keyEvent) {
	}

	public void onNameSearchAction(KeyEvent keyEvent) {
	}
}
