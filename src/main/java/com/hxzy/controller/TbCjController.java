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
import com.hxzy.pojo.TbCj;
import com.hxzy.service.TbCjService;

@Controller
public class TbCjController {
	
	@Autowired
	private TbCjService tbCjServiceImpl;

	/**
	 * 查询每页奖惩信息
	 * @param request
	 * @param pageNum
	 * @return
	 */
	@RequestMapping("/queryCj")
	public String queryCj(HttpServletRequest request, Integer pageNum, Model model) {
		int pageSize = 7;
		if (pageNum == null)
		{
			PageHelper.startPage(1,pageSize);
		}
		else {
			PageHelper.startPage(pageNum,pageSize);
		}
		List<TbCj> cjs = tbCjServiceImpl.queryCj();
		PageInfo<TbCj> pageInfo = new PageInfo<TbCj>(cjs);
		HttpSession session = request.getSession();
		session.setAttribute("CjPageInfo", pageInfo);
		session.setAttribute("cjList", cjs);
		session.setAttribute("CjPageNum", pageInfo.getPageNum());
		return "cj_query";
	}
	
	@RequestMapping("/queryOneCj/{id}")
	public String queryOneCj(@PathVariable Integer id, Model model) {
		model.addAttribute("cj", tbCjServiceImpl.queryOneCj(id));
		return "cj_queryOne";
	}
	
	/**
	 * 添加奖惩信息，并点击保存按钮
	 * @param cj
	 * @return
	 */
	@RequestMapping("/insertCj")
	public String insertCj(TbCj cj) {
		/*System.out.println(cj.getCjTitle());
		return "test";*/
		int i = tbCjServiceImpl.insertCj(cj);
		if (i > 0)
			return "cj_deawith";
		return "redirect:/cj_insert.jsp";
	}
	/**
	 * 删除奖惩信息
	 * @param cj
	 * @return
	 */
	@RequestMapping("/deleteCj")
	public String deleteCj(int id) {
		/*System.out.println(cj.getCjTitle());
		return "test";*/
		int i = tbCjServiceImpl.deleteCj(id);
		if (i > 0)
			return "cj_deawith";
		return "redirect:/cj_query.jsp";
	}
}
