package edu20191116.day1.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu20191116.day1.dao.DeptDAO;
import edu20191116.day1.dao.EmpDAO;
import edu20191116.day1.dao.mapper.DeptMapper;
import edu20191116.day1.dao.mapper.EmpMapper;
import edu20191116.day1.vo.DeptInfo;
import edu20191116.day1.vo.EmpInfo;

@Component("EmpDAO")
public class EmpDAOImpl implements EmpDAO {

	@Autowired
	private EmpMapper empMapper;

	public List<EmpInfo> getEmpList() {
		return empMapper.getEmpList();
	}

	public Integer getEmpcount() {
		// TODO Auto-generated method stub
		return empMapper.getEmpCount();
	}

	public EmpInfo getEmpById(Integer empno) {
		// TODO Auto-generated method stub
		return empMapper.getEmpById(empno);
	}

	public Integer addEmp(EmpInfo emp) {
		// TODO Auto-generated method stub
		return empMapper.addEmp(emp);
	}

	@Override
	public Integer updateEmp(EmpInfo emp) {
		// TODO Auto-generated method stub
		return empMapper.updateEmp(emp);
	}

	@Override
	public Integer deleteEmp(Integer empno) {
		// TODO Auto-generated method stub
		return empMapper.deleteEmp(empno);
	}

	@Override
	public Integer getDeptcount() {
		// TODO Auto-generated method stub
		return null;
	}

}
