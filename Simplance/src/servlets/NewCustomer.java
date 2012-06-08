package servlets;

import helpers.Validator;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Address;
import entities.Customer;
import entities.Phone;

import managers.CustomerManager;

@WebServlet("/NewCustomer")
public class NewCustomer extends HttpServlet {
	
	@EJB
	CustomerManager customerManager;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Validator validate = new Validator();
		
		String lastname = validate.ValidateRequestParam(request.getParameter("lastname"));
		String firstname = validate.ValidateRequestParam(request.getParameter("firstname"));
		String gender = validate.ValidateRequestParam(request.getParameter("gender"));
		String email = validate.ValidateRequestParam(request.getParameter("email"));
		String maritalstatus = validate.ValidateRequestParam(request.getParameter("maritalstatus"));
		boolean IsSmoker = request.getParameter("issmoker") == null ? false : true;
		boolean IsActive = request.getParameter("isactive") == null ? false : true;
		boolean IsContracted = request.getParameter("iscontracted") == null ? false : true;
		Date birthday = validate.ValidateDate(request.getParameter("birthday"));
		Date firstcontactdate = validate.ValidateDate(request.getParameter("firstcontactdate"));
		
		// Address Fields 
		String street = validate.ValidateRequestParam(request.getParameter("street"));
		String city = validate.ValidateRequestParam(request.getParameter("city"));
		String state = validate.ValidateRequestParam(request.getParameter("state"));
		String zip = validate.ValidateRequestParam(request.getParameter("zip"));
		
		// Phone Fields
		String cell = validate.ValidateRequestParam(request.getParameter("cell"));
		String home = validate.ValidateRequestParam(request.getParameter("home"));
		String work = validate.ValidateRequestParam(request.getParameter("work"));
		String ext = validate.ValidateRequestParam(request.getParameter("ext"));
		
		
		if (validate.GetErrorList().size() > 0){
			request.setAttribute("errors", validate.GetErrorList());
			request.getRequestDispatcher("AllUsers").forward(request, response);
			return;
		}
		
		Address a = new Address();
		
		a.SetCity(city);
		a.SetStreetAddress(street);
		a.SetState(state);
		a.SetZip(zip);
		
		Phone p = new Phone();
		
		p.SetCell(cell);
		p.SetHome(home);
		p.SetWork(work);
		p.SetWork_Ext(ext);
		
		Customer c = new Customer();
		
		c.SetLastName(lastname);
		c.SetFirstName(firstname);
		c.SetGender(gender);
		c.SetEmail(email);
		c.SetMarital_Status(maritalstatus);
		c.SetIsSmoker(IsSmoker);
		c.SetIsActive(IsActive);
		c.SetIsContracted(IsContracted);
		c.SetBirthDay(birthday);
		c.SetFirst_Contact_Date(firstcontactdate);
		c.SetAddress(a);
		c.SetPhone(p);
		
		
		//customerManager.create(c);
		
		response.sendRedirect(getServletContext().getContextPath());
	}
}