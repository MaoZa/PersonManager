<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@page import="java.util.Map"%>
<%@page import="com.hxzy.pojo.TbDepartment"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>措滹人力资源管理系统--部门管理</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<script type="text/javascript">
function deleteForm(id){
if(confirm("确定要删除此部门信息吗？")){
window.location.href="deleteDepartment?id="+id;
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
          <td valign="top">
		  <table width="494">
            <tr>
              <td width="45" height="25">&nbsp;</td>
              <td width="437" valign="bottom"><font color="#66583D"><b>部门管理&nbsp;</b></font>&gt; <font color="#FF0000"> 部门查询</font></td>
            </tr>
          </table>
		  </td>
        </tr>
      </table>
      <table width="801" height="436" border="0" cellpadding="0" cellspacing="0" background="images/center2.jpg">
        <tr>
          <td height="436" valign="top" align="center">
         <table width="650" border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="66583D">
            <tr align="center">
              <th width="46" height="20"><span class="word_white">序号</span></th>
              <th width="109"><span class="word_white">部门名称</span></th>
              <th width="138"><span class="word_white">创建时间</span></th>
			  <th width="138"><span class="word_white">部门人数</span></th>
              <th width="203"><span class="word_white">备注</span></th>
              <th width="88"><span class="word_white">操作</span></th>
            </tr>
        <!-- <logic:iterate id="departmentForm" collection=""  indexId="number">
           <bean:define id="id" name="departmentForm" property="id"/>                      
            <tr align="center" bgcolor="#FFFFFF">           
              <td height="20"><bean:write name="departmentForm" property="id"/></td>
              <td><bean:write name="departmentForm" property="dt_name"/></td>              
              <td><bean:write name="departmentForm" property="dt_createTime"/></td>
              <td></td>
			  <td><bean:write name="departmentForm" property="dt_bz"/></td>
              <td><a href="javascript:deleteForm('')">删除</a></td>
            </tr>
         </logic:iterate> -->
         <%-- <c:if test="${!empty departments}">
           	<c:forEach items="${departments}" var="dep" >
           		<tr align="center" bgcolor="#ffffff">
	              <td height="25">${dep.id}</td>
	              <td>${dep.dtName}</td>
	              <td>${dep.dtCreatetime}</td>
	              <td>${countPack}</td>
				  <td>${dep.dtBz}</td>  
	              <td><a href="javascript:deleteForm('${dep.id}')">删除</a></td>
          		</tr>
           	</c:forEach>
         </c:if> --%>
         <%
	           	Map<Long,Long> countPack = (Map<Long,Long>)request.getSession().getAttribute("countPack");
	           	List<TbDepartment> departments = (List<TbDepartment>)request.getSession().getAttribute("departments");
	           	for(TbDepartment department : departments){
	           		out.println("<tr align=\"center\" bgcolor=\"#FFFFFF\">");
	           		out.println("<td height=\"20\">"+ department.getId() +"</td>");
	           		out.println("<td>"+ department.getDtName() +"</td>");
	           		out.println("<td>"+ department.getDtCreatetime() +"</td>");
	           		out.println("<td>"+ countPack.get(Long.parseLong(department.getId()+"")) +"</td>");
	           		out.println("<td>"+ department.getDtBz() +"</td>");
	           		out.println("<td><a href=\"javascript:deleteForm(\'\')\">删除</a></td>");
	           		out.println("</tr>");
	           	}
	      %>
          </table>
           <table width="650">
             <tr>
               <td>  <div align="right"></div></td>
               <c:forEach begin="1" end="${pageInfo.pages}" var="i" step="1">
               		<c:if test="${pageInfo.pageNum == i }">
               			<td style="display: inline-block;border: 0;width: 36px;height: 36px;line-height: 36px;"><a href="queryDepList?pageNum=${i}"><font color="red">${i}</font></a></td>
               		</c:if> 
             		<c:if test="${pageInfo.pageNum != i }">
               			<td style="display: inline-block;border: 0;width: 36px;height: 36px;line-height: 36px;"><a href="queryDepList?pageNum=${i}">${i}</a></td>
               		</c:if> 
               </c:forEach>
             </tr>
           </table>         
        
         
         
            <table width="650">
              <tr align="right">
                <td><a href="department_insert.jsp">添加部门</a></td>
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
