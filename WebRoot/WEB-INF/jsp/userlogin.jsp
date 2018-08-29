<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/headpage.jsp"%>
	
	<form action="devUserlogin" method="post">
		<table>
			<tr>
				<td>开发者账号</td>
				<td><input type="text" name="devCode"></input></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" name="devPassword"></input></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value='登录'></input>
					<input type="reset" value='重置'></input>
				</td>
			</tr>
		</table>
	</form>
	
</body>
</html>