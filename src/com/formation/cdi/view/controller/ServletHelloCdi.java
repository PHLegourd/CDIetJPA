package com.formation.cdi.view.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.formation.cdi.service.ClientService;

@WebServlet(name="ServletHelloCdi", urlPatterns="/hellocdi")
public class ServletHelloCdi extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	@Named("ClientService")
	ClientService service;

	public ServletHelloCdi() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		service.creerClient();
		PrintWriter out = response.getWriter();
		out.println("Mise en oeuvre de CDI ok!");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
