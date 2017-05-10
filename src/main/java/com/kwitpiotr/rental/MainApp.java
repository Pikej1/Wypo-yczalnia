package com.kwitpiotr.rental;

import java.awt.BorderLayout;
import java.io.IOException;
import java.time.LocalDate;

import com.kwitpiotr.rental.model.*;
import com.kwitpiotr.rental.views.ClientDetailsController;
import com.kwitpiotr.rental.views.ClientEditDialogController;
import com.kwitpiotr.rental.views.MovieDetailsController;
import com.kwitpiotr.rental.views.RentDetailsController;
import com.kwitpiotr.rental.views.RootController;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainApp extends Application {
	
	private Stage primaryStage;
	private HBox rootLayout;
	private BorderPane tempLayout;
	
	private ObservableList<Movie> movieRep = FXCollections.observableArrayList();
	private ObservableList<Client> clientRep = FXCollections.observableArrayList();
	private ObservableList<Rent> rentRep = FXCollections.observableArrayList();
	
	public MainApp() {
		// TODO Auto-generated constructor stub
    	
    	movieRep.add(new Movie("Matrix", 1999, "Sci-fi/action"));
    	movieRep.add(new Movie("Schrek",2001, "Comedy"));
    	movieRep.add(new Movie("Fightclub", 1999, "Thriller"));
    	Movie movie = new Movie("Gwiezdne Wojny: Część IV - Nowa nadzieja", 1977, "Sci-Fi");
    	//movie.setRented(true);
    	movieRep.add(movie);
    	clientRep.add(new Client("John", "Smith", LocalDate.of(1980, 4, 12), 11100011));
    	clientRep.add(new Client("Antoni", "Macierewicz", LocalDate.of(1948, 9, 3), 11111111));
    	clientRep.add(new Client("Andrzej", "Dupa", LocalDate.of(1970, 1, 1),99999999));
    	
    	rentRep.add(new Rent(movieRep.get(0), clientRep.get(1)));
    	rentRep.add(new Rent(movieRep.get(1), clientRep.get(0)));
    	rentRep.get(0).returnItem();
	}

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Rental System");
		
		initMainLayout();
	}

	/**
	 * Showing details of chosen client
	 * @param client which details are presented
	 */
	public void showClientDetails(Client client) {
		try{
			//Loading ClientDetails.fxml
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("views/ClientDetails.fxml"));
			AnchorPane clientDetails = (AnchorPane) loader.load();
			
			//Controller
			ClientDetailsController controller = loader.getController();
			controller.showClientDetails(client);
			
			//Attaching ClientDetails.fxml to main layout
			//rootLayout.getChildren().set(1, clientDetails);
			tempLayout.setCenter(clientDetails);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	/**
	 * Showing details of chosen movie
	 * @param movie which details are presented
	 */
	public void showMovieDetails(Movie movie){
		try{
			//Loading MovieDetails.fxml
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("views/MovieDetails.fxml"));
			AnchorPane movieDetails = (AnchorPane) loader.load();
			
			//Controller
			MovieDetailsController controller = loader.getController();
			controller.showMovieDetails(movie);
			
			//Attaching MovieDetails.fxml to main layout
			//rootLayout.getChildren().set(1, movieDetails);
			tempLayout.setCenter(movieDetails);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void showRentDetails(Rent rent){
		try{
			//Loading MovieDetails.fxml
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("views/RentDetails.fxml"));
			AnchorPane movieDetails = (AnchorPane) loader.load();
			
			//Controller
			RentDetailsController controller = loader.getController();
			controller.showRentDetails(rent);
			
			//Attaching MovieDetails.fxml to main layout
			//rootLayout.getChildren().set(1, movieDetails);
			tempLayout.setCenter(movieDetails);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public boolean showClientEditDialog(Client client){
		try{
			//Loading .fxml and creating new stage (for popuping window)
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("views/ClientEditDialog.fxml"));
			Pane window = (Pane) loader.load();
			
			//Creating dialog Stage
			Stage dialogStage = new Stage();
			dialogStage.setTitle("Edytuj dane klienta");
			dialogStage.initModality(Modality.WINDOW_MODAL);
	        dialogStage.initOwner(primaryStage);
	        Scene scene = new Scene(window);
	        dialogStage.setScene(scene);
	        
	        //Set client in contr
	        ClientEditDialogController controller = loader.getController();
	        controller.setDialogStage(dialogStage);
	        controller.setClient(client);
	        
	        dialogStage.showAndWait();
	        return controller.isConfirmed();
		}catch(IOException e){
			e.printStackTrace();
			return false;
		}
	}
	
	private void initMainLayout() {
		try{
			//Loading MainLayout.fxml
			FXMLLoader loader = new FXMLLoader();
			//loader.setLocation(MainApp.class.getResource("views/RootLayout.fxml"));
			//rootLayout = (HBox) loader.load();
			loader.setLocation(MainApp.class.getResource("views/TempLayout.fxml"));
			tempLayout = (BorderPane) loader.load();
			
			//Controller
			RootController controller = loader.getController();
			controller.setMainApp(this);

			
			//Showing the scene with the layout
			//Scene scene = new Scene(rootLayout);
			Scene scene = new Scene(tempLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	public Stage getPrimaryStage(){
		return primaryStage;
	}

	public static void main(String[] args) {
		launch(args);
	}

	public ObservableList<Movie> getMovieRep() {
		return movieRep;
	}
	public ObservableList<Client> getClientRep() {
		return clientRep;
	}
	public ObservableList<Rent> getRentRep(){
		return rentRep;
	}
}
