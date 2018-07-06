<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>措滹人力资源管理系统--员工管理</title>
		<link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.min.css" />
		<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
		<script type="text/javascript" src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
		<link rel="stylesheet" type="text/css" href="css/table.css" />
	</head>
	<script type="text/javascript">
		function deleteForm(id) {
			if(confirm("确定要删除此员工信息吗？")) {
				window.location.href = "${pageContext.request.contextPath}/delOneEmployee/" + id;
			}
		}
	</script>

	<body>
		<div class="container">

			<a class="black">用户管理</a><span class="glyphicon glyphicon-menu-right"></span>
			<a class="yellow">用户查询</a>
			<hr />

			<table class="table table-bordered">
				<tr align="center">
	              <th>序号</th>
	              <th>账号</th>
	              <th>操作</th>
	            </tr>
				<c:forEach items="${managerList }" var="manager">
		         	<tr align="center" bgcolor="#FFFFFF">           
		              <td height="20">${manager.id}</td>
		              <td>${manager.account}</td>
		              <td><a href="javascript:deleteForm('${manager.id}')">删除</a></td>
		            </tr>
		         </c:forEach>
			</table>

			<div class="row">
				

				<button type="button" class="btn btn-default btn-blue btn-pos"><a href="manager_insert.jsp">添加管理员</a></button>
					

			</div>

		</div>
	</body>

</html>