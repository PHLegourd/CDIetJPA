package com.formation.cdi.dao;

import javax.annotation.PostConstruct;
import javax.inject.Named;

@Named("ClientDAOJDBC")
public class ClientDAO implements IClientDAO {

	@Override
	public String insertClient() {

		return "Cr�ation client en BDD avec JDBC pur OK";
	}
	
	@PostConstruct
	public void logApresConstruction () {
		System.out.println("Apr�s cr�ation ClientDAO");
	}

}
