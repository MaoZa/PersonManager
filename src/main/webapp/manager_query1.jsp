<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.page import="java.util.List"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>措滹人力资源管理系统--系统管理</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<script type="text/javascript">
	function deleteForm(date){
		if(confirm("确定要删除此管理员吗？")){
			window.location.href="deleteManager?id="+date;
		}
	}
</script>
<body>
<table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center">
    
      <jsp:include page="top.jsp" flush="true" />   
	  
	     <table width="801" height="48" border="0" cellpadding="0" cellspacing="0" background="images/center1.jpg">
        <tr>
          <td valign="top"><table width="494">
            <tr>
              <td width="45" height="25">&nbsp;</td>
              <td width="437" valign="bottom"><font color="#66583D"><b>系统管理&nbsp;</b></font>&gt; <font color="#FF0000"> 用户查询</font></td>
            </tr>
          </table></td>
        </tr>
      </table>
      <table width="801" height="436" border="0" cellpadding="0" cellspacing="0" background="images/center2.jpg">
        <tr>
          <td height="436" valign="top" align="center">
          <table width="400" border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="66583D">
            <tr align="center">
              <th height="20"><span class="word_white">序号</span></th>
              <th><span class="word_white">账号</span></th>
              <th><span class="word_white">操作</span></th>
            </tr>
        <!-- <logic:iterate id="managerForm" collection=""  indexId="number">
           <bean:define id="userid" name="managerForm" property="id"/>
            <tr align="center" bgcolor="#FFFFFF">           
              <td height="20"><bean:write name="managerForm" property="id"/></td>
              <td><bean:write name="managerForm" property="account"/></td>
              
              <td><a href="javascript:deleteForm('')">删除</a></td>
            </tr>
         </logic:iterate> -->
         <c:forEach items="${managerList }" var="manager">
         	<tr align="center" bgcolor="#FFFFFF">           
              <td height="20">${manager.id}</td>
              <td>${manager.account}</td>
              <td><a href="javascript:deleteForm('${manager.id}')">删除</a></td>
            </tr>
         </c:forEach>
         
          </table>
            <table width="381">
              <tr align="right">
                <td><a href="manager_insert.jsp">添加管理员</a></td>
              </tr>
          </table></td>
        </tr>
      </table>
	  <jsp:include page="down.jsp" flush="true" />
    </td>
  </tr>
</table>
</body>
</html>
