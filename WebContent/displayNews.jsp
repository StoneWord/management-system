<%@page import="nuc.ss.entity.Information"%>
<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>查询新闻详情</title>
		<style type="text/css">
	body{
		background-image:url("2.png");
		background-repeat:no-repeat;
		background-position:center 0px;
		background-size: 100% 100%;
	}
</style>
</head>
<body>
<%
	Information information = (Information)request.getAttribute("information");

	if(information != null){
%>
		<table align="center">
		<tr>
			<td>快递编号</td>
			<td><input type="text" readonly="readonly"  value="<%=information.getKd_no() %>"></td>
		</tr>
		<tr>
			<td>收件人姓名</td>
			<td><input type="text" readonly="readonly"  value="<%=information.getSj_name() %>"></td>
		</tr>
		<tr>
			<td>收件人电话</td>
			<td><input type="text" readonly="readonly"  value="<%=information.getSj_phone() %>"></td>
		</tr>
		<tr>
			<td>收件人地址</td>
			<td><input type="text" readonly="readonly"  value="<%=information.getSj_address() %>"></td>
		</tr>
		<tr>
			<td>发件人姓名</td>
			<td><input type="text" readonly="readonly"  value="<%=information.getFj_name() %>"></td>
		</tr>
		<tr>
			<td>发件人电话</td>
			<td><input type="text" readonly="readonly" value="<%=information.getFj_phone() %>"></td>
		</tr>
		<tr>
			<td>发件人地址</td>
			<td><input type="text" readonly="readonly"  value="<%=information.getFj_address() %>"></td>
		</tr>
		<tr>
			<td>派送员姓名</td>
			<td><input type="text" readonly="readonly"  value="<%=information.getPs_name()%>"></td>
		</tr>
		<tr>
			<td>派送员电话</td>
			<td><input type="text" readonly="readonly"  value="<%=information.getPs_phone() %>"></td>
		</tr>
		<tr>
			<td>派送状态</td>
			<td><input type="text" readonly="readonly"  value="<%=information.getPs_condition() %>"></td>
		</tr>
		<tr>
			<td>公司编号</td>
			<td><input type="text" readonly="readonly"  value="<%=information.getGs_no() %>"></td>
		</tr>
		<tr>
			<td>派送员编号</td>
			<td><input type="text" readonly="readonly"  value="<%=information.getPs_no() %>"></td>
		</tr>
	</table>
<%
	}
%>
<br>
<center>
	<a href="index.jsp">返回</a>
</center>

</body>
</html>