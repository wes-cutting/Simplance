package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Insurance_Carrier {

	@Id
	@GeneratedValue
	private int Id;
	
	@Column(nullable=false, length=150)
	private String Name;
	
	@Column(nullable=false, length=2)
	private String State;
	
	@Column(nullable=false, length=13)
	private String Contact_Number;
	
	public Insurance_Carrier(){}
	
	public int GetId()
	{
		return Id;
	}
	
	public void SetId(int id)
	{
		Id = id;
	}
	
	public String GetName()
	{
		return Name;
	}
	
	public void SetName(String name)
	{
		Name = name;
	}
	
	public String GetState()
	{
		return State;
	}
	
	public void SetState(String state)
	{
		State = state;
	}
	
	public String GetContact_Number()
	{
		return Contact_Number;
	}
	
	public void SetContact_Number(String contactNumber)
	{
		Contact_Number = contactNumber;
	}
}
