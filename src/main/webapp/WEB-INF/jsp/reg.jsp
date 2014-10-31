<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
 String path=request.getContextPath();
 String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<base href="<%=basePath%>>">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/save.do" method="post">
	username: <input type="text" name="username" value="${user.username}"><br/>
	password: <input type="password" name="password" value="${user.password}"><br/>
	<input type="submit" value="Save">
</form>
</body>
</html>