package com.hxzy.web.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.hxzy.pojo.TbManager;
/**
 * 登录拦截器
 * @author HXZY
 *
 */
public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//不能拦截login和index.jsp
		String uri = request.getRequestURI();
		//System.out.println(uri);
		if (uri.contains("login") || uri.contains("check")) {
			return true;
		}
		
		//从Session中取到用户名
		HttpSession session = request.getSession();
		TbManager manager = (TbManager) session.getAttribute("manager");
		//如果不存在就拦截
		//存在就放行
		if (manager != null) {
			return true;
		}
		response.sendRedirect("index.jsp");
		return false;
		/*String account = manager.get(0).getAccount();
		
		if (account != null && account != "")
		{
			return true;
		}
		response.sendRedirect("/index.jsp");
		return false;*/
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}


}
