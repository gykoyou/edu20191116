package edu20191116.day1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu20191116.day1.dao.DeptDAO;
import edu20191116.day1.dao.EmpDAO;
import edu20191116.day1.dao.mapper.EmpMapper;
import edu20191116.day1.service.EmpService;
import edu20191116.day1.vo.DeptInfo;
import edu20191116.day1.vo.EmpInfo;

@Service("empService")

public class EmpServicelmpl implements EmpService {

	@Autowired
	private EmpDAO empDAO;

	@Override
	public List<EmpInfo> getEmpList() {

		return empDAO.getEmpList();
	}

	@Override
	public EmpInfo getEmpById(Integer empno) {
		// TODO Auto-generated method stub
		return empDAO.getEmpById(empno);
	}

	@Override
	public Integer getEmpCount() {
		// TODO Auto-generated method stub
		return empDAO.getEmpcount();
	}

	public Integer addEmp(EmpInfo emp) {
		return empDAO.addEmp(emp);
	}

	public Integer updateEmp(EmpInfo emp) {
		return empDAO.updateEmp(emp);

	}

	public Integer deleteEmp(Integer empno) {

		return empDAO.deleteEmp(empno);
	}

}
