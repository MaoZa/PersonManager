<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.page import="java.util.List" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>措滹人力资源管理系统--薪资管理</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
<script type="text/javascript">
	function checkEmptyForm(form) {
		for (i = 0; i < form.length; i++) {
			if (form.elements[i].value == "") {

				if (isNaN(form.pay_baseMoney.value)) {
					window.alert("基本工资只能为数字");
					return false;
				}
				if (isNaN(form.pay_overtime.value)) {
					window.alert("加班次数只能为数字");
					return false;
				}

				if (isNaN(form.pay_age.value)) {
					window.alert("工龄只能为数字");
					return false;
				}

				if (isNaN(form.pay_check.value)) {
					window.alert("全勤奖只能为数字");
					return false;
				}

				if (isNaN(form.pay_absent.value)) {
					window.alert("旷工费只能为数字");
					return false;
				}

				if (isNaN(form.pay_safety.value)) {
					window.alert("保险费只能为数字");
					return false;
				}

				alert(form.elements[i].title);
				return false;
			}
		}
	}
</script>

</head>
<body>
	<table width="100%" height="100%" border="0" cellpadding="0"
		cellspacing="0">
		<tr>
			<td align="center">

				<table width="801" height="48" border="0" cellpadding="0"
					cellspacing="0" background="images/center1.jpg">
					<tr>
						<td valign="top">
							<table width="494">
								<tr>
									<td width="45" height="25">&nbsp;</td>
									<td width="437" valign="bottom"><font color="#66583D"><b>薪资管理&nbsp;</b></font>&gt;
										<font color="#FF0000"> 薪资添加</font></td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="801" height="436" border="0" cellpadding="0"
					cellspacing="0" background="images/center2.jpg">
					<tr>
						<td height="436" valign="top" align="center">
							<form action="${pageContext.request.contextPath}/insertOnePay"
								method="post">
								<table width="355" border="1" cellpadding="1" cellspacing="1"
									bordercolor="#FFFFFF" bgcolor="66583D">
									<tr>
										<th width="87" height="30"><span class="word_white">编号及姓名：</span></th>
										<td width="255" bgcolor="#FFFFFF"><select
											name="payEmnumber">
												<c:forEach items="${emnumberList}" var="emnumber">
													<option value="${emnumber.emSerialnumber}-${emnumber.emName }" > ${emnumber.emSerialnumber }-${emnumber.emName }</option>
												</c:forEach>
										</select></td>
									</tr>
									<tr>
										<th height="30"><span class="word_white">发放时间：</span></th>
										<td bgcolor="#FFFFFF"><input type="text" name="payMonth"
											value="" readonly="readonly"
											onclick="alert('此文本框已设为只读，用户不能修改')" /></td>
									</tr>
									<tr>
										<th height="30"><span class="word_white">基本工资：</span></th>
										<td bgcolor="#FFFFFF"><input type="text"
											name="payBasemoney" title="请输入基本工资" /></td>
									</tr>
									<tr>
										<th height="30"><span class="word_white">加班次数：</span></th>
										<td bgcolor="#FFFFFF"><input type="text"
											name="payOvertime" title="请输入加班次数" /></td>
									</tr>
									<tr>
										<th height="30"><span class="word_white">工龄：</span></th>
										<td bgcolor="#FFFFFF"><input type="text" name="payAge"
											title="请输入工龄" /></td>
									</tr>
									<tr>
										<th height="30"><span class="word_white">全勤奖：</span></th>
										<td bgcolor="#FFFFFF"><input type="text" name="payCheck"
											title="请输入全勤奖" /></td>
									</tr>
									<tr>
										<th height="30"><span class="word_white">旷工费：</span></th>
										<td bgcolor="#FFFFFF"><input type="text"
											name="payAbsent" title="请输入旷工费" /></td>
									</tr>
									<tr>
										<th height="30"><span class="word_white">保险费：</span></th>
										<td bgcolor="#FFFFFF"><input type="text"
											name="paySafety" title="请输入保险费" /></td>
									</tr>
								</table>
								<br> <input type="submit" value="保存" /> &nbsp;&nbsp; <input
									type="reset" value="重置" /> &nbsp;&nbsp; <input type="button"
									value="返回" onclick="javascript:history.go(-1);" />
							</form>
						</td>
					</tr>
				</table></td>
		</tr>
	</table>
</body>
</html>
