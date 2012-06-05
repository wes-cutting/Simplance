package entities;

import java.util.List;
import java.util.Vector;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Phone {

	@Id
	@GeneratedValue
	private int Id;
	
	@Column(length=13)
	private String Home;
	
	@Column(length=13)
	private String Cell;
	
	@Column(length=13)
	private String Work;
	
	@Column(length=5)
	private String Work_Ext;
	
	@OneToMany(mappedBy="phone")
	private List<Customer> customers;
	
	public Phone(){}
	
	public int GetId()
	{
		return Id;
	}
	
	public void SetId(int id)
	{
		Id = id;
	}
	
	public String GetHome()
	{
		return Home;
	}
	
	public void SetHome(String home)
	{
		Home = home;
	}
	
	public String GetCell()
	{
		return Cell;
	}
	
	public void SetCell(String cell)
	{
		Cell = cell;
	}
	
	public String GetWork()
	{
		return Work;
	}
	
	public void SetWork(String work)
	{
		Work = work;
	}
	
	public String GetWork_Ext()
	{
		return Work_Ext;
	}
	
	public void SetWork_Ext(String workExt)
	{
		Work_Ext = workExt;
	}
	
	public List<Customer> getCustomers() {
		if (customers == null) customers = new Vector<>();
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
}
