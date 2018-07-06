<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
				if(confirm("确定要删除此奖惩信息吗？")){
					window.location.href="${pageContext.request.contextPath}/deleteCj?id="+id;
				}
			}
		</script>
	</head>
	
	<body>
		<div class="container">
			
			<a class="black">奖惩管理</a><span class="glyphicon glyphicon-menu-right">
			</span><a class="yellow">奖惩查询</a> 
			<hr />
			
			<table class="table table-bordered">
				<tr>
					<th>编号</th>
					<th>奖惩主题</th>
					<th>奖惩类型</th>
					<th>奖励金额</th>
					<th>奖励时间</th>
					<th>操作</th>
				</tr>
				<c:if test="${!empty cjList}">
	             	<c:forEach items="${cjList}" var="cjlist">
	             		<tr>
				              <td height="25">${cjlist.id}</td>
				              <td>${cjlist.cjTitle}</td>
				              <td>${cjlist.cjType==1?"奖励":"惩罚" }</td>
							  <td>${cjlist.cjMoney}</td>
							  <td>${cjlist.cjTime}</td>    
				              <td>	<a href="queryOneCj/${cjlist.id}">详细查询</a>&nbsp;&nbsp;
		              				<a href="javascript:deleteForm('${cjlist.id}')">删除</a></td>
	            		</tr>
	             	</c:forEach>
	             </c:if>
			</table>

			<div class="row">

				<div class="col-md-8">

					<nav aria-label="Page navigation">
						<ul class="pagination">
							<li>
								<c:if test="${CjPageInfo.pageNum != 1 }">
									<a href="queryCj?pageNum=${CjPageInfo.pageNum - 1 }" aria-label="Previous">
										<span aria-hidden="true">&laquo;</span>
									</a>
								</c:if>
							</li>
							<c:forEach begin="1" end="${CjPageInfo.pages}" var="i" step="1">
								<c:if test="${CjPageInfo.pageNum == i }">
			               			<li><a href="queryCj?pageNum=${i}"><font color="red">${i}</font></a></li>
			               		</c:if> 
			             		<c:if test="${CjPageInfo.pageNum != i }">
			               			<li><a href="queryCj?pageNum=${i}">${i}</a></li>
			               		</c:if> 
							</c:forEach>
							<li>
								<c:if test="${CjPageInfo.pageNum != CjPageInfo.pages }">
									<a href="queryCj?pageNum=${CjPageInfo.pageNum + 1 }" aria-label="Next">
										<span aria-hidden="true">&raquo;</span>
									</a>
								</c:if>
							</li>
						</ul>
					</nav>
				</div>

				<button type="button" class="btn btn-default btn-blue"><a href="cj_insert.jsp">添加奖惩信息</a></button>

			</div>

		</div>

	</body>

</html>