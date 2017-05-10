package com.kwitpiotr.rental.model;

import java.time.LocalDate;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Rent {
	private final ObjectProperty<Movie> movie;
	private final ObjectProperty<Client> client;
	private final ObjectProperty<LocalDate> startDate;
	private final ObjectProperty<LocalDate> endDate;
	private final BooleanProperty returned;
	
	public Rent(Movie movie, Client client){
		this.movie = new SimpleObjectProperty<Movie>(movie);
		movie.setRented(true);
		this.client = new SimpleObjectProperty<Client>(client);
		this.startDate = new SimpleObjectProperty<LocalDate>(LocalDate.now());
		this.endDate = new SimpleObjectProperty<LocalDate>(null);
		this.returned = new SimpleBooleanProperty(false);
	}

	public ObjectProperty<Movie> movieProperty() {
		return movie;
	}
	
	public Movie getMovie(){
		return movie.get();
	}
	public void setMovie(Movie movie){
		this.movie.set(movie);
	}

	public ObjectProperty<Client> clientProperty() {
		return client;
	}
	
	public Client getClient(){
		return client.get();
	}
	public void setClient(Client client){
		this.client.set(client);
	}

	public ObjectProperty<LocalDate> startDateProperty() {
		return startDate;
	}
	
	public LocalDate getStartDate(){
		return startDate.get();
	}
	public void setStartDate(LocalDate startDate){
		this.startDate.set(startDate);
	}

	public ObjectProperty<LocalDate> endDateProperty() {
		return endDate;
	}
	
	public LocalDate getEndDate(){
		return endDate.get();
	}
	public void setEndDate(LocalDate endDate){
		this.endDate.set(endDate);
	}

	public BooleanProperty returnedProperty() {
		return returned;
	}
	
	public boolean isReturned(){
		return returned.get();
	}
	public void returnItem(){
		this.returned.set(true);
		this.movie.get().setRented(false);
	}
}
