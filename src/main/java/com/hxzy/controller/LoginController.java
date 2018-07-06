package com.hxzy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hxzy.pojo.TbManager;
import com.hxzy.service.TbManagerService;

/**
 * 管理员登录
 * @author Saber
 *
 */
@Controller
public class LoginController {
	
	@Autowired
	private TbManagerService tbManagerService;

	@RequestMapping("/login")
	public String login(HttpServletRequest request, TbManager manager) {
		//得到页面传过来的用户名和密码，传递给Service
		String account = manager.getAccount();
		String password = manager.getPassword();
		/*System.out.println(account);
		System.out.println(password);*/
		TbManager manager2 = tbManagerService.queryOneManager(account, password);
		//把用户名和密码保存到Session中
		if (manager2 != null)
		{
			HttpSession session = request.getSession();
			session.setAttribute("manager", manager2);
			return "mainPage";
		}
		return "redirect:/index.jsp";
	}
	/**
	 * ajax检查用户是否存在
	 */
	@RequestMapping("/checkAccount")
	@ResponseBody
	public TbManager checkAccount(String account) {
//		return "success";
		List<TbManager> user = tbManagerService.checkManager(account);
		if (user.size() != 0)			
			return user.get(0);
		else
			return null;
	}
	
	/**
	 * 验证密码是否正确
	 * @param account
	 * @param password
	 * @return
	 */
	@RequestMapping("/checkPwd")
	@ResponseBody
	public TbManager checkPwd(String account, String password) {
		TbManager user = tbManagerService.queryOneManager(account, password);
		if (user != null)			
			return user;
		else
			return null;
	}
	
}
