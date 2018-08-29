<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'login.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<!-- Bootstrap -->
<link
	href="${pageContext.request.contextPath }/statics/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome -->
<link
	href="${pageContext.request.contextPath }/statics/css/font-awesome.min.css"
	rel="stylesheet">
<!-- NProgress -->
<link
	href="${pageContext.request.contextPath }/statics/css/nprogress.css"
	rel="stylesheet">
<!-- Animate.css -->
<!-- <link href="https://colorlib.com/polygon/gentelella/css/animate.min.css"
	rel="stylesheet">
 -->
<!-- Custom Theme Style -->
<link
	href="${pageContext.request.contextPath }/statics/css/custom.min.css"
	rel="stylesheet">

</head>

<body class="login">
	<div>
		<a class="hiddenanchor" id="signup"></a> 
		<a class="hiddenanchor"	id="signin"></a>

		<div class="login_wrapper">
			<div class="animate form login_form">
				<section class="login_content">
				<form action="devUserlogin" method="post">
					<h1>APP开发者平台</h1>
					<div>
						<input type="text" name="devCode" class="form-control" placeholder="账号"	required="" />
					</div>
					<div>
						<input type="password" name="devPassword" class="form-control" placeholder="密码"	required="" />
					</div>
					<div>
						<a class="btn btn-success submit" href="index.html">登录</a>
						<a class="btn btn-default submit" href="index.html">重填</a>
					<!-- <input type="submit" class="btn btn-success submit" value='登录'></input>
					<input type="reset" class="btn btn-default submit" value='重置'></input> -->
					</div>
					</br>
					<div>
						<p>©2016 All Rights Reserved.</p>
					</div>
		
			</form>
			</section>
		</div>
	</div>
	</form>
	</section>
	</div>
	</div>
	</div>
</body>
</html>
