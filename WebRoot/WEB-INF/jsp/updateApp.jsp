<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/headpage.jsp"%>
	修改appINFO页面
	<form
		action="${pageContext.request.contextPath }/user/updateApp_InfoSave.html">
		<div>
			软件名称: <input type="text" value="${app_Info.softwareName }"
				name="softwareName">
		</div>
		<div>
			APK名称: <input type="text" value="${app_Info.APKName }" name="APKName"
				readonly>
		</div>
		<div>
			支持ROM: <input type="text" value="${app_Info.supportROM }"
				name="supportROM">
		</div>
		<div>
			界面语言: <input type="text" value="${app_Info.interfaceLanguage }"
				name="interfaceLanguage">
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
					<option value="${flatform.valueId }"
						${app_Info.flatformId==flatform.valueId?'selected':''}>${flatform.valueName }</option>
				</c:forEach>

			</select>
		</div>
		<div>
			一级分类: <select id="categoryLevel1" name="categoryLevel1">
				<c:forEach var="categeory" items="${categeoryList }">
					<option value="${categeory.id }"
						${app_Info.categoryLevel1==categeory.id?'selected':''}>${categeory.categoryName } </option>
				</c:forEach>
			</select>
		</div>
		<div>
			二级分类: <select id="categoryLevel2" name="categoryLevel2">
				<c:forEach var="categeory2" items="${categeoryList2 }">
					<option value="${categeory2.id }"
						${app_Info.categoryLevel2==categeory2.id?'selected':''}>${categeory2.categoryName } </option>
				</c:forEach>
			</select>
		</div>
		<div>
			三级分类: <select id="categoryLevel3" name="categoryLevel3">
				<c:forEach var="categeory3" items="${categeoryList3 }">
					<option value="${categeory3.id }"
						${app_Info.categoryLevel3==categeory3.id?'selected':''}>${categeory3.categoryName } </option>
				</c:forEach>
			</select>
		</div>
		<div>
			APP状态: <input type="text" value="">
		</div>
		<div>
			应用简介:
			<textarea rows="4" cols="">${app_Info.appInfo }</textarea>
		</div>
		<div>
			<input type="submit" value="提交">
		</div>
	</form>
</body>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/statics/js/jquery-1.12.4.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/statics/js/updateApp.js"></script>

</html>
