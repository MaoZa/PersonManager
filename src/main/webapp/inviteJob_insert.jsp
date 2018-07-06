<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.text.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:directive.page import="java.util.List" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>措滹人力资源管理系统--招聘人员添加</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<% 
	String datetime=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()); //获取系统时间 
%>
<script type="text/javascript">
	function checkEmptyForm(form) {
		for (i = 0; i < form.length; i++) {
			if (form.elements[i].value == "") {
				if (isNaN(form.age.value)) {
					window.alert("年龄只能为数字");
					return false;
				}
				if (isNaN(form.tel.value)) {
					window.alert("电话只能为数字");
					return false;
				}
				alert(form.elements[i].title);
				return false;
			}
		}
	}
</script>

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
									<td width="437" valign="bottom"><font color="#66583D"><b>招聘管理&nbsp;</b></font>&gt;
										<font color="#FF0000">添加应聘人信息</font></td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="801" height="436" border="0" cellpadding="0"
					cellspacing="0" background="images/center2.jpg">
					<tr>
						<td height="436" valign="top" align="center">
							<form action="${pageContext.request.contextPath}/insertInviteJob"
								onsubmit="return checkEmptyForm(inviteJobForm)" method="post">
								<table width="493" border="1" cellpadding="1" cellspacing="1"
									bordercolor="#FFFFFF" bgcolor="66583D">
									<tr>
										<th width="69" height="30" class="word_white">姓名：</th>
										<td width="166" bgcolor="#FFFFFF"><input type="text"
											name="name" title="请输入应聘人姓名" /></td>
										<th width="67" class="word_white">性别：</th>
										<td width="171" bgcolor="#FFFFFF">&nbsp;&nbsp;<input
											type="radio" name="sex" value="男" style="" checked="checked"/>&nbsp;男&nbsp;&nbsp;&nbsp;&nbsp;<input
											type="radio" name="sex" value="女" style="" />&nbsp;女
										</td>
									</tr>
									<tr>
										<th height="30" class="word_white">年龄：</th>
										<td bgcolor="#FFFFFF"><input type="text" name="age"
											title="请输入应聘人年龄" /></td>
										<th class="word_white">出生日期：</th>
										<td bgcolor="#FFFFFF"><input type="text" name="born"
											title="请输入出生日期" /></td>
									</tr>
									<tr>
										<th height="30" class="word_white">应聘职位：</th>
										<td bgcolor="#FFFFFF"><input type="text" name="job"
											title="请输入应聘职务" /></td>
										<th class="word_white">所学专业：</th>
										<td bgcolor="#FFFFFF"><input type="text" name="specialty"
											title="请输入所学专业" /></td>
									</tr>
									<tr>
										<th height="30" class="word_white">工作经验：</th>
										<td bgcolor="#FFFFFF"><input type="text"
											name="experience" title="请输入工作经验" /></td>
										<th class="word_white">文化程度：</th>
										<td bgcolor="#FFFFFF"><select name="teachschool">
												<option value="研究生">研究生</option>
												<option value="本科生">本科生</option>
												<option value="大专生">大专生</option>
										</select></td>
									</tr>
									<tr>
										<th height="30" class="word_white">联系电话：</th>
										<td bgcolor="#FFFFFF"><input type="text" name="tel"
											title="请输入联系电话" /></td>
										<th class="word_white">毕业学校：</th>
										<td bgcolor="#FFFFFF"><input type="text"
											name="afterSchool" title="请输入毕业学校" /></td>
									</tr>
									<tr>
										<th height="30" class="word_white">家庭住址：</th>
										<td bgcolor="#FFFFFF"><input type="text" name="address"
											title="请输入家庭住址" /></td>
										<th class="word_white">登记时间：</th>
										<td bgcolor="#FFFFFF"><input type="text"
											name="createtime" value="<%=datetime %>" readonly="readonly"
											onclick="alert('此文本框已设为只读，用户不能修改')" /></td>
									</tr>
									<tr>
										<th height="111" class="word_white">个人简介:<hidden
												property="isstock" value="0" /></th>
										<td colspan="3" bgcolor="#FFFFFF"><textarea
												name="content" rows="8" style="" cols="50" title="请输入个人简介"></textarea></td>
									</tr>
								</table>
								<br> <input type="submit" value="保存" /> &nbsp; <input
									type="reset" value="重置" /> &nbsp; <input type="button"
									value="返回" onclick="javascript:history.go(-1);" />
							</form>
						</td>
					</tr>
				</table> </td>
		</tr>
	</table>
</body>
</html>
