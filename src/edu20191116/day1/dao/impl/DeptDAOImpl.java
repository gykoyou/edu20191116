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
import edu20191116.day1.dao.mapper.DeptMapper;
import edu20191116.day1.vo.DeptInfo;

@Component("deptDAO")
public class DeptDAOImpl implements DeptDAO {

	@Autowired
	private DeptMapper deptMapper;

	@Override
	public List<DeptInfo> getDeptList() {
		return deptMapper.getDeptList();
	}

	@Override
	public Integer getDeptcount() {
		// TODO Auto-generated method stub
		return deptMapper.getDeptCount();
	}

	@Override
	public DeptInfo getDeptById(Integer deptno) {
		// TODO Auto-generated method stub
		return deptMapper.getDeptById(deptno);
	}

	@Override
	public Integer addDept(DeptInfo dept) {
		// TODO Auto-generated method stub
		return deptMapper.addDept(dept);
	}

	@Override
	public Integer updateDept(DeptInfo dept) {
		// TODO Auto-generated method stub
		return deptMapper.updateDept(dept);
	}

	@Override
	public Integer deleteDept(Integer deptno) {
		// TODO Auto-generated method stub
		return deptMapper.deleteDept(deptno);
	}

	@Override
	public List<DeptInfo> getDeptList(Integer cursor, Integer offset) {

		return deptMapper.getDeptPage(cursor,offset);
	}

}
