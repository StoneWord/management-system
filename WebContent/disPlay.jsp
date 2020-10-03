<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>

<%@page import="nuc.ss.service.courierService"%>
<%@page import="nuc.ss.serviceImpl.courierServiceImpl"%>
<%@page import="nuc.ss.entity.Courier"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>快递员信息管理</title>
<script type="text/javascript">
		function del(id){
			var flag = window.confirm("是否真的要删除？");
			if(flag){
				window.location.href = "deleteCourier?id=" + id;
			}
		}
		function update(id){
			window.location.href = "queryCourier?id=" + id +"&flag=1";
		}
		function query(id){
			window.location.href = "queryCourier?id=" + id +"&flag=0";
		}
	</script>
	<style type="text/css">
	body{
		background-image:url("3.jpg");
		background-repeat:no-repeat;
		background-position:center 0px;
		background-size: 100% 280%;
	}
</style>
</head>
<body>
<a href="addCourier.jsp"><b>添加快递员</b></a>
<%
	int pageNow = 1;
	String spageNow = request.getParameter("pageNow");
	if(spageNow != null){
		pageNow = Integer.parseInt(spageNow);
	}
%>
	<table  align="center" border="1" width="750px" cellspacing="0">
			<tr>
				<th width="50px">ID</th>
				<th width="70px">姓名</th>
				<th width="100px">电话号码</th>
				<th width="120px">派送区域</th>
				<th width="20px">派送数量</th>
				<th width="20px">薪资</th>
				<th width="100px">密码</th>
				<th width="50px">公司编号</th>
				<th width="70px">操作</th>
		    </tr>
	    <%
	    courierService cs = new courierServiceImpl();
	    List<Courier> list = cs.GetByPage(pageNow); 
	    
	    
	    for(Courier courier: list){
	    %>
	    	<tr>
	    		<td><%=courier.getPs_no() %></td>
	    		<td><%=courier.getPs_name() %></td>
	    		<td><%=courier.getPs_phone() %></td>
	    		<td><%=courier.getPs_area() %></td>
	    		<td><%=courier.getPs_num() %></td>
	    		<td><%=courier.getPs_salary()+courier.getPs_num()*5 %></td>
	    		<td><%=courier.getPs_password() %></td>
	    		<td><%=courier.getGs_no() %></td>
	    		<td>
	    			<a href="javascript:update(<%=courier.getPs_no() %>)">修改</a>
	    			<a href="javascript:del(<%=courier.getPs_no()%>)">删除</a>
	    		</td>
	    	</tr>
	    <%
	    	}

	    %>
	</table>
	<center>
	 <%
	  int pageCount = cs.GetPageCount();
	 if(pageNow>1){
	    %>
	    <a href="disPlay.jsp?pageNow=<%=(pageNow-1) %>">上一页</a>
	 <% 
	 }
	 for(int i =1;i<=pageCount;i++){
		 
	 %>
	 	<a href="disPlay.jsp?pageNow=<%=i%>"><%=i%></a>
	 <% 
	 }
	 if(pageNow<pageCount){
		    %>
		    <a href="disPlay.jsp?pageNow=<%=(pageNow+1) %>">下一页</a>
	 <% 
		 }
	 %>
	 (当前第<%=pageNow%>页/共<%=pageCount%>页)
	 <a href="disPlay2.jsp">返回</a>
	 </center>
</body>
</html>