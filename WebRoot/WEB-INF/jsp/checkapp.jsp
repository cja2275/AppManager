<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@include file="/WEB-INF/jsp/headpage.jsp"%>
	<table>
		<tr>
			<td>APP名称</td>
			<td>审核</td>
		</tr>
		<c:forEach items="${page.list}" var="app">
			<tr>
				<td>${app.softwareName}</td>
				<td class="checkbyid" appid="${app.id}">审核</td>
			</tr>
			
		</c:forEach>
		
	</table>
	<p><span>总页数:${page.totalPageCount }</span>  <span>当前页:${page.currentPageNo }</span>  首页:  <c:if test="${page.currentPageNo>1 }"><a>上一页</a></c:if><c:if test="${page.currentPageNo<page.totalPageCount }"><a>下一页</a></c:if>  末页</p>
	
	<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/jquery-1.12.4.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/checkapp.js"></script>
	
</body>
</html>