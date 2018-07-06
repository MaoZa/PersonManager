<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="css/style.css">
<title>措滹企业人力资源管理系统--登录</title>
</head>
<!-- 引入JQuery -->
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<!-- 引入validate验证 -->
<script type="text/javascript" src="js/jquery.validate.js"></script>
<!-- 引入中文验证提示 -->
<script type="text/javascript" src="js/messages_zh.js"></script>
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




<body>





<table width="100%" height="100%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td>
    <!-- method默认get  onsubmit="return checkManager()" -->
	<form action="login" method="post" id="loginForm">
	<table width="550" height="371" border="0" align="center" cellpadding="0" cellspacing="0" background="images/managerLand.jpg">
	 <tr>
	    <td valign="bottom">
		<table height="100" align="center">
	      <tr>
	        <td width="50" height="63">账号：</td>
	        <td width="149"><input type="text" name="account"/></td>
	        <td width="50">密码：</td>
	        <td width="150"><input type="password" name="password"/></td>
	        <td width="70">
			<input type="image" src="images/land.gif" class="img1">
	        </td>
	     </tr>
    </table>
    </td>
  </tr>
  
</table>
	</form>
	</td>
	
	
  </tr>
  
  <tr>
  <td align="center"><span id="loginInfo"></span></td>
  </tr>
  
</table>

</body>
</html>
