package com.baisong.identy_code.domain;

import java.io.Serializable;
import java.util.List;

public class Name implements Serializable
{
	private List<Salary> salary;
	private int id;
	private String staff_num;
	private String staff_name;
	public List<Salary> getSalary() {
		return salary;
	}
	public void setSalary(List<Salary> salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStaff_num() {
		return staff_num;
	}
	public void setStaff_num(String staff_num) {
		this.staff_num = staff_num;
	}
	public String getStaff_name() {
		return staff_name;
	}
	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	
	
}
