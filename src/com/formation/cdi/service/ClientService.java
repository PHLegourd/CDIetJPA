package com.formation.cdi.service;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import com.formation.cdi.dao.IClientDAO;

@Named("ClientService")
public class ClientService {

	
	@Inject
	@Named("ClientDAOJDBC")
	IClientDAO dao;
	
	public String creerClient() {
		return "Service : " + dao.insertClient();
	}
	
	@PostConstruct
	public void logApresConstruction() {
		System.out.println("Après création Service");
	}
}
