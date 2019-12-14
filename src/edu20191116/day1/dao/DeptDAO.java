package edu20191116.day1.dao;

import java.util.List;

import edu20191116.day1.vo.DeptInfo;

public interface DeptDAO {

	List<DeptInfo> getDeptList();

	Integer getDeptcount();

	DeptInfo getDeptById(Integer deptno);

	Integer addDept(DeptInfo dept);

	Integer updateDept(DeptInfo dept);

	Integer deleteDept(Integer deptno);

	List<DeptInfo> getDeptList(Integer cursor, Integer offset);

}
