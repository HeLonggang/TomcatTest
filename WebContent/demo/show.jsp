<%@ page language="java"
	import="java.util.*,com.gzcss.dao.impl.*,com.gzcss.entity.*"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>用户信息</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
fieldset {
  position: relative;
}
</style>
<script>
	function show() {
		var date = new Date(); //日期对象 
		var now = "";
		now = date.getFullYear() + "年"; //读英文就行了 
		now = now + (date.getMonth() + 1) + "月"; //取月的时候取的是当前月-1如果想取当前月+1就可以了 
		now = now + date.getDate() + "日";
		now = now + date.getHours() + "时";
		now = now + date.getMinutes() + "分";
		now = now + date.getSeconds() + "秒";
		document.getElementById("nowDiv").innerHTML = now; //div的html是now这个字符串 
		setTimeout("show()", 1000); //设置过1000毫秒就是1秒，调用show方法 
	}
</script>
</head>
<body onload="show()" bgcolor="#DCE2F1">
	<div align="right">
		<label />现在时间:<label id="nowDiv" />
	</div>
	<form action="<%=basePath%>SearchServlet" method="post">
		<div align="center">
			<fieldset>
				<legend>查询用户信息</legend>
				<p />
				用户名：<input type="text" name="" maxlength="20"> 联系电话：<input
					type="text" name="" maxlength="20">
				性&nbsp;&nbsp;&nbsp;&nbsp;别： <input type="text" name=""
					maxlength="20"> 备注信息： <input type="text" name=""
					maxlength="20">
				<p id="buttons" />
				<input id="submit" type="submit" tabindex="5" value="查询"> <input
					id="reset" type="reset" tabindex="4" value="重置">
			</fieldset>
		</div>
		<fieldset>
			<legend>用户基本信息</legend>
			<input id="edit" type="button" tabindex="5" value="新增"
				onClick="location.href='<%=basePath%>demo/create.jsp'">&nbsp;&nbsp;<input
				id="edit" type="button" tabindex="5" value="编辑" disabled="disabled">&nbsp;&nbsp;<input
				id="update" type="button" tabindex="4" value="修改"
				disabled="disabled">&nbsp;&nbsp;<input id="delete"
				type="button" tabindex="4" value="删除" disabled="disabled">
			<table border="1" width="100%" borderColor=#DCE2F1 cellSpacing=0
				cellPadding=0 align=center bgColor=#EBEBE4 border=1
				frame=void>
					<tr align="center">
						<td width="8%"><input type="checkbox">全选</td>
						<td width="10%"><label>姓&nbsp;&nbsp;&nbsp;&nbsp;名</label>
						</td>
						<td width="23%"><label>性&nbsp;&nbsp;&nbsp;&nbsp;别</label>
						</td>
						<td width="25%"><label>年&nbsp;&nbsp;&nbsp;&nbsp;龄</label>
						</td>
						<td width="15%"><label>常用邮箱</label>
						</td>
						<td width="20%"><label>备&nbsp;&nbsp;&nbsp;&nbsp;注</label>
						</td>
					</tr>

					<%
						UserDaoImpl userDao = new UserDaoImpl();
						List userlist = userDao.findUser();
						for (int i = 0; i < userlist.size(); i++) {
							User user = (User) userlist.get(i);
					%>
					<tr align="center">
						<td width="8%"><input type="checkbox"></td>
						<td width="10%"><%=user.getU_name()%></td>
						<td width="23%"><%=user.getU_sex()%></td>
						<td width="25%"><%=user.getU_age()%></td>
						<td width="15%"><%=user.getU_email()%></td>
						<td width="20%"><%=user.getU_mark()%></td>
					</tr>
					<%
						}
					%>
				
			</table>
		</fieldset>
	</form>
</body>
</html>
