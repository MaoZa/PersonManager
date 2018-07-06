<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title></title>
		<!-- Bootstrap -->
		<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
		<link rel="stylesheet" type="text/css" href="css/style.css" />
	</head>
	<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
	<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
	<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/function.js"></script>
	<script type="text/javascript" src="js/iframe.js"></script>
	<script type="text/javascript">
		function quit() {
			if(confirm("您确实要退出本系统吗？")){
				window.location.href="exitSave.jsp";
			}
		}
	</script>
	<body>
		<div>
			<div class="bg_keyboard">

				<div class="bg_title">
					<div class="logo bg_blue">
						<img src="img/LOGO.png" />
					</div>
					<script type="text/javascript">
						function getTime()
						{
							var time=document.getElementById("Time");
							var second=document.getElementById("Second");
							var date=new Date();var hour=date.getHours();var minute=date.getMinutes();var second1=date.getSeconds();
							if(minute < 10){
								minute = "0" + minute;
							}
							var strTime=hour+":"+minute+":";
							time.innerHTML=strTime;
							if(second1 < 10){
								second1 = "0" + second1;
							}
							second.innerHTML=second1;
						}
						setInterval("getTime()",1000);
					</script>
					<div class="bg_gray">
						<span class="sysTime" id="Time"></span><font size="+2" color="white" id="Second"></font>
						<!-- <span class="sysDate" name="Date">2018.6.30</span>
						<span class="sysWeek" name="Week">星期六</span> -->
						<div class="menu">
						
							<ul>
								<li onclick="manager_update()">用户修改</li>
								<li onclick="index()">返回首页</li>
								<li onclick="quit()">安全退出</li>
							</ul>
						</div>
					</div>
						
				</div>

				<div class="whole_content">

					<div class="left_nav">
						<ul>
							<li onclick="index()">首页</li>
							<li onmouseover="show(this)" onmouseout="hide(this)">部门管理>
								<ul class="subType">
									<li onclick="department_query()"><a href="#">部门查询</a></li>
									<li onclick="department_insert()"><a href="#">部门添加</a></li>
								</ul>
							</li>
							<li onmouseover="show(this)" onmouseout="hide(this)">员工管理>
								<ul class="subType">
									<li onclick="employee_query()"><a href="#">员工查询</a></li>
									<li onclick="employee_insert()"><a href="#">员工添加</a></li>
								</ul>
							</li>
							<li onmouseover="show(this)" onmouseout="hide(this)">招聘管理>
								<ul class="subType">
									<li onclick="inviteJob_query()"><a href="#">招聘查询</a></li>
									<li onclick="inviteJob_insert()"><a href="#">招聘添加</a></li>
								</ul>
							</li>
							<li onmouseover="show(this)" onmouseout="hide(this)">培训管理>
								<ul class="subType">
									<li onclick="train_query()"><a href="#">培训查询</a></li>
									<li onclick="train_insert()"><a href="#">培训添加</a></li>
								</ul>
							</li>
							<li onmouseover="show(this)" onmouseout="hide(this)">奖惩管理>
								<ul class="subType">
									<li onclick="cj_query()"><a href="#">奖惩查询</a></li>
									<li onclick="cj_insert()"><a href="#">奖惩添加</a></li>
								</ul>
							</li>
							<li onmouseover="show(this)" onmouseout="hide(this)">薪资管理>
								<ul class="subType">
									<li onclick="pay_query()"><a href="#">薪资查询</a></li>
									<li onclick="pay_insert()"><a href="#">薪资添加</a></li>
								</ul>
							</li>
							<li onclick="manager_query()">系统管理>
							</li>
						</ul>
					</div>

					<div class="right_content">
						<h1 class="webTitle">人力资源管理系统</h1>
						<h1 class="webTitle subTitle">REN LI ZI YUAN GUAN LI XI TONG</h1>
					</div>
				</div>

				<iframe src="main.html" scrolling="no">
					
				</iframe>

			</div>
		</div>
	</body>

</html>