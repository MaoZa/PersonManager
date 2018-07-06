<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@page import="java.util.Map"%>
<%@page import="com.hxzy.pojo.TbDepartment"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.min.css" />
		<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
		<script type="text/javascript" src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
		<link rel="stylesheet" type="text/css" href="css/table.css"/>
		<script type="text/javascript">
			function deleteForm(id){
				if(confirm("确定要删除此部门信息吗？")){
					window.location.href="deleteDepartment?id="+id;
				}
			}
		</script>
	</head>
	
	<body>
		<div class="container">
			
			<a class="black">部门管理</a><span class="glyphicon glyphicon-menu-right"></span><a class="yellow">部门查询</a> 
			<hr />
			
			<table class="table table-bordered">
				<tr>
					<th>序号</th>
					<th>部门名称</th>
					<th>创建时间</th>
					<th>部门人数</th>
					<th>备注</th>
					<th>操作</th>
				</tr>
				<%
			      	Map<Long,Long> countPack = (Map<Long,Long>)request.getSession().getAttribute("countPack");
			    	List<TbDepartment> departments = (List<TbDepartment>)request.getSession().getAttribute("departments");
			     	for(TbDepartment department : departments){
			     		out.println("<tr>");
			     		out.println("<td>" + department.getId() + "</td>");
			     		out.println("<td>" + department.getDtName() + "</td>");
			     		out.println("<td>" + department.getDtCreatetime() +"</td>");
			    		out.println("<td>" + countPack.get(Long.parseLong(department.getId()+"")) + "</td>");
			    		out.println("<td>" + department.getDtBz() + "</td>");
			    		out.println("<td><a href=\"javascript:deleteForm(\'" + department.getId() + "\')\">删除</a></td>");
			    		out.println("</tr>");
			    	}
			    %>
			</table>

			<div class="row">

				<div class="col-md-8">

					<nav aria-label="Page navigation">
						<ul class="pagination">
							<li>
								<c:if test="${pageInfo.pageNum != 1 }">
									<a href="queryDepList?pageNum=${pageInfo.pageNum - 1 }" aria-label="Previous">
										<span aria-hidden="true">&laquo;</span>
									</a>
								</c:if>
							</li>
							<c:forEach begin="1" end="${pageInfo.pages}" var="i" step="1">
								<c:if test="${pageInfo.pageNum == i }">
			               			<li><a href="queryDepList?pageNum=${i}"><font color="red">${i}</font></a></li>
			               		</c:if> 
			             		<c:if test="${pageInfo.pageNum != i }">
			               			<li><a href="queryDepList?pageNum=${i}">${i}</a></li>
			               		</c:if> 
							</c:forEach>
							<li>
								<c:if test="${pageInfo.pageNum != pageInfo.pages }">
									<a href="queryDepList?pageNum=${pageInfo.pageNum + 1 }" aria-label="Next">
										<span aria-hidden="true">&raquo;</span>
									</a>
								</c:if>
							</li>
						</ul>
					</nav>
				</div>

				<button type="button" class="btn btn-default btn-blue"><a href="department_insert.jsp">添加部门</a></button>

			</div>

		</div>

	</body>

</html>