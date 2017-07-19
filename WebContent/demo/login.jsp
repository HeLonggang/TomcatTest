<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>管理员登录</title>
<!--<script>
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
</script>-->
<style type="text/css">
#content {
	position: absolute;
	top: 50%;
	height: 240px;
	margin-top: -120px; /* negative half of the height */
}

fieldset {
	width: 260px;
	height: 120px;
	font-size: 14px;
	color: #808080;
}
</style>
</head>
<body onload="show()" bgcolor="#DCE2F1">
	<!--<div align="right">
		<label />现在时间:<label id="nowDiv" />
	</div>-->
	<form action="../LoginServlet" method="post">
		<div align="center">
			<fieldset>
				<legend>管理员登录</legend>
				<p>
					<label>用户名：</label> <input type="text" id="name" name="username"
						tabindex="1">
				</p>
				<p>
					<label>密&nbsp;&nbsp;&nbsp;&nbsp;码：</label> <input type="text"
						id="pwd" name="pwd" tabindex="3">
				</p>
				<p id="buttons">
					<input id="submit" type="submit" tabindex="5" value="登录">&nbsp;&nbsp;<input
						id="reset" type="reset" tabindex="4" value="重置">
				</p>
			</fieldset>
		</div>
	</form>
</body>
</html>