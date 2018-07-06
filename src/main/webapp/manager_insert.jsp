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
function insertManager(){
if(document.managerForm.account.value==""){
window.alert("请输入账号");
return false;
}
if(!isNaN(managerForm.account.value)){
window.alert("您输入账号不能完全是数字");
return false;
}
if(document.managerForm.password.value==""){
window.alert("请输入密码");
return false;
}
if(document.managerForm.newPassword.value==""){
window.alert("请输入确认密码");
return false;
}
if(document.managerForm.password.value!=document.managerForm.newPassword.value){
window.alert("您输入的新密码与确认密码确认不一致");
return false;
}
return true;
}
</script>
<!-- 引入JQuery -->
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function(){
		//alert(1);
		$.ajax({
			type:"POST",
			url:""
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
              <td width="437" valign="bottom"><font color="#66583D"><b>系统管理&nbsp;</b></font>&gt; <font color="#FF0000"> 用户添加</font></td>
            </tr>
          </table></td>
        </tr>
      </table>
      <table width="801" height="436" border="0" cellpadding="0" cellspacing="0" background="images/center2.jpg">
        <tr>
          <td height="243" valign="top" align="center">
		 <form action="insertManager" method="post">
		  <table width="265" border="1" align="center" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="66583D">
            <tr>
              <th width="70" height="30"><div align="right" class="word_white">账号：</div></th>
              <td width="183" bgcolor="#FFFFFF"><input type="text" name="account" onblur=""/></td>
            </tr>
            <tr>
              <th height="30"><div align="right" class="word_white">密码：</div></th>
              <td bgcolor="#FFFFFF"><input type="password" name="password"/></td>
            </tr>
             <tr>
              <th height="30"><div align="right" class="word_white">确认密码：</div></th>
              <td bgcolor="#FFFFFF"><input type="password" name="newPassword"></td>
            </tr>
            <tr>
              <th height="30"><div align="right" class="word_white">级别：</div></th>
              <td bgcolor="#FFFFFF"><input type="hidden" name="managerLevel" value="0"/>普通</td>
            </tr>
          </table>
		  <br>           
              <input type="submit" name="Submit2" value="保存">
              &nbsp;&nbsp;
              <input type="reset" name="Submit" value="重置">
          </form> 
          ${requestScope.result}                 
		  </td>
        </tr>
      </table>
    </td>
  </tr>
</table>
</body>
</html>
