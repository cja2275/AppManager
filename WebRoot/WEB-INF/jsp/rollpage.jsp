<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/headpage.jsp"%>
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