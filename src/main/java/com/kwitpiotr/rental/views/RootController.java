package com.kwitpiotr.rental.views;

import java.time.LocalDate;

import com.kwitpiotr.rental.MainApp;
import com.kwitpiotr.rental.model.*;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RootController {
	
	@FXML
	private TableView<Movie> movieTable;
	@FXML
	private TableColumn<Movie, String> titleColumn;
	@FXML
	private TableColumn<Movie, String> availableColumn;
	
	@FXML
	private TableView<Client> clientTable;
	@FXML
	private TableColumn<Client, String> nameColumn;
	@FXML
	private TableColumn<Client, String> lastNameColumn;
	
	private MainApp mainApp;
	
	@FXML
	private TableView<Rent> rentTable;
	@FXML
	private TableColumn<Rent, String> rentingClientNameColumn;
	@FXML
	private TableColumn<Rent, String> rentingClientLastNameColumn;
	@FXML
	private TableColumn<Rent, String> rentedMovieColumn;
	@FXML
	private TableColumn<Rent, LocalDate> startDateColumn;
	
	/**
	 * Contructor
	 */
	public RootController(){}
	
	@FXML
	private void initialize(){
		titleColumn.setCellValueFactory(cellData -> cellData.getValue().titleProperty());
		availableColumn.setCellValueFactory(cellData -> cellData.getValue().genreProperty());
		
		nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
		lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
		
		rentingClientNameColumn.setCellValueFactory(cellData -> cellData.getValue().clientProperty().
				get().nameProperty());
		rentingClientLastNameColumn.setCellValueFactory(cellData -> cellData.getValue().clientProperty().
				get().lastNameProperty());
		rentedMovieColumn.setCellValueFactory(cellData -> cellData.getValue().movieProperty().get().titleProperty());
		startDateColumn.setCellValueFactory(cellData -> cellData.getValue().startDateProperty());
		
		showMovieDetails(null);
		showClientDetails(null);
		movieTable.getSelectionModel().selectedItemProperty().addListener(
				(observable, oldValue, newValue) -> showMovieDetails(newValue));
		clientTable.getSelectionModel().selectedItemProperty().addListener(
				(observable, oldValue, newValue) -> showClientDetails(newValue));
		rentTable.getSelectionModel().selectedItemProperty().addListener(
				(observable, oldValue, newValue) -> showRentDetails(newValue));	
	}
	
	@FXML
	private void handleDeleteClient(){
		int selectedIndex = clientTable.getSelectionModel().getSelectedIndex();
		if(selectedIndex >= 0){
			clientTable.getItems().remove(selectedIndex);
		}else{
			Alert alert = new Alert(AlertType.WARNING);
	        alert.initOwner(mainApp.getPrimaryStage());
	        alert.setTitle("Nie wybrano żadnej pozycji z listy");
			alert.setHeaderText("Nie wybrano klienta");
			alert.setContentText("Wybierz klienta z tabeli 'Klienci'.");

	        alert.showAndWait();
	    }
	}
	
	/**
	 * Adding new Client after pressing button 'Dodaj nowy'
	 */
	@FXML
	private void handleNewClient(){
		Client newClient = new Client();
		boolean okClicked = mainApp.showClientEditDialog(newClient);
		if(okClicked){
			mainApp.getClientRep().add(newClient);
		}
	}
	
	@FXML
	private void handleEditCliet(){
		Client selectedClient = clientTable.getSelectionModel().getSelectedItem();
		if(selectedClient != null){
			boolean okClicked = mainApp.showClientEditDialog(selectedClient);
			if(okClicked){
				showClientDetails(selectedClient);
			}
		}else{
			Alert alert = new Alert(AlertType.WARNING);
			alert.initOwner(mainApp.getPrimaryStage());
			alert.setTitle("Nie wybrano żadnej pozycji z listy");
			alert.setHeaderText("Nie wybrano klienta");
			alert.setContentText("Wybierz klienta z tabeli 'Klienci'.");
			
			alert.showAndWait();
		}
	}
	
	private void showMovieDetails(Movie movie){
		if(movie != null){
			mainApp.showMovieDetails(movie);
		}
	}
	
	private void showClientDetails(Client client){
		if(client != null){
			mainApp.showClientDetails(client);
		}
	}
	
	private void showRentDetails(Rent rent){
		if(rent != null){
			mainApp.showRentDetails(rent);
		}
	}
	
	public void setMainApp(MainApp mainApp){
		this.mainApp = mainApp;
		movieTable.setItems(mainApp.getMovieRep());
		clientTable.setItems(mainApp.getClientRep());
		rentTable.setItems(mainApp.getRentRep());
	}
}
