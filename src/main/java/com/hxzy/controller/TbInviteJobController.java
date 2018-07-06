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
import com.hxzy.pojo.TbEmployee;
import com.hxzy.pojo.TbInvitejob;
import com.hxzy.service.TbEmployeeService;
import com.hxzy.service.TbInviteJobService;
import com.hxzy.utils.PackTbEmployee;

@Controller
public class TbInviteJobController {
	
	@Autowired
	TbInviteJobService tbInviteJobServiceImpl;
	@Autowired
	TbEmployeeService TbEmployeeServiceImpl;
	@RequestMapping("/queryInviteJob")
	public String queryInviteJob(HttpServletRequest request, Integer pageNum, Integer isstock, Model model) {
		
		int pageSize = 7;
		if (pageNum == null)
		{
			PageHelper.startPage(1,pageSize);
		}
		else {
			PageHelper.startPage(pageNum,pageSize);
		}
		
		List<TbInvitejob> inviteJobList = null;
		if (isstock == null) {
			inviteJobList = tbInviteJobServiceImpl.queryInviteJobByIsstock(0);
		}
		else if (isstock == 1) {
			inviteJobList = tbInviteJobServiceImpl.queryInviteJobByIsstock(1);
		}
		else if (isstock == 0) {
			inviteJobList = tbInviteJobServiceImpl.queryInviteJobByIsstock(0);
		}
		/*model.addAttribute("invites", queryInviteJob);*/
		
		PageInfo<TbInvitejob> pageInfo = new PageInfo<TbInvitejob>(inviteJobList);
		HttpSession session = request.getSession();
		session.setAttribute("inviteJobList", inviteJobList);
		session.setAttribute("inviteJobPageInfo", pageInfo);

		session.setAttribute("InvPageNum", pageInfo.getPageNum());
		return "inviteJob_query";
	}
	
	@RequestMapping("/queryOneInviteJob/{id}")
	public String queryOneInviteJob(@PathVariable Integer id, Model model){
		model.addAttribute("Invite", tbInviteJobServiceImpl.queryOneInviteJob(id));
		return "inviteJob_queryOne";
	}
	/**
	 * 添加应聘人信息
	 */
	@RequestMapping("/insertInviteJob")
	public String insertInviteJob(TbInvitejob invitejob) {
		int row = tbInviteJobServiceImpl.insertInviteJob(invitejob);
		if (row > 0) {
			return "inviteJob_operation";
		}
		return "redirect:/inviteJob_insert.jsp";
	}
	
	
	@RequestMapping("InviteJob/{id}")
	public String InviteJob(Model model, @PathVariable int id) {
		TbInvitejob invitejob = tbInviteJobServiceImpl.queryOneInviteJob(id);
		TbEmployee tbEmployee = PackTbEmployee.PackTbInviteJobToTbEmployee(invitejob);
		TbEmployeeServiceImpl.insertEmployee(tbEmployee);
		tbInviteJobServiceImpl.updateInviteJobIsstock(invitejob, 1);
		return "redirect:/queryInviteJob";
	}
}
