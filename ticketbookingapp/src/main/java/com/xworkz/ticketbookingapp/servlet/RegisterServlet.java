package com.xworkz.ticketbookingapp.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/RegisterServlet")
public class RegisterServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name");
		String lastname = req.getParameter("lastname");
		String username = req.getParameter("username");
		String age = req.getParameter("age");
		String gender = req.getParameter("gender");
		String state = req.getParameter("stateSelect");
		String city = req.getParameter("citySelect");
		String number = req.getParameter("Contactnumber");
		String alterNumber = req.getParameter("Alternativecontactnumber");
		String email = req.getParameter("email");

		System.out.println("name=" + name);
		System.out.println("lastname=" + lastname);
		System.out.println("username=" + username);
		System.out.println("age=" + age);
		System.out.println("gender=" + gender);
		System.out.println("state=" + state);
		System.out.println("city=" + city);
		System.out.println("number=" + number);
		System.out.println("alterNumber=" + alterNumber);
		System.out.println("email=" + email);

	}

}
