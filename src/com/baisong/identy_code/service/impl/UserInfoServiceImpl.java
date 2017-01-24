package com.baisong.identy_code.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.baisong.identy_code.dao.UserInfoDao;
import com.baisong.identy_code.domain.AdminInfo;
import com.baisong.identy_code.domain.Name;
import com.baisong.identy_code.domain.Salary;
import com.baisong.identy_code.domain.Staff;
import com.baisong.identy_code.domain.UserInfo;
import com.baisong.identy_code.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService 
{
	@Resource
	UserInfoDao userInfoDao;
	
	public UserInfo checkLogin(String username, String password) 
	{
		// TODO Auto-generated method stub
		//根据用户名来实例化用户对象
		UserInfo user = userInfoDao.findUserByName(username);
      
		if (user != null && user.getPassword().equals(password)) 
		{
            return user;
        }
        
		return null;
	}

	@Override
	public List<Staff> findStaff(Map map) {
		// TODO Auto-generated method stub
		return userInfoDao.findStaff(map);
	}

	@Override
	public void insertStaff(Staff staff) {
		// TODO Auto-generated method stub
		userInfoDao.insertStaff(staff);
	}

	@Override
	public boolean updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		return userInfoDao.updateStaff(staff);
	}

	@Override
	public Staff findStaffById(int id) {
		// TODO Auto-generated method stub
		Staff staff = userInfoDao.findStaffById(id);
		return staff;
	}

	@Override
	public List<Name> findName(Map map) {
		// TODO Auto-generated method stub
		return userInfoDao.findName(map);
	}

	@Override
	public List<Salary> findSalary(Map map) {
		// TODO Auto-generated method stub
		return userInfoDao.findSalary(map);
	}

	@Override
	public void insertName(Name name) {
		// TODO Auto-generated method stub
		userInfoDao.insertName(name);
	}

	@Override
	public void insertSalary(Salary salary) {
		// TODO Auto-generated method stub
		userInfoDao.insertSalary(salary);
	}

	@Override
	public boolean updateName(Name name) {
		// TODO Auto-generated method stub
		return userInfoDao.updateName(name);
	}

	@Override
	public boolean updateSalary(Salary salary) {
		// TODO Auto-generated method stub
		return userInfoDao.updateSalary(salary);
	}

	@Override
	public Name findNameById(int id) {
		// TODO Auto-generated method stub
		return userInfoDao.findNameById(id);
	}

	@Override
	public Salary findSalaryById(int id) {
		// TODO Auto-generated method stub
		return userInfoDao.findSalaryById(id);
	}

	@Override
	public boolean deleteName(int id) {
		// TODO Auto-generated method stub
		return userInfoDao.deleteName(id);
	}

	@Override
	public boolean deleteSalary(int id) {
		// TODO Auto-generated method stub
		return userInfoDao.deleteSalary(id);
	}

	@Override
	public Name findNameSalary(String staff_num) {
		// TODO Auto-generated method stub
		return userInfoDao.findNameSalary(staff_num);
	}

	@Override
	public void insertUser(UserInfo user) {
		// TODO Auto-generated method stub
		userInfoDao.insertUser(user);
	}

	@Override
	public boolean updateUser(UserInfo user) {
		// TODO Auto-generated method stub
		return userInfoDao.updateUser(user);
	}

	@Override
	public boolean deleteUser(String username) {
		// TODO Auto-generated method stub
		return userInfoDao.deleteUser(username);
	}

	@Override
	public List<Staff> findStaffByName(String username) {
		// TODO Auto-generated method stub
		return userInfoDao.findStaffByName(username);
	}

	@Override
	public List<Salary> findSalaryByName(String username) {
		// TODO Auto-generated method stub
		return userInfoDao.findSalaryByName(username);
	}

	@Override
	public UserInfo findUserByName(String username) {
		// TODO Auto-generated method stub
		return userInfoDao.findUserByName(username);
	}
}
