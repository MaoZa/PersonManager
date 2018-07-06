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

			<a class="black">员工管理</a><span class="glyphicon glyphicon-menu-right"></span>
			<a class="yellow">员工查询</a>
			<hr />

			<table class="table table-bordered">
				<tr>
					<th>员工编号</th>
					<th>姓名</th>
					<th>性别</th>
					<th>部门</th>
					<th>工种</th>
					<th>学历</th>
					<th>进入公司时间</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${employees }" var="emp">
					<tr>
						<td><a href="queryOneEmployee/${emp.id }">${emp.emSerialnumber }</a></td>
						<td><a href="queryOneEmployee/${emp.id }.html">${emp.emName }</a></td>
						<td>${emp.emSex }</td>
						<c:if test="${emp.emDepartmentid==null}">
			             	<td></td>
			            </c:if>
			            <c:forEach items="${departments}" var="dep">
			            	<c:if test="${emp.emDepartmentid==dep.id }">
			            		<td>${dep.dtName}</td>
			            	</c:if>
			            </c:forEach>
						<td>${emp.emTypework }</td>
			            <td>${emp.emCulture }</td>
			            <td>${emp.emStartime }</td>
						<td><a href="updateOneEmployeeUI/${emp.id }">更新</a><a href="delOneEmployee/${emp.id }" onclick="deleteForm(${emp.id })">删除</a></td>
					</tr>
				</c:forEach>
			</table>

			<div class="row">
				<div class="col-md-8">
					<nav aria-label="Page navigation">
						<ul class="pagination">
							<li>
								<c:if test="${empPageInfo.pageNum != 1 }">
									<a href="queryEmpList?pageNum=${empPageInfo.pageNum - 1 }" aria-label="Previous">
										<span aria-hidden="true">&laquo;</span>
									</a>
								</c:if>
							</li>
							<c:forEach begin="1" end="${empPageInfo.pages}" var="i" step="1">
								<c:if test="${empPageInfo.pageNum == i }">
			               			<li><a href="queryEmpList?pageNum=${i}"><font color="red">${i}</font></a></li>
			               		</c:if> 
			             		<c:if test="${empPageInfo.pageNum != i }">
			               			<li><a href="queryEmpList?pageNum=${i}">${i}</a></li>
			               		</c:if> 
							</c:forEach>
							<li>
								<c:if test="${empPageInfo.pageNum != empPageInfo.pages }">
									<a href="queryEmpList?pageNum=${empPageInfo.pageNum + 1}" aria-label="Next">
										<span aria-hidden="true">&raquo;</span>
									</a>
								</c:if>
							</li>
						</ul>
					</nav>
				</div>

				<button type="button" class="btn btn-default btn-blue btn-pos"><a href="employee_insert">添加员工信息</a></button>
					

			</div>

		</div>
	</body>

</html>