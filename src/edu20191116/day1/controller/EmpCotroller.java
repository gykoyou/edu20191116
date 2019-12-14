package edu20191116.day1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu20191116.day1.service.EmpService;
import edu20191116.day1.vo.EmpInfo;

@Controller
@RequestMapping("/emp")
public class EmpCotroller {
	@Autowired
	private EmpService empService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String getEmpList(ModelMap modelMap) {
//查询部门总数
		Integer cnt = empService.getEmpCount();
		List<EmpInfo> list = empService.getEmpList();

		modelMap.addAttribute("cnt", cnt);
		modelMap.addAttribute("list", list);
		return "emp";
	}

	@RequestMapping(value = "/{empno}", method = RequestMethod.GET)
	@ResponseBody
	public EmpInfo getDept(@PathVariable Integer empno) {
		return empService.getEmpById(empno);

	}

}
