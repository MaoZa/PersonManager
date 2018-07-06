<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:directive.page import="java.util.List"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>措滹人力资源管理系统--招聘人员详细查询</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<body>
<table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center">
    
      <jsp:include page="top.jsp" flush="true" />   
	  
	     <table width="801" height="48" border="0" cellpadding="0" cellspacing="0" background="images/center1.jpg">
        <tr>
          <td valign="top">
		  <table width="494">
            <tr>
              <td width="45" height="25">&nbsp;</td>
              <td width="437" valign="bottom"><font color="#66583D"><b>招聘管理</b></font>&gt; <font color="#FF0000">招聘人员详细查询</font></td>
            </tr>
          </table>
		  </td>
        </tr>
      </table>
      <table width="801" height="436" border="0" cellpadding="0" cellspacing="0" background="images/center2.jpg">
        <tr>
          <td height="436" valign="top" align="center">
          <table width="493" border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="66583D">
            <tr>
              <th width="69" height="30" class="word_white">姓名：</th>
              <td width="166" bgcolor="#FFFFFF">${Invite.name}</td>
              <th width="67" class="word_white">性别：</th>
              <td width="171" bgcolor="#FFFFFF">${Invite.sex}</td>
            </tr>
            <tr>
              <th height="30" class="word_white">年龄：</th>
              <td bgcolor="#FFFFFF">${Invite.age}</td>
              <th class="word_white">出生日期：</th>
              <td bgcolor="#FFFFFF">${Invite.born}</td>
            </tr>
            <tr>
              <th height="30" class="word_white">应聘职位：</th>
              <td bgcolor="#FFFFFF">${Invite.job}</td>
              <th class="word_white">所学专业：</th>
              <td bgcolor="#FFFFFF">${Invite.specialty}</td>
            </tr>
            <tr>
              <th height="30" class="word_white">工作经验：</th>
              <td bgcolor="#FFFFFF">${Invite.experience}</td>
              <th class="word_white">文化程度：</th>
              <td bgcolor="#FFFFFF">${Invite.teachschool}</td>
            </tr>
            <tr>
              <th height="30" class="word_white">联系电话：</th>
              <td bgcolor="#FFFFFF">${Invite.tel}</td>
              <th class="word_white">毕业学校：</th>
              <td bgcolor="#FFFFFF">${Invite.afterschool}</td>
            </tr>
            <tr>
              <th height="30" class="word_white">家庭住址：</th>
              <td bgcolor="#FFFFFF">${Invite.address}</td>
              <th class="word_white">登记时间：</th>
              <td bgcolor="#FFFFFF">${Invite.createtime}</td>
            </tr>
		    <tr>
              <th height="30" class="word_white">是否录用:</th>
              <td colspan="3" bgcolor="#FFFFFF">${Invite.isstock}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="#FF0000"><b>/*1代表已经录用，0代表未被录用*/</b></font></td>
            </tr>
            <tr>
              <th height="111" class="word_white">个人简介:</th>
              <td colspan="3" bgcolor="#FFFFFF">${Invite.content}</td>
            </tr>
          </table>
		  <br>
       <input type="button" value="返回" onclick="javascript:history.go(-1);"/>

      
      
		  </td>
        </tr>
      </table>
	  <jsp:include page="down.jsp" flush="true" />
    </td>
  </tr>
</table>
</body>
</html>
