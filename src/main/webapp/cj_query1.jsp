<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>措滹人力资源管理系统--奖惩管理</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<script type="text/javascript">
function deleteForm(id){
if(confirm("确定要删除此奖惩信息吗？")){
window.location.href="${pageContext.request.contextPath}/deleteCj?id="+id;
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
              <td width="437" valign="bottom"><font color="#66583D"><b>奖惩管理&nbsp;</b></font>&gt; <font color="#FF0000"> 奖惩查询</font></td>
            </tr>
          </table>
		  </td>
        </tr>
      </table>
      <table width="801" height="436" border="0" cellpadding="0" cellspacing="0" background="images/center2.jpg">
        <tr>
          <td height="436" valign="top" align="center">
       
<table width="641">
  <tr align="center"> 
    <td width="55" align="left"><a href="cj.do?method=queryCj&type=1">奖励</a></td>
    <td width="561" align="left"><a href="cj.do?method=queryCj&type=0">惩罚</a></td>
  </tr>
</table>

         <table width="650" border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="66583D">
            <tr align="center">
              <th width="41" height="20" class="word_white">编号</th>
              <th width="184" class="word_white">奖惩主题</th>
              <th width="85" class="word_white">奖惩类型</th>
			  <th width="82" class="word_white">奖励金额</th>
			  <th width="63" class="word_white">奖励时间</th>    
              <th width="162" class="word_white">操作</th>
            </tr>
            <!-- 使用jstl动态生成
            	先导入标签
             -->
             <c:if test="${!empty cjList}">
             	<c:forEach items="${cjList}" var="cjlist">
             		<tr align="center" bgcolor="#ffffff">
		              <td height="25">${cjlist.id}</td>
		              <td>${cjlist.cjTitle}</td>
		              <td>${cjlist.cjType==1?"奖励":"惩罚" }</td>
					  <td>${cjlist.cjMoney}</td>
					  <td>${cjlist.cjTime}</td>    
		              <td><a href="queryOneCj/${cjlist.id}">详细查询</a>
              
              &nbsp;&nbsp;<a href="javascript:deleteForm('${cjlist.id}')">删除</a></td>
            		</tr>
             	</c:forEach>
             </c:if>
             
            
          <!--  <logic:iterate id="cjForm" collection=""  indexId="number">
             <bean:define id="id" name="cjForm" property="id"/>     
             <bean:define id="cj_type" name="cjForm" property="cj_type"/>   
             
            <tr align="center" bgcolor="#ffffff">
              <td height="25"><bean:write name="cjForm" property="id"/></td>
              <td><bean:write name="cjForm" property="cj_title"/></td>
              <td></td>
              <td><bean:write name="cjForm" property="cj_money"/></td>
              <td><bean:write name="cjForm" property="cj_time"/></td>             
              <td>
              <a href="cj.do?method=queryOneCj&id=">详细查询</a>
              
              &nbsp;&nbsp;<a href="javascript:deleteForm('')">删除</a>    
              
              </td>
            </tr>
            </logic:iterate> -->
          </table>
           <table width="650">
             <tr>
               <td>  <div align="right"></div></td>
               <c:forEach begin="1" end="${CjPageInfo.pages}" var="i" step="1">
               		<c:if test="${CjPageInfo.pageNum == i }">
               			<td style="display: inline-block;border: 0;width: 36px;height: 36px;line-height: 36px;"><a href="queryCj?pageNum=${i}"><font color="red">${i}</font></a></td>
               		</c:if> 
             		<c:if test="${CjPageInfo.pageNum != i }">
               			<td style="display: inline-block;border: 0;width: 36px;height: 36px;line-height: 36px;"><a href="queryCj?pageNum=${i}">${i}</a></td>
               		</c:if> 
               </c:forEach>
             </tr>
           </table>         
        
         
          
            <table width="650">
              <tr align="right">
                <td><a href="cj_insert.jsp">添加奖惩信息</a></td>
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
