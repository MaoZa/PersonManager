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
		function deleteForm(id){
			if(confirm("确定要删除此培训信息吗？")){
				window.location.href="deleteTrain/"+id;
			}
		}
	</script>

	<body>
		<div class="container">

			<a class="black">招聘管理</a><span class="glyphicon glyphicon-menu-right"></span>
			<a class="yellow">录用查询</a>
			<hr />
			<table class="table table-bordered">
					<tr align="center">
			              <th>编号</span></th>
			              <th>培训人</span></th>
			              <th>培训主题</span></th>  
						  <th>培训时间</span></th>
			              <th>培训地点</span></th>
			              <th>操作</span></th>
		            </tr>
					<c:forEach items="${trainList }" var="train">
	           	
		           		<tr align="center" bgcolor="#FFFFFF">           
				              <td height="20">${train.id }</td>
				              <td>${train.tnMan }</td>              
				              <td>${train.tnTitle }</td>
				              <td>${train.tnTime }</td>
							  <td>${train.tnAddress }</td>
				              <td><a href="trainqueryOne/${train.id}">查看详细信息</a>&nbsp;&nbsp; <a href="javascript:deleteForm('${train.id }')">删除</a></td>
			            </tr>
		           	
		           	</c:forEach>
			</table>

			<div class="row">
				<div class="col-md-8">
					<nav aria-label="Page navigation">
						<ul class="pagination">
							<li>
								<c:if test="${trainPageInfo.pageNum != 1 }">
									<a href="queryTrain?pageNum=${trainPageInfo.pageNum - 1 }" aria-label="Previous">
										<span aria-hidden="true">&laquo;</span>
									</a>
								</c:if>
							</li>
							<c:forEach begin="1" end="${trainPageInfo.pages}" var="i" step="1">
								<c:if test="${trainPageInfo.pageNum == i }">
			               			<li><a href="queryTrain?pageNum=${i}"><font color="red">${i}</font></a></li>
			               		</c:if> 
			             		<c:if test="${trainPageInfo.pageNum != i }">
			               			<li><a href="queryTrain?pageNum=${i}">${i}</a></li>
			               		</c:if> 
							</c:forEach>
							<li>
								<c:if test="${trainPageInfo.pageNum != trainPageInfo.pages }">
									<a href="queryTrain?pageNum=${trainPageInfo.pageNum + 1 }" aria-label="Next">
										<span aria-hidden="true">&raquo;</span>
									</a>
								</c:if>
							</li>
						</ul>
					</nav>
				</div>

				<button type="button" class="btn btn-default btn-blue btn-pos"><a href="train_insert.jsp">添加培训信息</a></button>

			</div>

		</div>
	</body>

</html>