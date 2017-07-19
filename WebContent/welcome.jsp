<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv='refresh' content='3;url=/TomcatTest/demo/login.jsp'/>



<title>欢迎使用人力资源管理系统</title>
<script> 
function show(){ 
var date = new Date(); //日期对象 
var now = ""; 
now = date.getFullYear()+"年"; //读英文就行了 
now = now + (date.getMonth()+1)+"月"; //取月的时候取的是当前月-1如果想取当前月+1就可以了 
now = now + date.getDate()+"日"; 
now = now + date.getHours()+"时"; 
now = now + date.getMinutes()+"分"; 
now = now + date.getSeconds()+"秒"; 
document.getElementById("nowDiv").innerHTML = now; //div的html是now这个字符串 
setTimeout("show()",1000); //设置过1000毫秒就是1秒，调用show方法 
} 
</script> 
</head>
<body onload="show()" bgcolor="#DCE2F1"> <!-- 网页加载时调用一次 以后就自动调用了--> 
<div align="right"><label/>现在时间:<label id="nowDiv"/></div>
</body> 
</html>