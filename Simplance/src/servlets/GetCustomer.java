package servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Customer;

import managers.CustomerManager;

@WebServlet("/GetCustomer")
public class GetCustomer extends HttpServlet {
	
	@EJB
	CustomerManager customerManager;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Customer c = customerManager.byId(id);
		
		if (c == null){
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Entity not found");
		}
		request.setAttribute("customer", c);
		getServletContext().getRequestDispatcher("/WEB-INF/customerForm.jsp").forward(request, response);
		return;
	}
}