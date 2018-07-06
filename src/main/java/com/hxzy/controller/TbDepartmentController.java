package com.hxzy.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hxzy.pojo.TbDepartment;
import com.hxzy.service.impl.TbDepartmentServiceImpl;

@Controller
public class TbDepartmentController {
	
	@Autowired
	private TbDepartmentServiceImpl tbDepartmentServiceImpl;
	/*@RequestMapping("queryDepList")
	public String queryDepList(HttpServletRequest request) {
		List<TbDepartment> list = tbDepartmentServiceImpl.selectDeps();
		request.getSession().setAttribute("departments", list);
		request.getSession().setAttribute("countPack", tbDepartmentServiceImpl.depCountPerson());
		return "department_query";
	}*/
	/**
	 * 添加部门信息
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping("/insertDepartment")
	public String insertDepartment(TbDepartment dep) {
		int row = tbDepartmentServiceImpl.insertDepartment(dep);
		if (row > 0) {
			return "department_deawith";
		}
		return "redirect:/department_insert.jsp";
	}
	/**
	 * 删除部门信息
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping("/deleteDepartment")
	public String deleteDepartment(int id) {
		int i = tbDepartmentServiceImpl.deleteDepartment(id);
		if (i > 0)
			return "department_deawith";
		return "redirect:/department_query.jsp";
	}
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/queryDepList")
	public String page(HttpServletRequest request, Integer pageNum, Model model) {
		int pageSize = 7;
		if (pageNum == null)
		{
			PageHelper.startPage(1,pageSize);
		}
		else {
			PageHelper.startPage(pageNum,pageSize);
		}
		List<TbDepartment> list = tbDepartmentServiceImpl.selectDeps();
		PageInfo<TbDepartment> pageInfo = new PageInfo<>(list);
		System.out.println(pageInfo);
		System.out.println(list.size());
		//把分页信息存储到Session中，自动生成
		HttpSession session = request.getSession();
		session.setAttribute("pageInfo", pageInfo);
		
		session.setAttribute("departments", list);
		Map<Long, Long> map = tbDepartmentServiceImpl.depCountPerson();
		session.setAttribute("countPack", map);
		//把Map数据存放到List中
		/*List<Long> countPack = new ArrayList<Long>();
		for (Map.Entry<Long, Long> entry : map.entrySet()) {
			countPack.add(entry.getValue());
		}
		System.out.println(countPack.size());
		System.out.println(countPack);
		session.setAttribute("countPackList", countPack);*/

		session.setAttribute("DepPageNum", pageInfo.getPageNum());
		return "department_query";
	}
}
