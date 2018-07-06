<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%

if(request.getAttribute("result")!=null){
	out
		.print("<script type='text/javascript'>alert('"+request.getAttribute("result")+"');history.go(-1);</script>");
}else{
out
		.print("<script type='text/javascript'>window.location.href='queryDepList';</script>");
}

%>