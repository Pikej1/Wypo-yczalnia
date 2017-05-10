package com.kwitpiotr.rental.repositories;

import org.omg.CosNaming.IstringHelper;

import com.kwitpiotr.rental.model.Movie;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MovieRepository {
	private ObservableList<Movie> movieRepository;// = FXCollections.observableArrayList();

	public MovieRepository(){
		movieRepository = FXCollections.observableArrayList();
		movieRepository.add(new Movie("Matrix", 1999, "Sci-fi/action"));
    	movieRepository.add(new Movie("Schrek",2001, "Comedy"));
    	movieRepository.add(new Movie("Fightclub", 1999, "Thriller"));
    	Movie movie = new Movie("Gwiezdne Wojny: Część IV - Nowa nadzieja", 1977, "Sci-Fi");
    	//movie.setRented(true);
    	movieRepository.add(movie);
	}
	
	public void add(Movie movie){
		movieRepository.add(movie);
	}
	
	public ObservableList<Movie> getRepository(){
		return movieRepository;
	}
	
	public ObservableList<Movie> getAvaiable(){
		ObservableList<Movie> avaiable = FXCollections.observableArrayList();
		for(Movie movie: movieRepository){
			if(!movie.isRented()){
				avaiable.add(movie);
			}
		}
		return avaiable;
	}
}
