package edu20191116.day1.service;

import java.util.List;

import edu20191116.day1.vo.DeptInfo;
import edu20191116.day1.vo.EmpInfo;

public interface EmpService {

	List<EmpInfo> getEmpList();

	Integer getEmpCount();

	EmpInfo getEmpById(Integer deptno);

	Integer addEmp(EmpInfo emp);

	Integer updateEmp(EmpInfo emp);

	Integer deleteEmp(Integer empno);

}
