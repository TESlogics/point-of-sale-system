package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Ime;

public class AdminImeController {

	public JFXButton bt_new;
	public JFXButton bt_ime_add;
	public JFXTextField tf_mobile_brand;
	public JFXTextField tf_ime_number;
	public JFXTextField tf_color;
	public JFXTextField tf_ram;
	public JFXTextField tf_rom;
	public JFXButton bt_ime_update;

	@FXML
	private TableView<Ime> tb_ime;

	private TableColumn<Ime, String> col_ime_number;

	private TableColumn<Ime, String> col_mobile_brand;

	private TableColumn<Ime, String> col_color;

	private TableColumn<Ime, String> col_rom;

	private TableColumn<Ime, String> col_ram;

	void initialize(){
		assert tb_ime != null : "fx:id=\"tb_ime\" was not injected: check your FXML file 'Admin_ime.fxml'.";
		assert bt_ime_add != null : "fx:id=\"bt_ime_add\" was not injected: check your FXML file 'Admin_ime.fxml'.";
		assert bt_ime_update != null : "fx:id=\"bt_ime_update\" was not injected: check your FXML file 'Admin_ime.fxml'.";
		assert tf_ime_number != null : "fx:id=\"tf_ime_number\" was not injected: check your FXML file 'Admin_ime.fxml'.";
		assert tf_mobile_brand != null : "fx:id=\"tf_mobile_brand\" was not injected: check your FXML file 'Admin_ime.fxml'.";
		assert tf_color != null : "fx:id=\"tf_color\" was not injected: check your FXML file 'Admin_ime.fxml'.";
		assert tf_ram != null : "fx:id=\"tf_ram\" was not injected: check your FXML file 'Admin_ime.fxml'.";
		assert tf_rom != null : "fx:id=\"tf_rom\" was not injected: check your FXML file 'Admin_ime.fxml'.";
		assert bt_new != null : "fx:id=\"bt_new\" was not injected: check your FXML file 'Admin_ime.fxml'.";

		col_ime_number = new TableColumn<Ime, String>("IME Number");
		col_mobile_brand = new TableColumn<Ime, String>("Mobile Brand");
		col_color = new TableColumn<Ime, String>("Color");
		col_ram = new TableColumn<Ime, String>("Ram");
		col_rom = new TableColumn<Ime, String>("Rom");

		col_ime_number.setMinWidth(90.0);
		col_mobile_brand.setMinWidth(180.0);
		col_color.setMinWidth(50.0);
		col_ram.setMinWidth(70.0);
		col_rom.setMinWidth(230.0);

		col_ime_number.setStyle("-fx-font-size: 18");
		col_mobile_brand.setStyle("-fx-font-size: 18");
		col_color.setStyle("-fx-font-size: 18");
		col_ram.setStyle("-fx-font-size: 18");
		col_rom.setStyle("-fx-font-size: 18");

/*		col_ime_number.setCellValueFactory(
				new PropertyValueFactory<Cashier, String>("ime"));
		col_mobile_brand.setCellValueFactory(
				new PropertyValueFactory<Cashier, String>("mobileBrand"));
		col_color.setCellValueFactory(
				new PropertyValueFactory<Cashier, String>("color"));
		col_ram.setCellValueFactory(
				new PropertyValueFactory<Cashier, String>("ram"));
		col_rom.setCellValueFactory(
				new PropertyValueFactory<Cashier, String>("rom"));*/

		/*tb_ime.getColumns().addAll(col_ime_number
				,col_mobile_brand
				,col_color
				,col_ram
				,col_rom);*/


	}

	public void onbtUpdateAction(ActionEvent actionEvent) {
	}

	public void onBtAddAction(ActionEvent actionEvent) {
	}

	public void onbtNewAction(ActionEvent actionEvent) {
	}
}
