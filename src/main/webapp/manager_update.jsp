<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>措滹人力资源管理系统--系统管理</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<script type="text/javascript">
function updatePasswordManager(){
if(document.managerForm.oldPassword1.value==""){
window.alert("请输入旧密码");
return false;
}
if(document.managerForm.oldPassword1.value!=document.managerForm.oldPassword2.value){
window.alert("您输入的密码与原来的密码不一致");
return false;
}
if(document.managerForm.password.value==""){
window.alert("请输入新密码");
return false;
}
if(document.managerForm.newPassword.value==""){
window.alert("请输入确认密码");
return false;
}
if(document.managerForm.password.value!=document.managerForm.newPassword.value){
window.alert("您输入的新密码与密码确认不一致");
return false;
}
return true;
}
</script>
<!-- 引入JQuery -->
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<!-- 引入JQuery.validate验证 -->
<script type="text/javascript" src="js/jquery.validate.js"></script>

<script type="text/javascript">
	$(function (){
		//绑定onblur
		$("#oldPassword1").blur(function a1(){
			//获得输入密码的值
			var oldPassword1 = $("#oldPassword1").val();
			var oldPassword2 = $("#oldPassword2").val();
			//验证密码
			if (oldPassword1 == oldPassword2) {
				$("#oldPasswordInfo").css("color", "green");
				$("#oldPasswordInfo").text("√");
			}
			else {
				$("#oldPasswordInfo").css("color", "red");
				$("#oldPasswordInfo").text("×");
			}
			
		});
		
		$("#newPassword").blur(function b1(){
			//获得输入密码的值
			var password = $("#password").val();
			var newPassword = $("#newPassword").val();
			//验证密码
			if (newPassword == password) {
				$("#newPasswordInfo").css("color", "green");
				$("#newPasswordInfo").text("√");
			}
			else {
				$("#newPasswordInfo").css("color", "red");
				$("#newPasswordInfo").text("×");
			}
			
		});
		
		//validate校验
		$("#updateManager").validate({
			rules: {
				oldPassword1: {
					required: true,
					minlength: 3,
					maxlength: 16
				},
				password: {
					required: true,
					minlength: 3,
					maxlength: 16
				},
				newPassword:  {
					required: true,
					minlength: 3,
					maxlength: 16,
					equalTo: "#password"
				}
				
			},
			
			messages: {
				oldPassword1: {
					required: "请输入你的旧密码",
					minlength: "密码至少3位",
					maxlength: "密码最长16位"
				},
				password: {
					required: "请输入你的新密码",
					minlength: "密码至少3位",
					maxlength: "密码最长16位"
				},
				newPassword: {
					required: "请确认你的新密码",
					minlength: "密码至少3位",
					maxlength: "密码最长16位",
					equalTo: "密码不同"
				},
			}
		});
	});
</script>


<body>
<table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center">
    
	  
	     <table width="801" height="48" border="0" cellpadding="0" cellspacing="0" background="images/center1.jpg">
        <tr>
          <td valign="top"><table width="494">
            <tr>
              <td width="45" height="25">&nbsp;</td>
              <td width="437" valign="bottom"><font color="#FF0000">用户修改</font></td>
            </tr>
          </table></td>
        </tr>
      </table>
      <table width="801" height="436" border="0" cellpadding="0" cellspacing="0" background="images/center2.jpg">
        <tr>
          <td height="243" valign="top" align="center">
          <!--  onsubmit="return updatePasswordManager()" -->
		 <form action="updateManager" method="post" id="updateManager">
		  <table width="400" border="1" align="center" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="66583D">
            <tr>
              <th width="100" height="30"><span class="word_white">账&nbsp;&nbsp;号：</span></th>
              <td width="287" bgcolor="#FFFFFF">${manager.account}<input type="hidden" name="account" value="${manager.account}"/></td>
            </tr>
            <tr>
              <th height="30"><span class="word_white">旧密码：</span></th>
              <td bgcolor="#FFFFFF"><input id="oldPassword1" name="oldPassword1" type="password" size="30"><input id="oldPassword2" name="oldPassword2" type="hidden" value="${manager.password}">
              <span id="oldPasswordInfo"></span>
              </td>
            </tr>
            <tr>
              <th height="30"><span class="word_white">新密码：</span></th>
              <td bgcolor="#FFFFFF"><input id="password" type="password" name="password" size="30"/><input type="hidden" name="id" value="${manager.id}"/></td>
            </tr>
		    <tr>
              <th height="30"><span class="word_white">确认密码：</span></th>
              <td bgcolor="#FFFFFF"><input id="newPassword" name="newPassword" type="password" size="30"><input type="hidden" name="managerLevel" value="${manager.managerlevel}"/>
              <span id="newPasswordInfo"></span>
              </td>
            </tr>
          </table>
		  <br>           
              <input type="submit" name="Submit2" value="保存">
              &nbsp;&nbsp;
              <input type="reset" name="Submit" value="重置">
          </form>
            <br>
          
            
		  </td>
        </tr>
      </table>
    </td>
  </tr>
</table>
</body>
</html>
