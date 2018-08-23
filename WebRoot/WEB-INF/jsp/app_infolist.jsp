<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'app_infolist.jsp' starting page</title>

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
	<div>
		<form action="${pageContext.request.contextPath }/app_infolist.html"
			method="post">
			软件名称：<input name=softwareName type="text" value="${softwareName}">
			APP状态：<select id="status" name="status"><option value="">---请选择---</option>
			        <option value="status">待审核</option>
			        <option value="status">审核通过</option>
			        <option value="status">审核未通过</option>
			        <option value="status">已上架</option>
			        <option value="status">已下架</option></select>
			所属平台：<select id="flatformId" name="flatformId"><option value="">---请选择---</option>
			        <option value="flatformId">手机</option>
			        <option value="flatformId">平板</option>
			        <option value="flatformId">通用</option></select>
			一级分类：<select name="categoryLevel1">
									<c:if test="${statusList != null }">
									   <option value="">--请选择--</option>
									   <c:forEach var="dataDictionary" items="${statusList}">
									   		<option <c:if test="${dataDictionary.valueId == queryStatus }">selected="selected"</c:if>
									   		value="${dataDictionary.valueId}">${dataDictionary.valueName}</option>
									   </c:forEach>
									</c:if>
        						</select>
			        
			
			<button type="submit"
				onclick="window.location.href='${pageContext.request.contextPath }/app_infolist.html'">查询</button>
		</form>
	</div>

</body>
</html>
