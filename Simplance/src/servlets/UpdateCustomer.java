package servlets;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import managers.CustomerManager;

import entities.Address;
import entities.Customer;
import entities.Phone;

@WebServlet("/UpdateCustomer")
public class UpdateCustomer extends HttpServlet {

	@EJB
	CustomerManager customerManager;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("create") != null)
		{
			getServletContext().getRequestDispatcher("/NewCustomer").forward(request, response);
		}
		else if(request.getParameter("update") != null)
		{
			int id = -1;
			try
			{
				id = Integer.parseInt(request.getParameter("id"));
				
				Address a = new Address();
				
				a.SetCity(request.getParameter("city"));
				a.SetState(request.getParameter("street"));
				a.SetState(request.getParameter("state"));
				a.SetZip(request.getParameter("zip"));
				
				Phone p = new Phone();
				
				p.SetCell(request.getParameter("cell"));
				p.SetHome(request.getParameter("home"));
				p.SetWork(request.getParameter("work"));
				p.SetWork_Ext(request.getParameter("ext"));
				
				SimpleDateFormat df = new SimpleDateFormat("MM/DD/YYYY");				
				
				Customer c = new Customer();
				
				c.SetFirstName(request.getParameter("firstname"));
				c.SetLastName(request.getParameter("lastname"));
				c.SetGender(request.getParameter("gender"));
				c.SetBirthDay(df.parse(request.getParameter("birthday")));
				c.SetAddress(a);
				c.SetPhone(p);
				c.SetEmail(request.getParameter("email"));
				c.SetMarital_Status(request.getParameter("maritalstatus"));
				c.SetIsSmoker(request.getParameter("issmoker") == null ? false : true);
				c.SetIsActive(request.getParameter("isactive") == null ? false : true);
				c.SetIsContracted(request.getParameter("iscontracted") == null ? false : true);
				//c.SetPolicy(request.getParameter("insurancepolicy"));
				//c.SetAgent(request.getParameter("agent"));
				//c.SetSale(request.getParameter("sale"));
				//c.setNotes(request.getParameter("notes"));
				
				//customerManager.update(c);
				
				response.sendRedirect(getServletContext().getContextPath());
				return;
			}
			catch(Exception e)
			{
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Unable to find/modify customer!");
			}
		}
	}
}