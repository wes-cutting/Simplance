package entities;

import java.util.List;
import java.util.Vector;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Agent {

	@Id
	@GeneratedValue
	private int Id;
	
	@Column(nullable=false, length=25)
	private String FirstName;
	
	@Column(nullable=false, length=40)
	private String LastName;
	
	@Column(nullable=false, length=100)
	private String Email;
	
	@OneToOne
	@JoinColumn(name="address_id")
	private Address address;
	
	@OneToOne
	@JoinColumn(name="phone_id")
	private Phone phone;
	
	@OneToMany(mappedBy="agent")
	private List<Customer> customers;
	
	public Agent(){}
	
	public int GetId()
	{
		return Id;
	}
	
	public void SetId(int id)
	{
		Id = id;
	}
	
	public String GetFirstName()
	{
		return FirstName;
	}
	
	public void SetFirstName(String firstName)
	{
		FirstName = firstName;
	}
	
	public String GetLastName()
	{
		return LastName;
	}
	
	public void SetLastName(String lastName)
	{
		LastName = lastName;
	}
	
	public String GetEmail()
	{
		return Email;
	}
	
	public Address GetAddress()
	{
		return address;
	}
	
	public void SetAddress(Address address)
	{
		this.address = address;
	}
	
	public Phone GetPhone()
	{
		return phone;
	}
	
	public void SetPhone(Phone phone)
	{
		this.phone = phone;
	}
	
	public List<Customer> GetCustomers() 
	{
		if (customers == null) customers = new Vector<>();
		return customers;
	}

	public void SetCustomers(List<Customer> customers)
	{
		this.customers = customers;
	}
}
