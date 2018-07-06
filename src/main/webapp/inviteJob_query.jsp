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
		function deleteForm(date){
			if(confirm("确定要删除此应聘人员信息吗？")){
				window.location.href="deleteInviteJob&id="+date;
			}
		}
	</script>

	<body>
		<div class="container">

			<a class="black">招聘管理</a><span class="glyphicon glyphicon-menu-right"></span>
			<a class="yellow">录用查询</a>
			<hr />
			<tr align="center"> 
				<td width="55" align="left"><a href="${pageContext.servletContext.contextPath }/queryInviteJob?isstock=1">录用查询</a></td>
			    <td width="561" align="left"><a href="${pageContext.servletContext.contextPath }/queryInviteJob?isstock=0">非录用查询</a></td>
			</tr>
			<table class="table table-bordered">
				<tr>
		              <th>编号</th>
		              <th>姓名</th>
		              <th>性别</th>
					  <th>应聘职务</th>
					  <th>学历</th>
		              <th>工作经验</th>
		              <th>操作</th>
	            </tr>
				<c:forEach items="${inviteJobList }" var="inv">
		            <tr align="center" bgcolor="#ffffff">
		              <td height="25">${inv.id }</td>
		              <td>${inv.name }</td>
		              <td>${inv.sex }</td>
		              <td>${inv.job }</td>
		              <td>${inv.teachschool }</td>
		              <td>${inv.experience }</td>
		              <td>	<a href="${pageContext.servletContext.contextPath }/queryOneInviteJob/${inv.id }">详细查询</a>
		             		<c:if test="${inv.isstock == 0 }">
		             			<a href="${pageContext.servletContext.contextPath }/InviteJob/${inv.id }">录用</a>
		             		</c:if>
		              </td>
		            </tr>
            	</c:forEach>
			</table>

			<div class="row">
				<div class="col-md-8">
					<nav aria-label="Page navigation">
						<ul class="pagination">
							<li>
								<c:if test="${inviteJobPageInfo.pageNum != 1 }">
									<a href="queryInviteJob?pageNum=${inviteJobPageInfo.pageNum - 1 }" aria-label="Previous">
										<span aria-hidden="true">&laquo;</span>
									</a>
								</c:if>
							</li>
							<c:forEach begin="1" end="${inviteJobPageInfo.pages}" var="i" step="1">
								<c:if test="${inviteJobPageInfo.pageNum == i }">
			               			<li><a href="queryInviteJob?pageNum=${i}"><font color="red">${i}</font></a></li>
			               		</c:if> 
			             		<c:if test="${inviteJobPageInfo.pageNum != i }">
			               			<li><a href="queryInviteJob?pageNum=${i}">${i}</a></li>
			               		</c:if> 
							</c:forEach>
							<li>
								<c:if test="${inviteJobPageInfo.pageNum != inviteJobPageInfo.pages }">
									<a href="queryInviteJob?pageNum=${inviteJobPageInfo.pageNum + 1 }" aria-label="Next">
										<span aria-hidden="true">&raquo;</span>
									</a>
								</c:if>
							</li>
						</ul>
					</nav>
				</div>
				<c:if test="${inviteJobList[0].isstock == 0 }">
           			<button type="button" class="btn btn-default btn-blue btn-pos"><a href="inviteJob_insert.jsp">添加招聘信息</a></button>
           		</c:if>
			</div>

		</div>
	</body>

</html>