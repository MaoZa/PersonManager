<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>措滹人力资源管理系统--奖惩管理</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

</head>
<body>
<table width="100%" height="100%"  border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center">
    
      <jsp:include page="top.jsp" flush="true" />   
	  
	     <table width="801" height="48" border="0" cellpadding="0" cellspacing="0" background="${pageContext.request.contextPath}/images/center1.jpg">
        <tr>
          <td valign="top">		  <table width="494">
            <tr>
              <td width="45" height="25">&nbsp;</td>
              <td width="437" valign="bottom"><font color="#66583D"><b>奖惩管理&nbsp;</b></font>&gt; <font color="#FF0000"> 奖惩详细查询</font></td>
            </tr>
          </table></td>
        </tr>
      </table>
      <table width="801" height="436" border="0" cellpadding="0" cellspacing="0" background="${pageContext.request.contextPath}/images/center2.jpg">
        <tr>
          <td height="436" valign="top" align="center">                  
            <table width="355" border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="66583D">
              <tr>
                <th width="79" height="30"><span class="word_white">奖惩题目：</span></th>
                <td width="263" bgcolor="#FFFFFF">${cj.cjTitle}</td>
              </tr>
              <tr>
                <th height="30"><span class="word_white">奖惩类型：</span></th>
                <td bgcolor="#FFFFFF">${cj.cjType==1?"奖励":"惩罚"}</td>
              </tr>
              <tr>
                <th height="30"><span class="word_white">奖惩金额：</span></th>
                <td bgcolor="#FFFFFF">${cj.cjMoney}</td>
              </tr>
              <tr>
                <th height="30"><span class="word_white">奖惩时间：</span></th>
                <td bgcolor="#FFFFFF">${cj.cjTime}</td>
              </tr>
              <tr>
                <th height="30"><span class="word_white">奖惩原因：</span></th>
                <td bgcolor="#FFFFFF">${cj.cjContent}</td>
              </tr>
            </table><br>   
     
			   <input type="button" value="返回"  onclick="javascript:history.go(-1);"/>
			   
			</td>
        </tr>
      </table>
	  <jsp:include page="down.jsp" flush="true" />
    </td>
  </tr>
</table>
</body>
</html>
