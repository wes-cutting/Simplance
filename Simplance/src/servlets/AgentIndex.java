package servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import managers.AgentManager;
import entities.Agent;

@WebServlet("/AgentIndex")
public class AgentIndex extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Agent a = (Agent)request.getSession().getAttribute("user");
		request.setAttribute("agentCustomers", a.GetCustomers());
		getServletContext().getRequestDispatcher("/WEB-INF/agentCustomers.jsp")
							.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
