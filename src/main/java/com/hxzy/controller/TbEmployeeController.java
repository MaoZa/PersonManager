package com.hxzy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hxzy.pojo.TbDepartment;
import com.hxzy.pojo.TbEmployee;
import com.hxzy.service.TbDepartmentService;
import com.hxzy.service.TbEmployeeService;

@Controller
public class TbEmployeeController {
	//注入接口
	@Autowired
	private TbEmployeeService tbEmployeeService;
	
	@Autowired
	private TbDepartmentService tbDepartmentService;
	/**
	 * 分页查询所有员工
	 * @return
	 */
	@RequestMapping("/queryEmpList")
	public String queryEmpList(HttpServletRequest request, Integer pageNum, Model model) {
		int pageSize = 7;
		if (pageNum == null)
		{
			PageHelper.startPage(1,pageSize);
		}
		else {
			PageHelper.startPage(pageNum,pageSize);
		}
		
		List<TbEmployee> empList = tbEmployeeService.selectEmps();
		List<TbDepartment> deps = tbDepartmentService.selectDeps();
		
		PageInfo<TbEmployee> pageInfo = new PageInfo<TbEmployee>(empList);
		
		HttpSession session = request.getSession();
		session.setAttribute("employees", empList);
		session.setAttribute("empPageInfo", pageInfo);
		session.setAttribute("departments", deps);
		
		/*model.addAttribute("employees", empList);
		model.addAttribute("departments", deps);*/
		session.setAttribute("EmpPageNum", pageInfo.getPageNum());
		return "employee_query";
	}
	
	
	@RequestMapping("/queryOneEmployee/{id}")
	public String queryOneEmployee(@PathVariable Integer id, Model model) {
		model.addAttribute("employee",tbEmployeeService.queryOneEmployee(id));
		return "employee_queryOne";
	}
	
	
	@RequestMapping("/delOneEmployee/{id}")
	public String delOneEmployee(@PathVariable Integer id) {
		tbEmployeeService.delOneEmployee(id);
		return "redirect:/queryEmpList";
	}
	/**
	 * 跳转到员工更新页面
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/updateOneEmployeeUI/{id}")
	public String updateOneEmployeeUI(@PathVariable Integer id,HttpServletRequest request, Model model) {
		TbEmployee employee = tbEmployeeService.queryOneEmployee(id);
		model.addAttribute("employee", employee);
		
		//查询部门名称
		List<TbDepartment> list = tbDepartmentService.selectDeps();
		HttpSession session = request.getSession();
		session.setAttribute("categoryList", list);
		return "employee_update";
	}
	/**
	 * 更新员工信息
	 * @param employee
	 * @return
	 */
	@RequestMapping("/updateOneEmployee/{id}")
	public String updateOneEmployee(@PathVariable Integer id,TbEmployee employee) {
		System.out.println("id:" + id);
		employee.setId(id);
		System.out.println("-----"+employee);
		tbEmployeeService.updateOneEmployee(employee);
		return "redirect:/queryEmpList";
	}
	/**
	 * 跳转到员工插入页面
	 * @return
	 */
	@RequestMapping("/employee_insert")
	public String forwardInsertEmployee(HttpServletRequest request) {
		//查询部门名称
		List<TbDepartment> list = tbDepartmentService.selectDeps();
		HttpSession session = request.getSession();
		session.setAttribute("categoryList", list);
		return "employee_insert";
	}
	/**
	 * 添加员工信息
	 * @return
	 */
	@RequestMapping("/insertOneEmployee")
	public String insertOneEmployee(TbEmployee emp) {
		System.out.println(emp.getEmDepartmentid());
		int row = tbEmployeeService.insertEmployee(emp);
		if (row > 0) {
			return "employee_deawith";
		}
		return "employee_insert";
	}
}
