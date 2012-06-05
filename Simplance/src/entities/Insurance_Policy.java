package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Insurance_Policy {

	@Id
	@GeneratedValue
	private int Id;
	
	@Column(nullable=false, length=150)
	private String Name;
	
	@Lob
	@Column(nullable=false)
	private String Description;
	
	@OneToOne
	@JoinColumn(name="carrier_id")
	private Insurance_Carrier carrier;
	
	public Insurance_Policy(){}
	
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
	
	public String GetDescription()
	{
		return Description;
	}
	
	public void SetDescription(String description)
	{
		Description = description;
	}
	
	public Insurance_Carrier GetInsurance_Carrier()
	{
		return carrier;
	}
	
	public void SetInsurance_Carrier(Insurance_Carrier carrier)
	{
		this.carrier = carrier;
	}
}
