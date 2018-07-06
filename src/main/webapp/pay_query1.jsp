<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:directive.page import="java.util.List"/>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>措滹人力资源管理系统--薪资管理</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<script type="text/javascript">
function deleteForm(date){
if(confirm("确定要删除此员工的工资信息吗？")){
window.location.href="${pageContext.request.contextPath}/deletePay?id="+date;
}
}


function checkform1(){
if(document.form1.pay_month.value==""){
window.alert("请输入要查询的年月，例如：2007-12");
return false;
}
if(form1.pay_month.value.length >11){
window.alert("您输入的格式不对， 例如：2007-12");
return false;
}

return true;
}






</script>

<body>
<table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center">
    
      <jsp:include page="top.jsp" flush="true" />   
	  
	     <table width="801" height="48" border="0" cellpadding="0" cellspacing="0" background="${pageContext.request.contextPath}/images/center1.jpg">
        <tr>
          <td valign="top">
		  <table width="494">
            <tr>
              <td width="45" height="25">&nbsp;</td>
              <td width="437" valign="bottom"><font color="#66583D"><b>薪资管理&nbsp;</b></font>&gt; <font color="#FF0000"> 薪资查询</font></td>
            </tr>
          </table>
		  </td>
        </tr>
      </table>
      <table width="801" height="436" border="0" cellpadding="0" cellspacing="0" background="${pageContext.request.contextPath}/images/center2.jpg">
        <tr>
          <td height="436" valign="top" align="center">

		  
		  
         <table width="481">
           <tr>
             <td width="224">
			  <form name="form1" method="post" action="${pageContext.request.contextPath}/queryPayByTime" onsubmit="return checkform1()">
			 <table width="233">
               <tr>
                 <td><input name="sumbit1" type="submit" value="年月查询"></td>
                 <td><input type="date" name="pay_month" value=""></td>
               </tr>
             </table>
			  </form>
			 
			 </td>
             <td width="283">
			  <form name="form2" method="post" action="queryPay">  
			 <table width="233">
               <tr>
                 <td><input name="sumbit2" type="submit" value="员工查询"></td>
                 <td>
				 <select name="emNumber">
	
				 <option value=""  >&nbsp;&nbsp;</option>

                 </select>
				 
				 
				 </td>
               </tr>
             </table>
			 </form>
			 
			 </td>
           </tr>
         </table>
 
         <table border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="66583D">
            <tr align="center">
              <th width="57" height="20"><span class="word_white">员工编号</span></th>
              <th width="57"><span class="word_white">员工姓名</span></th>
              <th width="57"><span class="word_white">当前月份</span></th>
              <th width="57"><span class="word_white">基本工资</span></th>
			  <th width="55"><span class="word_white">加班费</span></th>
              <th width="55"><span class="word_white">工龄费</span></th>
              <th width="55"><span class="word_white">考勤费</span></th>
			  <th width="55"><span class="word_white">旷工费</span></th>
			  <th width="55"><span class="word_white">保险费</span></th>
			  <th width="57"><span class="word_white">实发工资</span></th>
			  <th width="100"><span class="word_white">操作</span></th>
            </tr>
           	<c:forEach items="${payList }" var="pay">
           	
           		<tr align="center" bgcolor="#ffffff">
	              <td height="25">${pay.payEmnumber }</td>
	              <td>${pay.payEmname }</td>
	              <td>${pay.payMonth }</td>
	              <td>${pay.payBasemoney }</td>
	              <td>
	              	<c:if test="${pay.payOvertime == 1 }">100.0</c:if>
	             	<c:if test="${pay.payOvertime == 0 }">0</c:if>
	              </td>
	              <td>
		              <c:if test="${pay.payAge == 1 }">100.0</c:if>
		              <c:if test="${pay.payAge == 0 }">0</c:if>
	              </td>
	              <td>${pay.payCheck }</td>
	              <td>${pay.payAbsent }</td>
	              <td>${pay.paySafety }</td>
	              <td>
	              	<c:if test="${pay.payOvertime == 1 }">
	              		${pay.payBasemoney + 100.0 + 100.0 - 128.0 }
	              	</c:if>
	              	
	              </td>
	              <td><a href="javascript:deleteForm('${pay.id }')">删除</a></td>
	            </tr>
           	
           	</c:forEach>
          </table>
           <table width="650">
             <tr>
               <td>  <div align="right"></div></td>
               <c:forEach begin="1" end="${payPageInfo.pages}" var="i" step="1">
               		<c:if test="${payPageInfo.pageNum == i }">
               			<td style="display: inline-block;border: 0;width: 36px;height: 36px;line-height: 36px;"><a href="queryPay?pageNum=${i}"><font color="red">${i}</font></a></td>
               		</c:if> 
             		<c:if test="${payPageInfo.pageNum != i }">
               			<td style="display: inline-block;border: 0;width: 36px;height: 36px;line-height: 36px;"><a href="queryPay?pageNum=${i}">${i}</a></td>
               		</c:if> 
               </c:forEach>
             </tr>
           </table>         
         
      
            <table width="650">
              <tr align="right">
                <td><a href="${pageContext.request.contextPath}/pay_insert">添加薪资</a></td>
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
