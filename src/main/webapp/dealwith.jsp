<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>无标题文档</title>
</head>
<body>
<%
if(request.getAttribute("errorNews")!=null){
String errorNews=(String)request.getAttribute("errorNews");
out.print("<script type='text/javascript'>alert('"+errorNews+"');history.go(-1);</script>");
}else{
out.print("<script type='text/javascript'>window.location.href='mainPage.jsp';</script>");
}
%>
</body>
</html>
