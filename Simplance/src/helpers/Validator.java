package helpers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Validator 
{
	List<String> errors;
	
	public Validator()
	{
		errors = new ArrayList<>();
	}
	
	public String ValidateRequestParam(String param)
	{		
		if(param == null || param.trim().isEmpty())
		{
			errors.add(param + " field empty");
		}
		return param;
	}
	
	public Date ValidateDate(String param)
	{
		String s = ValidateRequestParam(param);
		
		SimpleDateFormat df = new SimpleDateFormat("MM/DD/YYYY");
		
		try
		{
			df.parse(s);
		}
		catch(Exception e)
		{
			errors.add(e.toString());
		}
		
		return null;
	}
	
	public List<String> GetErrorList()
	{
		return errors;
	}
}
