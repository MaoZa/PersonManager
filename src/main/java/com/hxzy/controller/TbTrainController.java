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
import com.hxzy.pojo.TbTrain;
import com.hxzy.service.impl.TbTrainServiceImpl;

@Controller
public class TbTrainController {
	
	@Autowired
	TbTrainServiceImpl tbTrainServiceImpl;
	
	/**
	 * 分页培训
	 * @param request
	 * @param pageNum
	 * @return
	 */
	@RequestMapping("/queryTrain")
	public String queryTrain(HttpServletRequest request, Integer pageNum, Model model) {
		
		int pageSize = 7;
		if (pageNum == null)
		{
			PageHelper.startPage(1,pageSize);
		}
		else {
			PageHelper.startPage(pageNum,pageSize);
		}
		
		List<TbTrain> trainList = tbTrainServiceImpl.queryTrain();
		
		PageInfo<TbTrain> pageInfo = new PageInfo<TbTrain>(trainList);
		HttpSession session = request.getSession();
		session.setAttribute("trainList", trainList);
		session.setAttribute("trainPageInfo", pageInfo);

		session.setAttribute("TrainPageNum", pageInfo.getPageNum());
//		model.addAttribute("trains", list);
		return "train_query";
	}
	
	@RequestMapping("/trainqueryOne/{id}")
	public String queryTrainOne(@PathVariable Integer id, Model model) {
		model.addAttribute("train", tbTrainServiceImpl.queryTrainOne(id));
		return "train_queryOne";
	}
	
	@RequestMapping("/deleteTrain/{id}")
	public String deleteTrain(@PathVariable Integer id) {
		tbTrainServiceImpl.deleteTrain(id);
		return "train_query";
	}
	@RequestMapping("/insertOneTrain")
	public String insertOneTrain(TbTrain train) {
		int row = tbTrainServiceImpl.insertTrain(train);
		if (row > 0) {
			return "train_deawith";
		}
		return "redirect:/train_insert.jsp";
	}
	
}
