<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:directive.page import="java.util.List"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>措滹人力资源管理系统--培训管理</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<script type="text/javascript">
function deleteForm(id){
	if(confirm("确定要删除此培训信息吗？")){
		window.location.href="deleteTrain/"+id;
	}
}
</script>
<body>
<table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center">
    
      <jsp:include page="top.jsp" flush="true" />   
	  
	     <table width="801" height="48" border="0" cellpadding="0" cellspacing="0" background="${pageContext.servletContext.contextPath }/images/center1.jpg">
        <tr>
          <td valign="top">
		  <table width="494">
            <tr>
              <td width="45" height="25">&nbsp;</td>
              <td width="437" valign="bottom"><font color="#66583D"><b>培训管理&nbsp;</b></font>&gt; <font color="#FF0000"> 培训查询</font></td>
            </tr>
          </table>
		  </td>
        </tr>
      </table>
      <table width="801" height="436" border="0" cellpadding="0" cellspacing="0" background="${pageContext.servletContext.contextPath }/images/center2.jpg">
        <tr>
          <td height="436" valign="top" align="center">
 
         <table width="650" border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="66583D">
            <tr align="center">
              <th width="44" height="20"><span class="word_white">编号</span></th>
              <th width="44" height="20"><span class="word_white">培训人</span></th>
              <th width="103"><span class="word_white">培训主题</span></th>  
			  <th width="131"><span class="word_white">培训时间</span></th>
              <th width="111"><span class="word_white">培训地点</span></th>
              <th width="184"><span class="word_white">操作</span></th>
            </tr>
            
            <c:forEach items="${trainList }" var="train">
            
            	<tr align="center" bgcolor="#FFFFFF">           
	              <td height="20">${train.id }</td>
	              <td>${train.tnMan }</td>              
	              <td>${train.tnTitle }</td>
	              <td>${train.tnTime }</td>
				  <td>${train.tnAddress }</td>
	              <td><a href="trainqueryOne/${train.id}">查看详细信息</a>&nbsp;&nbsp; <a href="javascript:deleteForm('${train.id }')">删除</a></td>
	            </tr>
            
            </c:forEach>
            
          </table>
           <table width="650">
             <tr>
               <td>  <div align="right"></div></td>
               <c:forEach begin="1" end="${trainPageInfo.pages}" var="i" step="1">
               		<c:if test="${trainPageInfo.pageNum == i }">
               			<td style="display: inline-block;border: 0;width: 36px;height: 36px;line-height: 36px;"><a href="queryTrain?pageNum=${i}"><font color="red">${i}</font></a></td>
               		</c:if> 
             		<c:if test="${trainPageInfo.pageNum != i }">
               			<td style="display: inline-block;border: 0;width: 36px;height: 36px;line-height: 36px;"><a href="queryTrain?pageNum=${i}">${i}</a></td>
               		</c:if> 
               </c:forEach>
             </tr>
           </table>         
         
         
            <table width="650">
              <tr align="right">
                <td><a href="train_insert.jsp">添加培训信息</a></td>
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
