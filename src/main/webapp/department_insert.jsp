<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.text.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>措滹人力资源管理系统--部门管理</title>
		<link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.min.css" />
		<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
		<script type="text/javascript" src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
		<link rel="stylesheet" type="text/css" href="css/table.css" />
		<script type="text/javascript">
			function checkEmptyForm(form) {
				for (i = 0; i < form.length; i++) {
					if (form.elements[i].value == "") {
		
						alert(form.elements[i].title);
						return false;
					}
				}
			}
		</script>
	</head>
	<body>
		<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0" align="left">
			<tr>
				<td>
					<table border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="66583D" align="center">
						<tr>
							<td valign="top">
								<table width="494">
									<tr>
										<td width="45" height="25">&nbsp;</td>
										<td width="437" valign="bottom">
										<font color="#66583D"><b>部门管理&nbsp;</b></font>&gt;
										<font color="#FF0000"> 部门添加</font>
										</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>
					<table width="801" height="436" border="0" cellpadding="0" cellspacing="0" align="center">
						<tr>
							<!--   -->
							<td valign="top" align="center">
								<form action="insertDepartment" method="post" onsubmit="return checkEmptyForm(departmentForm)">
									<table border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="66583D" align="center">
										<tr>
											<th width="103" height="30"><span>部门名称：</span></th>
											<td>
											<input type="text" class="form-control name="dtName" title="请输入部门名称" />
											</td>
										</tr>
										<tr>
											<th height="30"><span class="word_white">创建时间：</span></th>
											<% String datetime=new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime()); //获取系统时间  %>
											<td><input type="text" class="form-control readonly="readonly" name="dtCreateTime" value="<%=datetime %>" placeholder="<%=datetime %>" /></td>
										</tr>
										<tr>
											<th height="30"><span class="word_white">备注信息：</span></th>
											<td bgcolor="#FFFFFF">
											<input type="text" class="form-control name="dtBz" title="请输入部门备注信息" />
											</td>
										</tr>
									</table>
									<br>
									<table align="center">
										<input class="submit btn btn-default btn-lg" type="submit" value="保存" /> &nbsp;&nbsp; 
										<input class="submit btn btn-default btn-lg" type="reset" value="重置" /> &nbsp;&nbsp; 
										<input class="submit btn btn-default btn-lg" type="button" value="返回" onclick="javascript:history.go(-1);" />
									</table>
								</form>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</body>
</html>
