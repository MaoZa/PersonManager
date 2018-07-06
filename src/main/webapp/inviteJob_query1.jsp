<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:directive.page import="java.util.List"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>措滹人力资源管理系统--招聘管理</title>
<link type="text/css" rel="stylesheet" href="${pageContext.servletContext.contextPath }/css/style.css">
</head>
<script type="text/javascript">
function deleteForm(date){
	if(confirm("确定要删除此应聘人员信息吗？")){
		window.location.href="deleteInviteJob&id="+date;
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
              <td width="437" valign="bottom"><font color="#66583D"><b>招聘管理&nbsp;</b></font>&gt; <font color="#FF0000"> 招聘查询</font></td>
            </tr>
          </table>
		  </td>
        </tr>
      </table>
      <table width="801" height="436" border="0" cellpadding="0" cellspacing="0" background="${pageContext.servletContext.contextPath }/images/center2.jpg">
        <tr>
          <td height="436" valign="top" align="center">
       
<table width="641">
  <tr align="center"> 
    <td width="55" align="left"><a href="${pageContext.servletContext.contextPath }/queryInviteJob?isstock=1">录用查询</a></td>
    <td width="561" align="left"><a href="${pageContext.servletContext.contextPath }/queryInviteJob?isstock=0">非录用查询</a></td>
  </tr>
</table>

         <table width="650" border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="66583D">
            <tr align="center">
              <th width="35" height="20" class="word_white">编号</th>
              <th width="77" class="word_white">姓名</th>
              <th width="51" class="word_white">性别</th>
			  <th width="95" class="word_white">应聘职务</th>
			  <th width="95" class="word_white">学历</th>
              <th width="81" class="word_white">工作经验</th>
              <th width="178" class="word_white">操作</th>
            </tr>
            
            
	        <c:forEach items="${inviteJobList }" var="inv">
	            <tr align="center" bgcolor="#ffffff">
	              <td height="25">${inv.id }</td>
	              <td>${inv.name }</td>
	              <td>${inv.sex }</td>
	              <td>${inv.job }</td>
	              <td>${inv.teachschool }</td>
	              <td>${inv.experience }</td>
	              <td>	<a href="${pageContext.servletContext.contextPath }/queryOneInviteJob/${inv.id }">详细查询</a>
	             		<c:if test="${inv.isstock == 0 }">
	             			<a href="${pageContext.servletContext.contextPath }/InviteJob/${inv.id }">录用</a>
	             		</c:if>
	              </td>
	            </tr>
            </c:forEach>
           
          </table>
           <table width="650">
             <tr>
               <td>  <div align="right"></div></td>
               <c:forEach begin="1" end="${inviteJobPageInfo.pages}" var="i" step="1">
               		<c:if test="${inviteJobPageInfo.pageNum == i }">
               			<td style="display: inline-block;border: 0;width: 36px;height: 36px;line-height: 36px;"><a href="queryInviteJob?pageNum=${i}"><font color="red">${i}</font></a></td>
               		</c:if> 
             		<c:if test="${inviteJobPageInfo.pageNum != i }">
               			<td style="display: inline-block;border: 0;width: 36px;height: 36px;line-height: 36px;"><a href="queryInviteJob?pageNum=${i}">${i}</a></td>
               		</c:if> 
               </c:forEach>
             </tr>
           </table>         
         
            <table width="650">
              <tr align="right">
                <td><a href="inviteJob_insert.jsp">添加应聘人信息</a></td>
              </tr>
          </table>
		  </td>
        </tr>
      </table>
	  <jsp:include page="down.jsp" flush="true" />
    </td>
  </tr>
</table>
</body>
</html>
