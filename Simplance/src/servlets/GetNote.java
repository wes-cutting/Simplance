package servlets;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Customer;
import entities.Note;

import managers.NotesManager;

@WebServlet("/GetNote")
public class GetNote extends HttpServlet {
	
	@EJB
	NotesManager notesManager;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Note n = notesManager.byId(id);
		
		if (n == null){
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Entity not found");
		}
		request.setAttribute("note", n);
		getServletContext().getRequestDispatcher("/WEB-INF/noteForm.jsp").forward(request, response);
		return;
	}
}