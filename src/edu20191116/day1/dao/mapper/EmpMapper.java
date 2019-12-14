package edu20191116.day1.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import edu20191116.day1.vo.DeptInfo;
import edu20191116.day1.vo.EmpInfo;

public interface EmpMapper {
	
	
	@Select("select empno,ename,job,mgr,hiredate,sal,deptno from emp")
	@ResultMap("empResultMap")
	List<EmpInfo> getEmpList();
	
	
	@Select("select count(*) from emp")
	Integer getEmpCount();
	
	@Select("select * from emp where empno = #{id}")
	EmpInfo getEmpById(@Param("id") Integer empno);
	
	Integer addEmp(EmpInfo emp);

	Integer updateEmp(EmpInfo emp);
	
	@Delete("delete  from emp where epmno = #{empno}")
	Integer deleteEmp(Integer empno);


}
