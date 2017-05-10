package com.kwitpiotr.rental.views;

import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;

@SuppressWarnings("restriction")
public class ClientFormView{// extends Application{
	
	private Scene scene;
	
	public ClientFormView(){
		Text nameLabel = new Text("Imię");
		TextField nameText = new TextField();
		
		Text lastNameLabel = new Text("Nazwisko");
		TextField lastNameText = new TextField();
		
		Text dobLabel = new Text("Data urodzenia");
		DatePicker datePicker = new DatePicker();
		
		Text peselLabel = new Text("PESEL");
		TextField peselText = new TextField();
		
		Text addressLabel = new Text("Adres");
		TextField addressText = new TextField();
		
		//Buttons
		Button confirmButton = new Button("Zatwierdź");
		Button cancelButton = new Button("Anuluj");
		cancelButton.setOnAction(new EventHandler<ActionEvent>() {
			
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
			}
		});
		
		GridPane gridPane = new GridPane();
		gridPane.setMinSize(500, 500);
		gridPane.setVgap(20);
		gridPane.setHgap(20);
		
		gridPane.setAlignment(Pos.CENTER);
		
		//Arranging grid
		gridPane.add(nameLabel, 0, 0);
		gridPane.add(lastNameLabel, 0, 1);
		gridPane.add(dobLabel, 0, 2);
		gridPane.add(peselLabel, 0, 3);
		gridPane.add(addressLabel, 0, 4);
		
		gridPane.add(nameText, 1, 0);
		gridPane.add(lastNameText, 1, 1);
		gridPane.add(datePicker, 1, 2);
		gridPane.add(peselText, 1, 3);
		gridPane.add(addressText, 1, 4);
		
		gridPane.add(confirmButton, 0, 6);
		gridPane.add(cancelButton, 1, 6);
		
		scene = new Scene(gridPane);
	}
	
	public Scene getScene(){
		return scene;
	}

	/*@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		Text nameLabel = new Text("Imię");
		TextField nameText = new TextField();
		
		Text lastNameLabel = new Text("Nazwisko");
		TextField lastNameText = new TextField();
		
		Text dobLabel = new Text("Data urodzenia");
		DatePicker datePicker = new DatePicker();
		
		Text peselLabel = new Text("PESEL");
		TextField peselText = new TextField();
		
		Text addressLabel = new Text("Adres");
		TextField addressText = new TextField();
		
		//Buttons
		Button confirmButton = new Button("Zatwierdź");
		Button cancelButton = new Button("Anuluj");
		
		GridPane gridPane = new GridPane();
		gridPane.setMinSize(500, 500);
		//setting padding
		//gridPane.setPadding(new Insets(2, 2, 2, 2));
		//setting gaps
		gridPane.setVgap(20);
		gridPane.setHgap(20);
		
		gridPane.setAlignment(Pos.CENTER);
		
		//Arranging grid
		gridPane.add(nameLabel, 0, 0);
		gridPane.add(lastNameLabel, 0, 1);
		gridPane.add(dobLabel, 0, 2);
		gridPane.add(peselLabel, 0, 3);
		gridPane.add(addressLabel, 0, 4);
		
		gridPane.add(nameText, 1, 0);
		gridPane.add(lastNameText, 1, 1);
		gridPane.add(datePicker, 1, 2);
		gridPane.add(peselText, 1, 3);
		gridPane.add(addressText, 1, 4);
		
		gridPane.add(confirmButton, 0, 6);
		gridPane.add(cancelButton, 1, 6);
		
		//setting style to GridPane
		//gridPane.setStyle("-fx-background-color: GREY");
		
		Scene scene = new Scene(gridPane);
		
		stage.setTitle("Dodaj klienta");
		stage.setScene(scene);
		stage.show();
	}
	
	/*public static void main(String[] args) {
        launch(args);
    }*/

}
