package com.hxzy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hxzy.pojo.TbManager;
import com.hxzy.service.TbManagerService;

@Controller
public class TbManagerController {
	
	@Autowired
	private TbManagerService tbManagerService; 
	
	/**
	 * 管理员密码修改
	 * @param manager
	 * @return
	 */
	@RequestMapping("/updateManager")
	public String updateManager(TbManager manager) {
		//用户密码修改
		int i = tbManagerService.updateManager(manager);
		if (i > 0) {
			//修改成功，返回登录
			return "manager_deawith";
		}
		return "redirect:/manager_update.jsp";
	}
	
	@RequestMapping("/queryManager")
	public String queryManager(Model model) {
		List<TbManager> list = tbManagerService.queryManager();
		model.addAttribute("managerList", list);
		return "manager_query";
	}
	
	
	@RequestMapping("/insertManager")
	public String insertManager(TbManager manager) {
		tbManagerService.insertManager(manager);
		return "redirect:/queryManager";
	}
	
	
	@RequestMapping("/deleteManager")
	public String deleteManager(Integer id) {
		tbManagerService.deleteManager(id);
		return "redirect:/queryManager";
	}
	/**
	 * 验证用户名密码是否正确
	 * @param model
	 * @return
	 */
	@RequestMapping("/checkManager")
	@ResponseBody
	public String checkManager(HttpServletRequest request) {
		//用户登录，Session中有用户名和密码信息，直接获得
		HttpSession session = request.getSession();
		TbManager tbManager = (TbManager) session.getAttribute("manager");
		if (tbManager != null) {
			return "success";
		}
		return "fail";
	}
}
