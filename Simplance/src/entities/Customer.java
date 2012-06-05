package entities;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	private int Id;
	
	@Column(nullable=false, length=2)
	private String InsuredState;
	
	@Column(nullable=false, length=25)
	private String FirstName;
	
	@Column(nullable=false, length=40)
	private String LastName;
	
	@Column(nullable=false, length=1)
	private String Gender;
	
	@Column(nullable=false, length=100)
	private String Email;
	
	@Column(nullable=false, length=20)
	private String Marital_Status;
	
	@Column(nullable=false)
	private boolean IsActive;
	
	@Column(nullable=false)
	private boolean IsContracted;
	
	@Column(nullable=false)
	private Date First_Contact_Date;
	
	@Column(nullable=false)
	private Date Birthday;
	
	@OneToOne
	@JoinColumn(name="address_id")
	private Address address;
	
	@OneToOne
	@JoinColumn(name="phone_id")
	private Phone phone;
	
	@OneToOne
	@JoinColumn(name="sale_id")
	private Sale sale;
	
	@OneToOne
	@JoinColumn(name="policy_id")
	private Insurance_Policy policy;
	
	@OneToMany(mappedBy="customer")
	private List<Note> notes;
	
	@ManyToOne(optional=false)
	private Agent agent;
	
	public Customer(){}
	
	public int GetId()
	{
		return Id;
	}
	
	public void SetId(int id)
	{
		Id = id;
	}
	
	public String GetInsuredState()
	{
		return InsuredState;
	}
	
	public void SetInsuredState(String insuredState)
	{
		InsuredState = insuredState;
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
	
	public String GetGender()
	{
		return Gender;
	}
	
	public void SetGender(String gender)
	{
		Gender = gender;
	}
	
	public String GetEmail()
	{
		return Email;
	}
	
	public void SetEmail(String email)
	{
		Email = email;
	}
	
	public String GetMarital_Status()
	{
		return Marital_Status;
	}
	
	public void SetMarital_Status(String maritalStatus)
	{
		Marital_Status = maritalStatus;
	}
	
	public boolean GetIsActive()
	{
		return IsActive;
	}
	
	public void SetIsActive(boolean isactive)
	{
		IsActive = isactive;
	}
	
	public boolean GetIsContracted()
	{
		return IsContracted;
	}
	
	public void SetIsContracted(boolean iscontracted)
	{
		IsContracted = iscontracted;
	}
	
	public Date GetFirst_Contact_Date()
	{
		return First_Contact_Date;
	}
	
	public void SetFirst_Contact_Date(Date firstContactDate)
	{
		First_Contact_Date = firstContactDate;
	}
	
	public Date GetBirthday()
	{
		return Birthday;
	}
	
	public void SetBirthDay(Date birthday)
	{
		Birthday = birthday;
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
	
	public Sale GetSale()
	{
		return sale;
	}
	
	public void SetSale(Sale sale)
	{
		this.sale = sale;
	}
	
	public Insurance_Policy GetPolicy()
	{
		return policy;
	}
	
	public void SetPolicy(Insurance_Policy policy)
	{
		this.policy = policy;
	}
	
	public List<Note> getNotes() 
	{
		if (notes == null) notes = new Vector<>();
		return notes;
	}

	public void setNotes(List<Note> notes) 
	{
		this.notes = notes;
	}
	
	public Agent GetAgent()
	{
		return agent;
	}
	
	public void SetAgent(Agent agent)
	{
		this.agent = agent;
	}
}
