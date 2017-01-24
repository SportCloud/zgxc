package com.baisong.identy_code.domain;

import java.io.Serializable;
import java.util.Date;

public class Salary implements Serializable
{
	private int id;
	private String date;
	private String base_pay;
	private String allowance;
	private String staff_num;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBase_pay() {
		return base_pay;
	}
	public void setBase_pay(String base_pay) {
		this.base_pay = base_pay;
	}
	public String getAllowance() {
		return allowance;
	}
	public void setAllowance(String allowance) {
		this.allowance = allowance;
	}
	public String getStaff_num() {
		return staff_num;
	}
	public void setStaff_num(String staff_num) {
		this.staff_num = staff_num;
	}
		
	
}
