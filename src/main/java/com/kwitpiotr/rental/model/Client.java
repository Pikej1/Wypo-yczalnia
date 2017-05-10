package com.kwitpiotr.rental.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Client {
	private StringProperty name;
	private StringProperty lastName;
	private ObjectProperty<LocalDate> birthDate;
	private IntegerProperty pesel;
	
	
	public Client(){
		this(null, null, null, 0);
	}
	
	public Client(String name, String lastName, LocalDate birthDate, int pesel){
		this.name = new SimpleStringProperty(name);
		this.lastName = new SimpleStringProperty(lastName);
		this.birthDate = new SimpleObjectProperty<LocalDate>(birthDate);
		this.pesel = new SimpleIntegerProperty(pesel);
	}

	public String getName() {
		return name.get();
	}

	public void setName(String name) {
		this.name.set(name);
	}
	
	public StringProperty nameProperty(){
		return name;
	}
	
	public String getLastName() {
		return lastName.get();
	}

	public void setLastName(String lastName) {
		this.lastName.set(lastName);
	}
	
	public StringProperty lastNameProperty(){
		return lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate.get();
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate.set(birthDate);
	}
	
	public ObjectProperty<LocalDate> birthDateProperty(){
		return birthDate;
	}

	public int getPesel() {
		return pesel.get();
	}

	public void setPesel(int pesel) {
		this.pesel.set(pesel);
	}
	
	public IntegerProperty peselProperty(){
		return pesel;
	}
	
}
