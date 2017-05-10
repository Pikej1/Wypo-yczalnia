package com.kwitpiotr.rental;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/*@XmlRootElement(name = "clients")
public class ClientDao {

	private ArrayList<Client> clients;
	private String filePath;
	
	public ClientDao(){
		filePath="/scr/main/Database/clients.xml";
		DocumentBuilderFactory docFactory = new DocumentBuilderFactory() {
			
			@Override
			public void setFeature(String name, boolean value) throws ParserConfigurationException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAttribute(String name, Object value) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public DocumentBuilder newDocumentBuilder() throws ParserConfigurationException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getFeature(String name) throws ParserConfigurationException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Object getAttribute(String name) throws IllegalArgumentException {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
	@XmlElement(name = "client")
	public ArrayList<Client> getClients(){
		return clients;
	}
	
	public void setClients(ArrayList<Client> clients){
		this.clients = clients;
	}
	
}*/
