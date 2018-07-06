<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<title>措滹企业人力资源管理系统--登录</title>
		<link rel="stylesheet" type="text/css" href="css/login.css" />
		<link rel="stylesheet" href="css/buttons.css">
		<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
		<script type="text/javascript" src="js/jquery.validate.js"></script>
		<script type="text/javascript">
			function checkManager(){
				if(document.managerForm.account.value==""){
					window.alert("请输入账号");
				return false;
				}
				if(document.managerForm.password.value==""){
					window.alert("请输入密码");
					return false;
				}
				return true;
			}
		</script>
		<script type="text/javascript">
			$(function (){
				//alert(1);
				//用户名
				$("input[name='account']").blur(function (){
					//alert(1);
					$.ajax({
						url:"checkAccount",
						type:"POST",
						data:{account:$("input[name='account']").val()},
						dataType:"json",
						success:function result(data) {
							if (data == null) {
								$("#loginInfo").text("账号不存在！");
								$("#loginInfo").css("color","red");
							} else {
								$("#loginInfo").text("");
							}
						},
						error:function err(data){
						}
					});
				});
				
				//表单验证
				$("#loginForm").validate({
					rules:{
						account:{
							required:true,
							minleng:3
						},
						password:{
							required:true,
							minlength:3
						}
					},
					
					messages:{
						account:{
							required:"账号必填",
							minlength:"至少3位"
						},
						password:{
							required:"密码必填",
							minlength:"至少3位"
						}
					}
				});
				
				//密码
				$(":password").blur(function (){
					//alert(1);
					$.ajax({
						url:"checkPwd",
						type:"POST",
						data:{
							account:$("input[name='account']").val(),
							password:$("input[name='password']").val()
						},
						dataType:"json",
						success:function result(data) {
							if (data == null) {
								$("#loginInfo").text("密码不正确！");
								$("#loginInfo").css("color","red");
							} else {
								$("#loginInfo").text("");
							}
						},
						error:function err(data){
						}
					});
				});
				
				
			});
		</script>
	</head>
	
	<body>
		<div class="login">
			<img src="img/login_logo.png" />
			<form action="login" method="post" id="loginForm">
				<input type="text" name="account" id="" value="" placeholder="账号："/><br />
				<input type="password" name="password" id="" value="" placeholder="密码："/><br />
				<input type="submit" class="button button-glow button-rounded button-highlight" value="登录"/>
			</form>
			<span id="loginInfo" style="color: black"></span>
		</div>
	</body>

</html>