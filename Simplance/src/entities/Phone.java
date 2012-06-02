package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
}
