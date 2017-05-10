package com.kwitpiotr.rental.views;

import javafx.geometry.Pos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox; 
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;


//@SuppressWarnings("restriction")
public class MovieFormView{// extends Application{
	
	private Scene scene;
	
	public MovieFormView() {
		// TODO Auto-generated constructor stub
		Text titleLabel = new Text("Tytuł");
		TextField titleText = new TextField();
		
		Text manufYearLabel = new Text("Rok produkcji");
		TextField manufYearText = new TextField();
		
		Text genreLabel = new Text("Gatunek");
		ChoiceBox<String> box = new ChoiceBox<String>();
		box.getItems().addAll("Akcja", "Dramat", "Fantasy", "Horror", "Komedia", "Komedia romantyczna",
				"Musical", "Przygodowy", "Science-fiction", "Thriller");
		
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
		gridPane.add(titleLabel, 0, 0);
		gridPane.add(manufYearLabel, 0, 1);
		gridPane.add(genreLabel, 0, 2);
		
		gridPane.add(titleText, 1, 0);
		gridPane.add(manufYearText, 1, 1);
		gridPane.add(box, 1, 2);
		
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
		Text titleLabel = new Text("Tytuł");
		TextField titleText = new TextField();
		
		Text manufYearLabel = new Text("Rok produkcji");
		TextField manufYearText = new TextField();
		
		Text genreLabel = new Text("Gatunek");
		ChoiceBox<String> box = new ChoiceBox<String>();
		box.getItems().addAll("Akcja", "Dramat", "Fantasy", "Horror", "Komedia", "Komedia romantyczna",
				"Musical", "Przygodowy", "Science-fiction", "Thriller");
		
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
		gridPane.add(titleLabel, 0, 0);
		gridPane.add(manufYearLabel, 0, 1);
		gridPane.add(genreLabel, 0, 2);
		
		gridPane.add(titleText, 1, 0);
		gridPane.add(manufYearText, 1, 1);
		gridPane.add(box, 1, 2);
		
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
