<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'nologin.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    正在跳转登录页面..<span id="mes"></span>
    <script language="javascript" type="text/javascript"> 
		var i = 3; 
		var intervalid; 
		intervalid = setInterval("fun()", 1000); 
		function fun() { 
		if (i == 0) { 
		window.location.href = "index.jsp"; 
		clearInterval(intervalid); 
		} 
		document.getElementById("mes").innerHTML = i; 
		i--; 
		} 
	</script>
  </body>
</html>
