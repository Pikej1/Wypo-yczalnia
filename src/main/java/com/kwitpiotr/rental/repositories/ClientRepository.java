package com.kwitpiotr.rental.repositories;

/*import java.util.ArrayList;

public class ClientRepository {
private ArrayList<Client> clientRep;
	
	public ClientRepository(){
		clientRep = new ArrayList<Client>();
	}
	
	public void addClient(Client client){
		if(!ifExist(client.getPesel())){
			clientRep.add(client);
		}else{
			System.out.println("Podany klient już istnieje!");
		}
	}
	
	public boolean ifExist(String id){
		for(Client client: clientRep){
			if(client.getId().equals(id))
				return true;
		}
		return false;
	}
	
	public boolean ifExist(int pesel){
		for(Client client: clientRep){
			if(client.getPesel() == pesel)
				return true;
		}
		return false;
	}
	
	public Client find(String name, String lastName){
		for(Client client: clientRep){
			if(client.getName().equals(name) && client.getLastName().equals(lastName)){
				return client;
			}
		}
		return null;
	}
	
	public void printAll(){
		for(Client client: clientRep){
			System.out.println(client.toString());
		}
	}
}*/
