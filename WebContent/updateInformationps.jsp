<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="nuc.ss.entity.Information"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>修改新闻</title>
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
    Information infor = (Information)request.getAttribute("information");
%>
	<form action="updateInformationps" method="post">
		
		<table align="center">
			<tr>
				<td>快递编号</td>
				<td><input type="text" name="kd_no" value="<%=infor.getKd_no() %>" readonly></td>
			</tr>
			<tr>
				<td>收件人姓名</td>
				<td><input type="text" name="sj_name" value="<%=infor.getSj_name() %>" readonly></td>
			</tr>
			<tr>
				<td>联系电话</td>
				<td><input type="text" name="sj_phone" value="<%=infor.getSj_phone() %>" readonly> </td>
			</tr>
			<tr>
				<td>收件地址</td>
				<td><input type="text" name="sj_address" value="<%=infor.getSj_address() %>" readonly></td>
			</tr>
			<tr>
				<td>发件人姓名</td>
				<td><input type="text" name="fj_name" value="<%=infor.getFj_name() %>" readonly></td>
			</tr>
			<tr>
				<td>联系电话</td>
				<td><input type="text" name="fj_phone" value="<%=infor.getFj_phone() %>" readonly></td>
			</tr>
			<tr>
				<td>发件地址</td>
				<td><input type="text" name="fj_address" value="<%=infor.getFj_address() %>" readonly></td>
			</tr>
			<tr>
				<td>快递员姓名</td>
				<td><input type="text" name="ps_name" value="<%=infor.getPs_name() %>" readonly> </td>
			</tr>
			<tr>
				<td>联系电话</td>
				<td><input type="text" name="ps_phone" value="<%=infor.getPs_phone() %>" readonly></td>
			</tr>
			<tr>
				<td>签收情况</td>
				<td><input type="text" name="ps_condition" value="<%=infor.getPs_condition() %>"></td>
			</tr>
			<tr>
				<td>公司编号</td>
				<td><input type="text" name="gs_no" value="<%=infor.getGs_no() %>" readonly></td>
			</tr>
			<tr>
				<td>派送员编号</td>
				<td><input type="text" name="ps_no" value="<%=infor.getPs_no() %>" readonly></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="保存修改">
				</td>
			</tr>
		</table>
	</form>

<br>

	<a href="disPlay3.jsp">返回</a>


</body>
</html>