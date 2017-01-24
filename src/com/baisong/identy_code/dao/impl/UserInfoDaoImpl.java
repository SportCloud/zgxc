package com.baisong.identy_code.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.baisong.identy_code.dao.UserInfoDao;
import com.baisong.identy_code.domain.AdminInfo;
import com.baisong.identy_code.domain.Name;
import com.baisong.identy_code.domain.Salary;
import com.baisong.identy_code.domain.Staff;
import com.baisong.identy_code.domain.UserInfo;
import com.baisong.identy_code.mapper.UserInfoMapper;

@Repository
public class UserInfoDaoImpl extends SqlSessionDaoSupport implements UserInfoDao {
/*
 * mybatis3.2.2 + mybatis-spring1.2.0必须自己注入sqlSessionFactory
 * 
 */
	@Resource
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
	{
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	@Override
	public UserInfo findUserByName(String username) 
	{
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		return mapper.getUserByName(username);
	}


	@Override
	public List<Staff> findStaff(Map map) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		return mapper.findStaff(map);
	}

	@Override
	public void insertStaff(Staff staff) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		mapper.insertStaff(staff);
	}

	@Override
	public boolean updateStaff(Staff staff) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		return mapper.updateStaff(staff);
	}

	@Override
	public Staff findStaffById(int id) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		Staff staff = mapper.findStaffById(id);
		return staff;
	}


	@Override
	public List<Name> findName(Map map) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		return mapper.findName(map);
	}

	@Override
	public List<Salary> findSalary(Map map) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		return mapper.findSalary(map);
	}

	@Override
	public void insertName(Name name) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		mapper.insertName(name);
	}

	@Override
	public void insertSalary(Salary salary) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		mapper.insertSalary(salary);
	}

	@Override
	public boolean updateName(Name name) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		return mapper.updateName(name);
	}

	@Override
	public boolean updateSalary(Salary salary) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		return mapper.updateSalary(salary);
	}

	@Override
	public Name findNameById(int id) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		return mapper.findNameById(id);
	}

	@Override
	public Salary findSalaryById(int id) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		return mapper.findSalaryById(id);
	}

	@Override
	public boolean deleteName(int id) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		return mapper.deleteName(id);
	}

	@Override
	public boolean deleteSalary(int id) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		return mapper.deleteSalary(id);
	}


	@Override
	public Name findNameSalary(String staff_num) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		return mapper.findNameSalary(staff_num);
	}

	@Override
	public void insertUser(UserInfo user) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		mapper.insertUser(user);
	}

	@Override
	public boolean updateUser(UserInfo user) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		return mapper.updateUser(user);
	}

	@Override
	public boolean deleteUser(String username) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		return mapper.deleteUser(username);
	}

	@Override
	public List<Staff> findStaffByName(String username) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		return mapper.findStaffByName(username);
	}

	@Override
	public List<Salary> findSalaryByName(String username) {
		// TODO Auto-generated method stub
		UserInfoMapper mapper = this.getSqlSession().getMapper(UserInfoMapper.class);
		return mapper.findSalaryByName(username);
	}

}
