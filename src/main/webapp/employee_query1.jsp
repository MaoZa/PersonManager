<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>措滹人力资源管理系统--招聘管理</title>
		<link type="text/css" rel="stylesheet" href="css/style.css">
	</head>
	
	<script type="text/javascript">
		function deleteForm(date){
			if(confirm("确定要删除此员工信息吗？")){
				window.location.href="${pageContext.request.contextPath}/delOneEmployee/"+date;
			}
		}
	</script>
<body>
<table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center">
    <%@ include file="top.jsp" %>
	  <table width="801" height="48" border="0" cellpadding="0" cellspacing="0" background="images/center1.jpg">
        <tr>
          <td valign="top">
		  <table width="494">
            <tr>
              <td width="45" height="25">&nbsp;</td>
              <td width="437" valign="bottom"><font color="#66583D"><b>员工管理&nbsp;</b></font>&gt; <font color="#FF0000"> 员工查询</font></td>
            </tr>
          </table>
		  </td>
        </tr>
      </table>
      <table width="801" height="436" border="0" cellpadding="0" cellspacing="0" background="images/center2.jpg">
        <tr>
          <td height="436" valign="top" align="center">
          
<table  height="19">
  <tr align="center"> 
    <td> 
    <b>部门查询</b>&nbsp;&nbsp;
	
	  
	    <a href="queryDepList"></a>&nbsp;&nbsp;

	<a href="queryEmpList"><b>员工全部查询</b></a>
	</td> 
	  
  </tr>
</table>
<br>          
        

         <table width="739" border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="66583D">
           <tr align="center">
             <th width="66" height="19" class="word_white">员工编号</th>
             <th width="66" class="word_white">姓名</th>
             <th width="57" class="word_white">性别</th>
             <th width="93" class="word_white">部门</th>
             <th width="60" class="word_white">工种</th>
             <th width="106" class="word_white">学历</th>
             <th width="123" class="word_white">参加工作时间</th>
             <th width="125" class="word_white">操作</th>
           </tr>
           		<c:forEach items="${employees }" var="emp">
		           	<tr align="center" bgcolor="#ffffff">
			            <td height="25"><a href="queryOneEmployee/${emp.id }">${emp.emSerialnumber }</a></td>
			            <td><a href="queryOneEmployee/${emp.id }.html">${emp.emName }</a></td>
			            <td>${emp.emSex }</td>
			            <c:if test="${emp.emDepartmentid==null}">
			            	<td></td>
			            </c:if>
			            <c:forEach items="${departments}" var="dep">
			            	<c:if test="${emp.emDepartmentid==dep.id }">
			            		<td>${dep.dtName}</td>
			            	</c:if>
			            </c:forEach>
			            <td>${emp.emTypework }</td>
			            <td>${emp.emCulture }</td>
			            <td>${emp.emStartime }</td>
						<td><a href="updateOneEmployeeUI/${emp.id }">更新</a> <a href="delOneEmployee/${emp.id }" onclick="deleteForm(${emp.id })">删除</a></td>
					</tr>
	           </c:forEach>
         </table>
         <table width="650">
         	<tr>
               <td><div align="right"></div></td>
               <c:forEach begin="1" end="${empPageInfo.pages}" var="i" step="1">
               		<c:if test="${empPageInfo.pageNum == i }">
               			<td style="display: inline-block;border: 0;width: 36px;height: 36px;line-height: 36px;"><a href="queryEmpList?pageNum=${i}"><font color="red">${i}</font></a></td>
               		</c:if> 
             		<c:if test="${empPageInfo.pageNum != i }">
               			<td style="display: inline-block;border: 0;width: 36px;height: 36px;line-height: 36px;"><a href="queryEmpList?pageNum=${i}">${i}</a></td>
               		</c:if> 
               </c:forEach>
            </tr>
            </table>
         	<table width="650">
              <tr align="right">
                <td><a href="employee_insert">添加员工信息</a></td>
              </tr>
          	</table>
         </table>    
         <jsp:include page="down.jsp" flush="true" />
		</td>
       </tr>
      </table> 
	  	


</body>
</html>
