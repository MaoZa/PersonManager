<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>措滹人力资源管理系统--奖惩管理</title>
		<link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.min.css" />
		<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
		<script type="text/javascript" src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
		<link rel="stylesheet" type="text/css" href="css/table.css" />
	</head>

	<body>
		<div class="container">
			
		
		<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
			<tr>
				<hr />
				<td>
					<table width="801" height="48" border="0" cellpadding="0" cellspacing="0" align="center">
						<tr>
							<td valign="top">
								<table width="494">
									<tr>
										<td width="45" height="25">&nbsp;</td>
										<td width="437" valign="bottom">
											<font color="#66583D"><b>奖惩管理&nbsp;</b></font>&gt;
											<font color="#FF0000"> 奖惩添加</font>
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
								<form action="insertCj" method="post" onsubmit="return checkEmptyForm(cjForm)">
									<table border="1" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF" bgcolor="66583D" align="center">
										<tr>
											<th height="30"><label for="example1">奖惩题目：</label></th>
											<td width="263" bgcolor="#FFFFFF"><input type="text" name="cjTitle" class="form-control" id="example1" placeholder="奖惩题目" size="37" /></td>
										</tr>
										<tr>
											<th height="30">奖惩类型：</th>
											<td bgcolor="#FFFFFF">
												<select name="cjType" class="form-control">
													<option value="1" selected>奖励</option>
													<option value="0">惩罚</option>
												</select>
											</td>
										</tr>
										<tr>
											<th height="30"><label for="example2">奖惩金额：</label></th>
											<td bgcolor="#FFFFFF">
											<input type="text" name="cjMoney" class="form-control" id="example2" placeholder="请输入奖惩金额" size="37" />
											</td>
										</tr>
										<tr>
											<th height="30"><label for="example3">奖惩时间：</label></th>
											<td bgcolor="#FFFFFF">
											<input type="text" name="cjTime" class="form-control" id="example3" placeholder="请输入奖惩时间" size="37" />
											</td>
										</tr>
										<tr>
											<th height="30"><label for="example4">奖惩原因：</label></th>
											<td bgcolor="#FFFFFF">
											<textarea name="cjContent" class="form-control" id="example4" placeholder="请输入奖惩原因" rows="10" cols="35" class="textarea"></textarea>
											</td>
										</tr>
									</table><br>
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
		</div>
	</body>

</html>