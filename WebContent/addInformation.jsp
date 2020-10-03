<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>添加快递信息</title>
	<style type="text/css">
	body{
		background-image:url("2.png");
		background-repeat:no-repeat;
		background-position:center 0px;
		background-size: 100% 210%;
	}
</style>
</head>
<body>
	<form action="addInformation" method="post">
		<table align="center">
			
			<tr>
				<td>快递编号</td>
				<td><input type="text" name="kd_no" ></td>
			</tr>
			<tr>
				<td>收件人姓名</td>
				<td><input type="text" name="sj_name" ></td>
			</tr>
			<tr>
				<td>联系电话</td>
				<td><input type="text" name="sj_phone" > </td>
			</tr>
			<tr>
				<td>收件地址</td>
				<td><input type="text" name="sj_address" ></td>
			</tr>
			<tr>
				<td>发件人姓名</td>
				<td><input type="text" name="fj_name" ></td>
			</tr>
			<tr>
				<td>联系电话</td>
				<td><input type="text" name="fj_phone" ></td>
			</tr>
			<tr>
				<td>发件地址</td>
				<td><input type="text" name="fj_address" ></td>
			</tr>
			<tr>
				<td>快递员姓名</td>
				<td><input type="text" name="ps_name" > </td>
			</tr>
			<tr>
				<td>联系电话</td>
				<td><input type="text" name="ps_phone" ></td>
			</tr>
			<tr>
				<td>签收情况</td>
				<td><input type="text" name="ps_condition" ></td>
			</tr>
			<tr>
				<td>公司编号</td>
				<td><input type="text" name="gs_no" ></td>
			</tr>
			<tr>
				<td>派送员编号</td>
				<td><input type="text" name="ps_no" ></td>
			</tr>
			<tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="添加">
					<a href="disPlay2.jsp"><b>返回</b></a>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>