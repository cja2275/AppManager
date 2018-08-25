<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>APP名称</td>
			<td>审核</td>
		</tr>
		<c:forEach items="${page.list}" var="app">
			<tr>
				<td>${app.softwareName}</td>
				<td><a href="${pageContext.request.contextPath}/manager/checkappbyid?id=${app.id}">审核</a></td>
			</tr>
			
		</c:forEach>
		
	</table>
</body>
</html>