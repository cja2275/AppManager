<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	
</script>
</head>
<body>
 		<div>
			<ul>
				<li>共${totalCount }条记录  ${currentPageNo }/${totalPageCount }页</li>
					<a href="${pageContext.request.contextPath }/app_infolist.html?pageIndex=1">首页</a>
					<a href="${pageContext.request.contextPath }/app_infolist.html?pageIndex=${currentPageNo-1}">上一页</a>
					<a href="${pageContext.request.contextPath }/app_infolist.html?pageIndex=${currentPageNo+1 }">下一页</a>
					<a href="${pageContext.request.contextPath }/app_infolist.html?pageIndex=${totalPageCount }">最后一页</a>
			</ul>
		</div> 
</body>
</html>