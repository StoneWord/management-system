<%@page import="nuc.ss.serviceImpl.courierServiceImpl"%>
<%@page import="nuc.ss.service.courierService"%>
<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="nuc.ss.entity.Courier"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>修改快递员信息</title>
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
	Courier courier = (Courier)request.getAttribute("courier");
%>
<br>
<br>
<br>
<br>
	<form action="updateCourierps" method="post">
		
		<table align="center">
			<tr>
				<td>编号</td>
				<td><input type="text" name="ps_no" value="<%=courier.getPs_no() %>" readonly></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input type="text" name="ps_name" value="<%=courier.getPs_name() %>" > </td>
			</tr>
			<tr>
				<td>联系电话</td>
				<td><input type="text" name="ps_phone" value="<%=courier.getPs_phone() %>"></td>
			</tr>
			<tr>
				<td>配送区域</td>
				<td><input type="text" name="ps_area" value="<%=courier.getPs_area() %>"></td>
			</tr>
			<tr>
				<td>配送数量</td>
				<td><input type="text" name="ps_num" value="<%=courier.getPs_num() %>" readonly></td>
			</tr>
			<tr>
				<td>底薪</td>
				<td><input type="text" name="ps_salary" value="<%=courier.getPs_salary() %>" readonly></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="text" name="ps_password" value="<%=courier.getPs_password() %>"></td>
			</tr>
			<tr>
				<td>公司编号</td>
				<td><input type="text" name="gs_no" value="<%=courier.getGs_no() %>" readonly></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="保存修改">
				</td>
			</tr>
		</table>
	</form>

<br>
<center>
	<a href="disPlay3.jsp">返回</a>
</center>

</body>
</html>