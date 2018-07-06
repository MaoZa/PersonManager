<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>措滹人力资源管理系统--系统管理</title>
<script type="text/javascript">
	onload=function(){
		
		setInterval(go, 1000);
	};
	var x = 3;
	function go() {
		x--;
		if (x > 0) {
			document.getElementById("spanTime").innerHTML = x;
		} else {
			location.href="index.jsp";
		}
	}
</script>
</head>
<body>
	管理员密码修改成功，请重新登录。
	<span id="spanTime">3</span>s后页面跳转
</body>
</html>