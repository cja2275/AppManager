<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>APPMANAGER</title>
    
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
	<p>欢迎来到app管理系统  <span id="tips"></span>
  	<script type="text/javascript">
  		window.onload=function(){
  			var login="<%=session.getAttribute("login")%>"; 
	  		if("null"==login){
	  			document.getElementById('tips').innerHTML = "请登录"
	  			
	  		}else{
	  			document.getElementById('tips').innerHTML = "<a href='${pageContext.request.contextPath}/cancel'>注销</a>";
	  		}
  		}
  		
  	</script>
