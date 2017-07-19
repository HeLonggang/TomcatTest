<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>错误信息提示</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv='refresh' content='3;url=/TomcatTest/demo/login.jsp' />

</head>

<body bgcolor="#DCE2F1">
	|<div align="center">用户名或密码输入错误，3秒后返回。</div>
	<br>
</body>
</html>
