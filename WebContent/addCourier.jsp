<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>增加新闻</title>
	<style type="text/css">
	body{
		background-image:url("2.png");
		background-repeat:no-repeat;
		background-position:center 0px;
		background-size: 100% 300%;
	}
</style>
</head>
<body>
	<form action="addCourier" method="post">
		<table align="center">
			
			<tr>
				<td>编号</td>
				<td><input type="text" name="ps_no"></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input type="text" name="ps_name"> </td>
			</tr>
			<tr>
				<td>联系电话</td>
				<td><input type="text" name="ps_phone"></td>
			</tr>
			<tr>
				<td>配送区域</td>
				<td><input type="text" name="ps_area"></td>
			</tr>
			<tr>
				<td>配送数量</td>
				<td><input type="text" name="ps_num"></td>
			</tr>
			<tr>
				<td>底薪</td>
				<td><input type="text" name="ps_salary"></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="text" name="ps_password"></td>
			</tr>
			<tr>
				<td>公司编号</td>
				<td><input type="text" name="gs_no"></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="添加">
					<a href="disPlay.jsp"><b>返回</b></a>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>