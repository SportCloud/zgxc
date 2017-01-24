package com.baisong.identy_code.domain;

import java.io.Serializable;

public class AdminInfo implements Serializable
{
	private int id;
	private String staff_num;
	private String name;
	private String base_pay;
	private String job_pay;
	private String allowance;

	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getStaff_num() 
	{
		return staff_num;
	}
	
	public void setStaff_num(String staff_num) 
	{
		this.staff_num = staff_num;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getBase_pay() 
	{
		return base_pay;
	}
	
	public void setBase_pay(String base_pay) 
	{
		this.base_pay = base_pay;
	}
	
	public String getJob_pay() 
	{
		return job_pay;
	}
	
	public void setJob_pay(String job_pay) 
	{
		this.job_pay = job_pay;
	}
	
	public String getAllowance() 
	{
		return allowance;
	}
	
	public void setAllowance(String allowance) 
	{
		this.allowance = allowance;
	}
}
