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
			<div>
				软件名称：<input name=softwareName type="text" id="softwareName"
					name="softwareName" value="${softwareName }">
			</div>
			<div>
				APP状态： <select id="status" name="status">
					<c:if test="${statusList}!=null"></c:if>
					<option>---请选择---</option>
					<c:forEach var="data_Dictionary" items="${statusList }">
						<c:if test="${data_Dictionary=status}">selected="selected"</c:if>
						<option value="${data_Dictionary.valueId}">${data_Dictionary.valueName}</option>
					</c:forEach>
				</select>
			</div>

			<div>
				所属平台：<select id="flatformId" name="flatformId">
					<c:if test="${flatformIdList}!=null"></c:if>
					<option>---请选择---</option>
					<c:forEach var="data_Dictionary" items="${flatformIdList }">
						<c:if test="${Data_Dictionary=flatformId }">selected="selected"</c:if>
						<option value="${data_Dictionary.valueId}">${data_Dictionary.valueName}</option>
					</c:forEach>
				</select>
			</div>
			<div>
				一级分类：<select id="categoryLevel1" name="categoryLevel1">
					<c:if test="${categoryLevel1List}!=null"></c:if>
					<option>---请选择---</option>
					<c:forEach var="app_Category" items="${categoryLevel1List }">
						<c:if test="${app_Category.id=categoryLevel1 }">selected="selected"</c:if>
						<option value="${app_Category.id}">${app_Category.categoryName}</option>
					</c:forEach>
				</select>
			</div>
			<div>
				二级分类：<select id="categoryLevel2" name="categoryLevel2">
					<c:if test="${categoryLevel2List}!=null"></c:if>
					<option>---请选择---</option>
					<c:forEach var="app_Category" items="${categoryLevel2List }">
						<c:if test="${app_Category.id=categoryLevel2 }">selected="selected"</c:if>
						<option value="${app_Category.id}">${app_Category.categoryName}</option>
					</c:forEach>
				</select>
			</div>
			<div>
				三级分类：<select id="categoryLevel3" name="categoryLevel3">
					<c:if test="${categoryLevel3List}!=null"></c:if>
					<option>---请选择---</option>
					<c:forEach var="app_Category" items="${categoryLevel3List }">
						<c:if test="${app_Category.id=categoryLevel3 }">selected="selected"</c:if>
						<option value="${app_Category.id}">${app_Category.categoryName}</option>
					</c:forEach>
				</select>
			</div>

			<button type="submit"
				onclick="window.location.href='${pageContext.request.contextPath }/app_infolist.html'">查询</button>
		</form>
	</div>

	<div>
		<table border=1px>
			<tr>
				<th>软件名称</th>
				<th>APK名称</th>
				<th>软件大小(单位:M)</th>
				<th>所属平台</th>
				<th>一级分类</th>
				<th>二级分类</th>
				<th>三级分类</th>
				<th>状态</th>
				<th>下载次数</th>
				<th>最新版本号</th>
				<th>操作</th>
			</tr>
			<tr>
				<c:forEach var="app_Info" items="${app_InfoList}">
			<tr>
				<td>${app_Info.softwareName}</td>
				<td>${app_Info.APKName}</td>
				<td>${app_Info.softwareSize}</td>
				<td>${app_Info.flatformName}</td>
				<td>${app_Info.categoryLevel1Name }</td>
				<td>${app_Info.categoryLevel2Name }</td>
				<td>${app_Info.categoryLevel3Name }</td>
				<td>${app_Info.statusName }</td>
				<td>${app_Info.downloads }</td>
				<td>${app_Info.versionNo }</td>
				<td><input type="button" value="点击操作"></td>
			</tr>
			</c:forEach>
			</tr>
		</table>
	</div>

	<div>共${pages.totalCount }条记录
		${pages.currentPageNo }/${pages.totalPageCount }页
	</div>

	<div>
			<c:if test="${pages.currentPageNo > 1}">
				<li><a href="${pageContext.request.contextPath }/user/app_infolist.html?pageIndex=1">首页</a></li>
				<li><a
					href="${pageContext.request.contextPath }/user/app_infolist.html?pageIndex=${currentPageNo-1}">上一页</a>
				</li>
			</c:if>
			<c:if test="${pages.currentPageNo < pages.totalPageCount }">
				<li><a
					href="${pageContext.request.contextPath }/user/app_infolist.html?pageIndex=${currentPageNo+1 }">下一页</a>
				</li>
				<li><a
					href="${pageContext.request.contextPath }/user/app_infolist.html?pageIndex=${totalPageCount }">最后一页</a>
				</li>
			</c:if>
	</div>



</body>
</html>
