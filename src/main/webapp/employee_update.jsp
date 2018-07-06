<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:directive.page import="java.util.List" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>措滹人力资源管理系统--员工管理</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
<script type="text/javascript">
	function checkEmptyForm(form) {
		for (i = 0; i < form.length; i++) {
			if (form.elements[i].value == "") {
				if (isNaN(form.em_age.value)) {
					window.alert("年龄只能为数字");
					return false;
				}
				if (isNaN(form.em_tel.value)) {
					window.alert("电话只能为数字");
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
			<td align="center"><jsp:include page="top.jsp" flush="true" />

				<table width="801" height="48" border="0" cellpadding="0"
					cellspacing="0" background="images/center1.jpg">
					<tr>
						<td valign="top">
							<table width="494">
								<tr>
									<td width="45" height="25">&nbsp;</td>
									<td width="437" valign="bottom"><font color="#66583D"><b>员工管理&nbsp;</b></font>&gt;
										<font color="#FF0000"> 员工信息更改</font></td>
								</tr>
							</table>
						</td>
					</tr>
				</table>

				<table width="801" height="436" border="0" cellpadding="0"
					cellspacing="0" background="images/center2.jpg">
					<tr>
						<td height="436" valign="top" align="center">

							<form action="${pageContext.request.contextPath}/updateOneEmployee/${employee.id }"
								onsubmit="return checkEmptyForm(employeeForm)" method="post">
								<table border="1" cellpadding="1" cellspacing="1"
									bordercolor="#FFFFFF" bgcolor="66583D">
									<tr>
										<th width="75" height="25">编号：</th>
										<td width="200" bgcolor="#FFFFFF"><input type="text"
											name="emSerialnumber" value="${employee.emSerialnumber }"
											readonly="readonly" onclick="alert('此文本框已设为只读，用户不能修改')" /></td>
										<th width="75">姓名：</th>
										<td width="200" bgcolor="#FFFFFF"><input type="text"
											name="emName" value="${employee.emName }" /></td>
									</tr>
									<tr>
										<th height="25">年龄：</th>
										<td bgcolor="#FFFFFF"><input type="text" name="emAge"
											value="${employee.emAge }" /></td>
										<th>性别：</th>
										<td bgcolor="#FFFFFF"><input type="radio" name="emSex"
												value="男" style="input1" checked="checked"/>&nbsp;男&nbsp; &nbsp; &nbsp;
											<input type="radio" name="emSex" value="女" style="input1" />&nbsp;女</td>
									</tr>
									<tr>
										<th height="25">出生日期：</th>
										<td bgcolor="#FFFFFF"><input type="text" name="emBorn"
											value="${employee.emBorn }" /></td>
										<th>身份证号：</th>
										<td bgcolor="#FFFFFF"><input type="text" name="emIdcard"
											value="${employee.emIdcard }" /></td>
									</tr>
									<tr>
										<th height="25">民族：</th>
										<td bgcolor="#FFFFFF"><input type="text" name="emNation"
											value="${employee.emNation }" /></td>
										<th>婚姻状况：</th>
										<td bgcolor="#FFFFFF"><input type="radio" name="emMarriage"
												value="未婚" style="input1" checked="checked"/>&nbsp;未婚&nbsp; &nbsp;
											&nbsp; <input type="radio" name="emMarriage" value="已婚"
												style="input1" />&nbsp;已婚</td>
									</tr>
									<tr>
										<th height="25">政治面貌：</th>
										<td bgcolor="#FFFFFF"><input type="radio" name="emVisage"
												value="党员" style="input1" checked="checked"/>&nbsp;党员&nbsp; &nbsp; <input type="radio"
												name="emVisage" value="团员" style="input1" />&nbsp;团员&nbsp;
											&nbsp; <input type="radio" name="emVisage" value="无"
												style="input1" />&nbsp;无</td>
										<th>籍贯：</th>
										<td bgcolor="#FFFFFF"><input type="text"
											name="emAncestralhome" value="${employee.emAncestralhome }" /></td>
									</tr>
									<tr>
										<th height="25">联系电话：</th>
										<td bgcolor="#FFFFFF"><input type="text" name="emTel"
											value="${employee.emTel }" /></td>
										<th>家庭住址：</th>
										<td bgcolor="#FFFFFF"><input type="text" name="emAddress"
											value="${employee.emAddress }" /></td>
									</tr>
									<tr>
										<th height="25">毕业学校：</th>
										<td bgcolor="#FFFFFF"><input type="text"
											name="emAfterschool" value="${employee.emAfterschool }" /></td>
										<th>专业：</th>
										<td bgcolor="#FFFFFF"><input type="text"
											name="emSpeciality" value="${employee.emSpeciality }" /></td>
									</tr>
									<tr>
										<th height="25">文化程度：</th>
										<td bgcolor="#FFFFFF"><select name="emCulture">
												<option value="研究生">研究生</option>
												<option value="本科生">本科生</option>
												<option value="大专生">大专生</option>
										</select></td>
										<th>上岗时间：</th>
										<td bgcolor="#FFFFFF"><input type="text"
											name="emStartime" value="${employee.emStartime }" /></td>
									</tr>
									<tr>
										<th height="25">部门名称：</th>
										<td bgcolor="#FFFFFF"><select name="emDepartmentid">
											<c:forEach items="${categoryList}" var="category">
												<option value="${category.id}">${category.dtName}</option>
											</c:forEach>

										</select></td>
										<th>部门工种：</th>
										<td bgcolor="#FFFFFF"><select name="emTypework">
												<option value="程序员">程序员</option>
												<option value="文档人员">文档人员</option>
												<option value="部门经理">部门经理</option>
										</select></td>
									</tr>
									<tr>
										<th height="25">登记人名：</th>
										<td bgcolor="#FFFFFF"><input type="text"
											name="emCreatename" value="${employee.emCreatename }"
											onclick="alert('此文本框已设为只读，用户不能修改')" /></td>
										<th>登记时间：</th>
										<td bgcolor="#FFFFFF"><input type="text"
											name="emCreatime" value="${employee.emCreatime }"
											readonly="readonly" onclick="alert('此文本框已设为只读，用户不能修改')" /></td>
									</tr>
									<tr>
										<th height="107">备注信息：</th>
										<td colspan="3" bgcolor="#FFFFFF"><textarea name="emBz"
												title="请输入备注信息" style="" rows="7" cols="75"></textarea></td>
									</tr>
								</table>
								<br> <input type="submit" value="提交" /> &nbsp; <input
									type="reset" value="重置" /> &nbsp; <input type="button"
									name="back" value="返回" onclick="javascript:history.go(-1);">
								<input type="hidden" name="id" />
							</form>

						</td>
					</tr>
				</table> <jsp:include page="down.jsp" flush="true" /></td>
		</tr>
	</table>
</body>
</html>
