<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>措滹人力资源管理系统--培训管理</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
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
									<td width="437" valign="bottom"><font color="#66583D"><b>培训管理&nbsp;</b></font>&gt;
										<font color="#FF0000"> 添加培训信息</font></td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
				<table width="801" height="436" border="0" cellpadding="0"
					cellspacing="0" background="images/center2.jpg">
					<tr>
						<td height="436" valign="top" align="center">
							<!--  -->
							<form action="${pageContext.request.contextPath}/insertOneTrain" method="post" onsubmit="return checkEmptyForm(trainForm)">
								<table width="355" border="1" cellpadding="1" cellspacing="1"
									bordercolor="#FFFFFF" bgcolor="66583D">

									<tr>
										<th width="79" height="30"><span class="word_white">培训人：</span></th>
										<td width="263" bgcolor="#FFFFFF"><input type="text"
											name="tnMan" title="请输入培训人名称" size="40" /></td>
									</tr>
									<tr>
										<th height="30"><span class="word_white">培训主题：</span></th>
										<td bgcolor="#FFFFFF"><input type="text" name="tnTitle"
											title="请输入培训主题" size="40" /></td>
									</tr>
									<tr>
										<th height="30"><span class="word_white">培训宗旨：</span></th>
										<td bgcolor="#FFFFFF"><input type="text"
											name="tnContent" title="请输入培训宗旨" size="40" /></td>
									</tr>
									<tr>
										<th height="30"><span class="word_white">培训时间：</span></th>
										<td bgcolor="#FFFFFF"><input type="text" name="tnTime"
											title="请输入培训时间" size="40" /></td>
									</tr>
									<tr>
										<th height="30"><span class="word_white">培训地点：</span></th>
										<td bgcolor="#FFFFFF"><input type="text"
											name="tnAddress" title="请输入培训地点" size="40" /></td>
									</tr>
									<tr>
										<th height="30"><span class="word_white">参加人员：</span></th>
										<td bgcolor="#FFFFFF"><input type="text" name="tnJoin"
											title="请输入参见人员" size="40" /></td>
									</tr>
									<tr>
										<th height="30"><span class="word_white">备注信息：</span></th>
										<td bgcolor="#FFFFFF"><textarea name="tnBz"
												title="请输入备注信息" rows="10" cols="35" style=""></textarea></td>
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
