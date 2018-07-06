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
			if(confirm("确定要删除此员工的工资信息吗？")){
				window.location.href="${pageContext.request.contextPath}/deletePay?id="+date;
			}
		}
		function checkform1(){
			if(document.form1.pay_month.value==""){
				window.location.href="queryPay";
				return false;
			}
			if(form1.pay_month.value.length >11){
				window.location.href="queryPay";
				return false;
			}
			return true;
		}
	</script>

	<body>
		<div class="container">


			


		<a class="black">薪资管理</a><span class="glyphicon glyphicon-menu-right"></span>
			<a class="yellow">薪资查询</a>
			<hr />
			
			<table width="481">
				<tr>
					<td width="224">
						<form name="form1" method="post"
							action="${pageContext.request.contextPath}/queryPayByTime"
							onsubmit="return checkform1()">
							<table width="233">
								<tr>
									<td><input name="sumbit1" type="submit" value="年月查询"></td>
									<td><input type="date" name="pay_month" value=""></td>
								</tr>
							</table>
						</form>
	
					</td>
					<td width="283">
						<form name="form2" method="post" action="queryPayByPayEmnumber">
							<table width="233">
								<tr>
									<td><input name="sumbit2" type="submit" value="员工查询"></td>
									<td><select name="emNumber">
	
											<c:forEach items="${employees }" var="emp">
												<option value="${emp.emSerialnumber }">${emp.emSerialnumber }-${emp.emName }</option>
											</c:forEach>
	
									</select></td>
								</tr>
							</table>
						</form>
	
					</td>
				</tr>
			</table>	
			
			<table class="table table-bordered">
					<tr align="center">
			              <th>员工编号</th>
			              <th>员工姓名</th>
			              <th>当前月份</th>
			              <th>基本工资</th>
						  <th>加班费</th>
			              <th>工龄费</th>
			              <th>考勤费</th>
						  <th>旷工费</th>
						  <th>保险费</th>
						  <th>实发工资</th>
						  <th>操作</th>
			   		</tr>
					<c:forEach items="${payList }" var="pay">
	           	
		           		<tr align="center" bgcolor="#ffffff">
			              <td height="25">${pay.payEmnumber }</td>
			              <td>${pay.payEmname }</td>
			              <td>${pay.payMonth }</td>
			              <td>${pay.payBasemoney }</td>
			              <td>
			              	<c:if test="${pay.payOvertime > 0 }">${pay.payOvertime }</c:if>
			             	<c:if test="${pay.payOvertime == 0 }">0</c:if>
			              </td>
			              <td>
				              <c:if test="${pay.payAge == 1 }">100.0</c:if>
				              <c:if test="${pay.payAge == 0 }">0</c:if>
			              </td>
			              <td>${pay.payCheck }</td>
			              <td>${pay.payAbsent }</td>
			              <td>${pay.paySafety }</td>
			              <td>
			              	<c:if test="${pay.payOvertime == 1 }">
			              		${pay.payBasemoney + pay.payOvertime*100.0 + 100.0 + 100.0 }
			              	</c:if>
			              </td>
			              <td><a href="javascript:deleteForm('${pay.id }')">删除</a></td>
			            </tr>
		           	
		           	</c:forEach>
			</table>

			<div class="row">
				<div class="col-md-8">
					<nav aria-label="Page navigation">
						<ul class="pagination">
							<li>
								<c:if test="${payPageInfo.pageNum != 1 }">
									<a href="queryPayByTime?pageNum=${payPageInfo.pageNum - 1 }&pay_month=${pay_month }" aria-label="Previous">
										<span aria-hidden="true">&laquo;</span>
									</a>
								</c:if>
							</li>
							<c:forEach begin="1" end="${payPageInfo.pages}" var="i" step="1">
								<c:if test="${payPageInfo.pageNum == i }">
			               			<li><a href="queryPayByTime?pageNum=${i}&pay_month=${pay_month }"><font color="red">${i}</font></a></li>
			               		</c:if> 
			             		<c:if test="${payPageInfo.pageNum != i }">
			               			<li><a href="queryPayByTime?pageNum=${i}&pay_month=${pay_month }">${i}</a></li>
			               		</c:if> 
							</c:forEach>
							<li>
								<c:if test="${payPageInfo.pageNum != payPageInfo.pages }">
									<a href="queryPayByTime?pageNum=${payPageInfo.pageNum + 1 }&pay_month=${pay_month }" aria-label="Next">
										<span aria-hidden="true">&raquo;</span>
									</a>
								</c:if>
							</li>
						</ul>
					</nav>
				</div>

				<button type="button" class="btn btn-default btn-blue btn-pos"><a href="${pageContext.request.contextPath}/pay_insert">添加薪资</a></button>

			</div>

		</div>
	</body>

</html>