package com.baisong.identy_code.service;

import java.util.List;
import java.util.Map;

import com.baisong.identy_code.domain.AdminInfo;
import com.baisong.identy_code.domain.Name;
import com.baisong.identy_code.domain.Salary;
import com.baisong.identy_code.domain.Staff;
import com.baisong.identy_code.domain.UserInfo;

public interface UserInfoService 
{
	public Name findNameSalary(String staff_num);

	public List<Name> findName(Map map);
	
	public List<Salary> findSalary(Map map);
	
	public List<Staff> findStaff(Map map);
	
	public void insertUser(UserInfo user);
	
	public void insertName(Name name);
	
	public void insertSalary(Salary salary);
	
	public void insertStaff(Staff staff);
	
	public boolean updateUser(UserInfo user);
	
	public boolean updateName(Name name);
	
	public boolean updateSalary(Salary salary);
	
	public boolean updateStaff(Staff staff);
	
	public UserInfo findUserByName(String username);
	
	public Name findNameById(int id);
	
	public List<Salary> findSalaryByName(String username);
	
	public Salary findSalaryById(int id);
	
	public List<Staff> findStaffByName(String username);
	
	public Staff findStaffById(int id);
	
	public boolean deleteUser(String username);
	
	public boolean deleteName(int id);
	
	public boolean deleteSalary(int id);

	public UserInfo checkLogin(String username, String password);
}
