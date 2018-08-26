<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/headpage.jsp"%>
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
