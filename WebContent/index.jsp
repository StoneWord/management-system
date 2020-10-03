<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8" />
<title>查询界面</title>
<link rel="stylesheet" type="text/css" href="css/index.css" />
</head>

<body>
<form action="querysomeInformation" method="get">
<img class="bgone" src="img/6.jpg" />
<img class="pic" src="img/a.png" />

<div class="table">
	<div class="wel">物流派送查询</div>
	<div class="wel1">WU LIU PAI SONG CHA XUN</div>
	<div class="user">
		快递单号
	</div>			
	<div class="text">
	
		<input type="text" name="id" />
	</div>
	<input class="btn" type="submit" name="查询" value="查询" />
</div>
</form>

<div class ="C">
	如是内部用户，请<a href="登录.jsp">登录</a>
</div>
</body>
</html>