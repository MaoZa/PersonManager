<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:directive.page import="java.util.List"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>措滹人力资源管理系统--员工管理</title>
<link type="text/css" rel="stylesheet" href="${pageContext.servletContext.contextPath }/css/style.css">
</head>

          


<body>
<table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center">
    <%@ include file="top.jsp" %>
	     <table width="801" height="48" border="0" cellpadding="0" cellspacing="0" background="${pageContext.servletContext.contextPath }/images/center1.jpg">
        <tr>
          <td valign="top">		  <table width="494">
            <tr>
              <td width="45" height="25">&nbsp;</td>
              <td width="437" valign="bottom"><font color="#66583D"><b>员工管理&nbsp;</b></font>&gt; <font color="#FF0000"> 员工详细查询</font></td>
            </tr>
          </table></td>
        </tr>
      </table>

      <table width="801" height="436" border="0" cellpadding="0" cellspacing="0" background="${pageContext.servletContext.contextPath }/images/center2.jpg">
        <tr>
          <td height="436" valign="top" align="center">		      

		  <table border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="66583D">
            <tr>
              <th width="75" height="25">编号：</th>
              <td width="200" bgcolor="#FFFFFF">${employee.emSerialnumber}</td>
              <th width="75">姓名：</th>
              <td width="200" bgcolor="#FFFFFF">${employee.emName}</td>
            </tr>
            <tr>
              <th height="25">年龄：</th>
              <td bgcolor="#FFFFFF">${employee.emAge}</td>
              <th>性别：</th>
              <td bgcolor="#FFFFFF">${employee.emSex}</td>
            </tr>
            <tr>
              <th height="25">出生日期：</th>
              <td bgcolor="#FFFFFF">${employee.emBorn}</td>
              <th>身份证号：</th>
              <td bgcolor="#FFFFFF">${employee.emIdcard}</td>
            </tr>
            <tr>
              <th height="25">民族：</th>
              <td bgcolor="#FFFFFF">${employee.emNation}</td>
              <th>婚姻状况：</th>
              <td bgcolor="#FFFFFF">${employee.emMarriage}</td>
            </tr>
            <tr>
              <th height="25">政治面貌：</th>
              <td bgcolor="#FFFFFF">${employee.emVisage}</td>
              <th>籍贯：</th>
              <td bgcolor="#FFFFFF">${employee.emAncestralhome}</td>
            </tr>
            <tr>
              <th height="25">联系电话：</th>
              <td bgcolor="#FFFFFF">${employee.emTel}</td>
              <th>家庭住址：</th>
              <td bgcolor="#FFFFFF">${employee.emAddress}</td>
            </tr>
            <tr>
              <th height="25">毕业学校：</th>
              <td bgcolor="#FFFFFF">${employee.emAfterschool}</td>
              <th>专业：</th>
              <td bgcolor="#FFFFFF">${employee.emSpeciality}</td>
            </tr>
            <tr>
              <th height="25">文化程度：</th>
              <td bgcolor="#FFFFFF">${employee.emCulture}</td>
              <th>上岗时间：</th>
              <td bgcolor="#FFFFFF">${employee.emStartime}</td>
            </tr>
            <tr>
              <th height="25">部门名称：</th>
              <td bgcolor="#FFFFFF"></td>             
              <th>部门工种：</th>
              <td bgcolor="#FFFFFF">${employee.emTypework}</td>
            </tr>
            <tr>
              <th height="25">登记人名：</th>
              <td bgcolor="#FFFFFF">${employee.emCreatime}</td>
              <th>登记时间：</th>                                                              
              <td bgcolor="#FFFFFF">${employee.emCreatime}</td>
            </tr>
			<tr>
              <th height="107">备注信息：</th>
              <td colspan="3" bgcolor="#FFFFFF">${employee.emBz}</td>
              </tr>
          </table>
           <br>
    
         <input type="button" value="返回" onclick="javascript:history.go(-1);"/>

     
     
          </td>
        </tr>
      </table>
      <%@ include file="down.jsp" %>
    </td>
  </tr>
</table>
</body>
</html>
