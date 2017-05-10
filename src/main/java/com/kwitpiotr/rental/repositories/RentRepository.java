package com.kwitpiotr.rental.repositories;

import java.util.ArrayList;


/*public class RentRepository {
	
	private ArrayList<Rent> rentRep;
	
	public RentRepository(){
		rentRep = new ArrayList<Rent>();
	}
	
	public void rent(Movie movie, Client client){
		try{
			if(!movie.isRented())
				rentRep.add(new Rent(movie, client));
			else
				System.out.printf("Film %s jest aktualnie wypożyczony", movie.getName());
		}catch(NullPointerException e){
			System.out.println("Nie można dokonać wypożyczenia, gdyż film lub klient nie istnieje.");
		}
	}
	
	public void printHistory(){
		for(Rent rent: rentRep){
			System.out.println(rent.toString());
		}
	}
	
}*/
