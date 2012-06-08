package entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Note {
	
	@Id
	@GeneratedValue
	private int Id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false, updatable = false)
	private Date Date_Created;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable=false)
	private Date Date_Last_Modified;
	
	@Column(nullable=false)
	private String Subject;
	
	@Lob
	@Column(nullable=false)
	private String Body;
	
	@ManyToOne(optional=false)
	private Customer customer;
	
	public Note(){}
	
	public int GetId()
	{
		return Id;
	}
	
	public void SetId(int id)
	{
		Id = id;
	}
	
	public Date GetDate_Created()
	{
		return Date_Created;
	}
	
	public void SetDate_Created(Date date)
	{
		Date_Created = date;
	}
	
	public Date GetDate_Last_Modified()
	{
		return Date_Last_Modified;
	}
	
	public void SetDate_Last_Modified(Date date)
	{
		Date_Last_Modified = date;
	}
	
	public String GetSubject()
	{
		return Subject;
	}
	
	public void SetSubject(String subject)
	{
		Subject = subject;
	}
	
	public String GetBody()
	{
		return Body;
	}
	
	public void SetBody(String body)
	{
		Body = body;
	}
	
	public Customer GetCustomer()
	{
		return customer;
	}
	
	public void SetCustomer(Customer customer)
	{
		this.customer = customer;
	}
}
