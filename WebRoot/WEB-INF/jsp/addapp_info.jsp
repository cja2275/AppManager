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

<title>My JSP 'addapp_info.jsp' starting page</title>

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
		<form
			action="${pageContext.request.contextPath }/user/addapp_infosave.html"
			method="post" enctype="multipart/form-data">

			<table border=1>
				<tr>
					<td>软件名称：</td>
					<td><input type="text" id="softwareName" name="softwareName"></td>
				</tr>
				<tr>
					<td>APK名称：</td>
					<td><input type="text" id="APKName" name="APKName"></td>
				</tr>
				<tr>
					<td>支持ROM：</td>
					<td><input type="text" id="supportROM" name="supportROM"></td>
				</tr>
				<tr>
					<td>界面语言：</td>
					<td><input type="text" id="interfaceLanguage"
						name="interfaceLanguage"></td>
				</tr>
				<tr>
					<td>软件大小：</td>
					<td><input type="text" id="softwareSize" name="softwareSize"></td>
				</tr>
				<tr>
					<td>下载次数：</td>
					<td><input type="text" id="downloads" name="downloads"></td>
				</tr>
				<tr>
					<td>所属平台：</td>
					<td><select id="flatformId" name="flatformId">
							<c:if test="${flatformIdList }!=null"></c:if>
							<option>---请选择---</option>
							<c:forEach var="data_Dictionary" items="${flatformIdList }">
								<option value="${data_Dictionary.valueId}">${data_Dictionary.valueName}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>一级分类：</td>
					<td><select id="categoryLevel1" name="categoryLevel1">
							<c:if test="${categoryLevel1List }!=null"></c:if>
							<option>---请选择---</option>
							<c:forEach var="app_Category" items="${categoryLevel1List}">
								<option value="${app_Category.id}">${app_Category.categoryName }</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>二级分类：</td>
					<td><select id="categoryLevel2" name="categoryLevel2">
					</select></td>
				</tr>
				<tr>
					<td>三级分类：</td>
					<td><select id="categoryLevel3" name="categoryLevel3">
					</select></td>
				</tr>
				<tr>
					<td>APP状态：</td>
					<td>待审核</td>
				</tr>
				<tr>
					<td>应用简介：</td>
					<td><textarea rows="4" cols="" id="appInfo" name="appInfo"></textarea></td>
				</tr>
				<tr>
					<td>LOGO图片：</td>
					<td>图片</td>
				</tr>

				<tr>
					<td>
						<button type="submit">保存</button>
						<button type="button"
							onclick="window.location.href='${pageContext.request.contextPath }/user/app_infolist.html'">返回</button>
					</td>
				</tr>


			</table>
		</form>
	</div>


	<script type="text/javascript"
		src="${pageContext.request.contextPath }/statics/js/jquery-1.12.4.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath }/statics/js/addapp_info.js"></script>
</body>
</html>
