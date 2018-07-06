package com.hxzy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hxzy.mapper.TbEmployeeMapper;
import com.hxzy.pojo.TbEmployee;
import com.hxzy.pojo.TbPay;
import com.hxzy.service.TbEmployeeService;
import com.hxzy.service.TbPayService;
import com.hxzy.service.impl.TbPayServiceImpl;

@Controller
public class TbPayController {
	
	@Autowired
	private TbPayService tbPayServiceImpl;
	@Autowired 
	private TbEmployeeService tbEmployeeServiceImpl;
	
	/**
	 * 分页查询薪资管理
	 * @param request
	 * @param pageNum
	 * @return
	 */
	@RequestMapping("/queryPay")
	public String queryPay(HttpServletRequest request, Integer pageNum, Model model) {
		
		int pageSize = 7;
		if (pageNum == null)
		{
			PageHelper.startPage(1,pageSize);
		}
		else {
			PageHelper.startPage(pageNum,pageSize);
		}
		
		List<TbPay> payList = tbPayServiceImpl.queryPay();
		List<TbEmployee> employees = tbEmployeeServiceImpl.selectEmps();
		PageInfo<TbPay> pageInfo = new PageInfo<TbPay>(payList);
		HttpSession session = request.getSession();
		model.addAttribute("payList", payList);
		model.addAttribute("payPageInfo", pageInfo);
		model.addAttribute("employees", employees);
		session.setAttribute("PayPageNum", pageInfo.getPageNum());
		
//		model.addAttribute("payList", queryPay);
		return "pay_query";
	}
	/**
	 * 添加薪资
	 * @param pay
	 * @return
	 */
	@RequestMapping("/insertOnePay")
	public String insertOnePay(TbPay pay) {
		String emnumberAndEname = pay.getPayEmnumber();
		String[] split = emnumberAndEname.split("-");
		pay.setPayEmnumber(split[0]);
		pay.setPayEmname(split[1]);
		int row = tbPayServiceImpl.insertPay(pay);
		if (row > 0) {
			return "pay_deawith";
		}
		return "redirect:/pay_insert.jsp";
	}
	/**
	 * 跳转到添加薪资页面，显示所有编号
	 * @param pay
	 * @return
	 */
	@RequestMapping("/pay_insert")
	public String pay_insert(Model model) {
		List<TbEmployee> queryEmp = tbEmployeeServiceImpl.selectEmps();
		model.addAttribute("emnumberList", queryEmp);
		return "pay_insert";
	}
	
	
	@RequestMapping("/deletePay")
	public String deletePay(Integer id) {
		int row = tbPayServiceImpl.deletePay(id);
		if (row > 0) {
			return "pay_deawith";
		}
		return "redirect:/pay_insert.jsp";
	}
	
	/**
	 * 按条件年月查询
	 * @return
	 */
	@RequestMapping("/queryPayByTime")
	public String queryPayByTime(String pay_month, Model model , Integer pageNum) {
		
		int pageSize = 7;
		if (pageNum == null)
		{
			PageHelper.startPage(1,pageSize);
		}
		else {
			PageHelper.startPage(pageNum,pageSize);
		}
		String subsTime = pay_month.substring(0, 7);
		List<TbPay> tbPays = tbPayServiceImpl.queryPayByTime(subsTime);
		PageInfo<TbPay> pageInfo = new PageInfo<TbPay>(tbPays);
		List<TbEmployee> employees = tbEmployeeServiceImpl.selectEmps();
		model.addAttribute("payList", tbPays);
		model.addAttribute("payPageInfo", pageInfo);
		model.addAttribute("employees", employees);
		model.addAttribute("pay_month", pay_month);
		return "pay_queryByTime";
	}
	
	@RequestMapping("/queryPayByPayEmnumber")
	public String queryPayByPayEmnumber(Model model, String emNumber, Integer pageNum) {
		int pageSize = 1;
		if (pageNum == null)
		{
			PageHelper.startPage(1,pageSize);
		}
		else {
			PageHelper.startPage(pageNum,pageSize);
		}
		List<TbPay> tbPays = tbPayServiceImpl.queryPayByEmnumber(emNumber);
		List<TbEmployee> employees = tbEmployeeServiceImpl.selectEmps();
		PageInfo<TbPay> pageInfo = new PageInfo<TbPay>(tbPays);
		model.addAttribute("payList", tbPays);
		model.addAttribute("payPageInfo", pageInfo);
		model.addAttribute("employees", employees);
		model.addAttribute("emNumber", emNumber);
		return "pay_queryByEmnumber";
	}
}
