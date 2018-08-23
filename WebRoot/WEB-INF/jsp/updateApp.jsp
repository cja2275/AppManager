<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'updateApp_Info.jsp' starting page</title>

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
	修改appINFO页面
	<form
		action="${pageContext.request.contextPath }/user/updateApp_InfoSave.html">
		<div>
			软件名称: <input type="text" value="${app_Info.softwareName }" name="softwareName">
		</div>
		<div>
			APK名称: <input type="text" value="${app_Info.APKName }" name="APKName" readonly>
		</div>
		<div>
			支持ROM: <input type="text" value="${app_Info.supportROM }" name="supportROM">
		</div>
		<div>
			界面语言: <input type="text" value="${app_Info.interfaceLanguage }" name="interfaceLanguage">
		</div>
		<div>
			软件大小: <input type="text" value="${app_Info.softwareSize }" name="">
		</div>
		<div>
			下载次数: <input type="text" value="${app_Info.downloads}">
		</div>
		<div>
			所属平台: <select name=flatformId>
				<c:forEach var="flatform" items="${flatformList }">
				<option value="${flatform.valueId }" ${app_Info.flatformId==flatform.valueId?'selected':''}>${flatform.valueName }</option>
				</c:forEach>
				
			</select>
		</div>
		<div>
			一级分类: <input type="text" value="">
		</div>
		<div>
			二级分类: <input type="text" value="">
		</div>
		<div>
			三级分类: <input type="text" value="">
		</div>
		<div>
			APP状态: <input type="text" value="">
		</div>
		<div >
			应用简介: <textarea rows="4" cols="">${app_Info.appInfo }</textarea>
		</div>
		<div>
			<input type="submit" value="提交">
		</div>
	</form>
</body>
</html>
