<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/headpage.jsp"%>
    <div class="login_wrapper">
      <h1>APP信息管理平台</h1>
      <div>
      <a href="${pageContext.request.contextPath}/devUserlogin.html" class="btn btn-link">开发者平台 入口</a>
      </div>
      <div>
      <a href="${pageContext.request.contextPath}/managerlogin.html" class="btn btn-link">后台管理系统 入口</a>
      </div>
    </div>
  </body>
</html>