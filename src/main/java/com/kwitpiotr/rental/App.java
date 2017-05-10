package com.kwitpiotr.rental;

import java.time.LocalDate;

import com.kwitpiotr.rental.repositories.*;

public class App 
{
    /*public static void main( String[] args )
    {
    	MovieRepository mRep = new MovieRepository();
    	mRep.printAll();
    	ClientRepository cRep = new ClientRepository();
    	cRep.printAll();
    	RentRepository rRep = new RentRepository();
    	rRep.printHistory();
    	Movie movie = new Movie("Matrix", 1999, "Sci-fi/action");
    	mRep.addMovie(movie);
    	mRep.addMovie(new Movie("Schrek",2001, "Comedy"));
    	Client client = new Client("John", "Smith", LocalDate.of(1980, 4, 12), 11100011);
    	cRep.addClient(client);
    	cRep.addClient(new Client("Antoni", "Macierewicz", LocalDate.of(1948, 9, 3), 11111111));
    	rRep.rent(movie, client);
    	rRep.rent(mRep.findByName("Schrek"), cRep.find("Antoni", "Macierewicz"));
    	rRep.printHistory();
    	//rRep.rent(mRep.findByName("Dom zły"), client);
    	rRep.rent(movie, client);
    	cRep.printAll();
    	mRep.printAll();
    	mRep.printFreeOnes();
    }*/
}
