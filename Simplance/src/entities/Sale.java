package entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sale {

	@Id
	@GeneratedValue
	private int Id;
	
	@Column(nullable=false)
	private short Term;
	
	@Column(nullable=false, length=150)
	private String PremiumNumber;
	
	@Column(nullable=false)
	private BigDecimal MonthlyPremium;
	
	@Column(nullable=false)
	private BigDecimal Commision;
	
	@Column(length=255)
	private String Comments;
	
	public Sale(){}
	
	public int GetId()
	{
		return Id;
	}
	
	public void SetId(int id)
	{
		Id = id;
	}
	
	public short GetTerm()
	{
		return Term;
	}
	
	public void SetTerm(short term)
	{
		Term = term;
	}
	
	public String GetPremiumNumber()
	{
		return PremiumNumber;
	}
	
	public void SetPremiumNumber(String premiumNumber)
	{
		PremiumNumber = premiumNumber;
	}
	
	public BigDecimal GetMonthlyPremium()
	{
		return MonthlyPremium;
	}
	
	public void SetMonthlyPremium(BigDecimal monthlyPremium)
	{
		MonthlyPremium = monthlyPremium;
	}
	
	public BigDecimal GetCommision()
	{
		return Commision;
	}
	
	public void SetCommision(BigDecimal commision)
	{
		Commision = commision;
	}
	
	public String GetComments()
	{
		return Comments;
	}
	
	public void SetComments(String comments)
	{
		Comments = comments;
	}
}
