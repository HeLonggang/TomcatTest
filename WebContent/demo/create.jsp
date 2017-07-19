<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增用户信息</title>
</head>
<body bgcolor="#DCE2F1">
	<form action="../AddServlet" method="post">
		<div align="center">
			<fieldset>
				<legend>创建用户</legend>
				<p>
					<label>姓&nbsp;&nbsp;&nbsp;名：</label> <input type="text" id="u_name" name="u_name"
						tabindex="1">
				</p>
				<p>
					<label>年&nbsp;&nbsp;&nbsp;龄：</label> <input type="text" id="u_age" name="u_age"
						tabindex="2">
				</p>
				<p>
					<label>性&nbsp;&nbsp;&nbsp;别：</label> <input type="text" id="u_sex" name="u_sex"
						tabindex="3">
				</p>
				<p>
					<label>电&nbsp;&nbsp;&nbsp;话：</label> <input type="text" id="u_phone" name="u_phone"
						tabindex="3">
				</p>
				<p>
					<label>邮&nbsp;&nbsp;&nbsp;箱：</label> <input type="text" id="u_mail" name="u_mail"
						tabindex="3">
				</p>
				<p>
					<label>住&nbsp;&nbsp;&nbsp;址：</label> <input type="text" id="u_address"
						name="u_address" tabindex="3">
				</p>
				<p>
					<label>身份证：</label> <input type="text" id="u_pid" name="u_pid"
						tabindex="3">
				</p>
				<p>
					<label>备&nbsp;&nbsp;&nbsp;注：</label> <input type="text" id="u_mark" name="u_mark"
						tabindex="3">
				</p>
				<p id="buttons">
					<input id="reset" type="reset" tabindex="4" value="取消">&nbsp;&nbsp;&nbsp;&nbsp;<input
						id="submit" type="submit" tabindex="5" value="创建">
				</p>
			</fieldset>
		</div>
	</form>
</body>
</html>