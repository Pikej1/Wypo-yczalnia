package com.kwitpiotr.rental.repositories;

import java.util.ArrayList;

/*public class MovieRepository {
	private ArrayList<Movie> movieRep;
	
	public MovieRepository(){
		movieRep = new ArrayList<Movie>();
	}
	
	public void addMovie(Movie movie){
		if(!ifExist(movie.getName())){
			movieRep.add(movie);
		}else{
			System.out.println("Podany film już istnieje!");
		}
	}
	
	public boolean ifExist(String name){
		for(Movie movie: movieRep){
			if(movie.getName().equals(name))
				return true;
		}
		return false;
	}
	
	public void printAll(){
		for(Movie movie: movieRep){
			System.out.println(movie.toString());
			}
	}
	
	public void printFreeOnes(){
		System.out.println("Dostępne filmy:");
		for(Movie movie: movieRep){
			if(!movie.isRented())
				System.out.println(movie.toString());
		}
	}
	
	public Movie findByName(String name){
		for(Movie movie: movieRep){
			if(movie.getName().equals(name)){
				return movie;
			}
		}
		return null;
	}
	
	public ArrayList<Movie> getMovieRepository(){
		return movieRep;
	}
}*/
