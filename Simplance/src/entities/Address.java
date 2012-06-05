package entities;

import java.util.List;
import java.util.Vector;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Address {
	
	@Id
	@GeneratedValue
	private int Id;
	
	@Column(nullable=false, length=255)
	private String StreetAddress;
	
	@Column(nullable=false)
	private String City;
	
	@Column(nullable=false, length=2)
	private String State;
	
	@Column(nullable=false, length=5)
	private String Zip;
	
	@OneToMany(mappedBy="address")
	private List<Customer> customers;
	
	public Address(){}
	
	public int GetId()
	{
		return Id;
	}
	
	public void SetId(int id)
	{
		Id = id;
	}
	
	public String GetStreetAddress()
	{
		return StreetAddress;
	}
	
	public void SetStreetAddress(String streetAddress)
	{
		StreetAddress = streetAddress;
	}
	
	public String GetCity()
	{
		return City;
	}
	
	public void SetCity(String city)
	{
		City = city;
	}
	
	public String GetState()
	{
		return State;
	}
	
	public void SetState(String state)
	{
		State = state;
	}
	
	public String GetZip()
	{
		return Zip;
	}
	
	public void SetZip(String zip)
	{
		Zip = zip;
	}
	
	public List<Customer> getCustomers() {
		if (customers == null) customers = new Vector<>();
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
}
