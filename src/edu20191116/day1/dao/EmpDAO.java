package edu20191116.day1.dao;

import java.util.List;

import edu20191116.day1.vo.DeptInfo;
import edu20191116.day1.vo.EmpInfo;

public interface EmpDAO {

	Integer getDeptcount();

	EmpInfo getEmpById(Integer empno);

	Integer getEmpcount();

	Integer addEmp(EmpInfo emp);

	Integer updateEmp(EmpInfo emp);

	Integer deleteEmp(Integer empno);

	List<EmpInfo> getEmpList();

}
