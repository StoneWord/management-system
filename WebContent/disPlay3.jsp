<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>

<%@page import="nuc.ss.service.informationService"%>
<%@page import="nuc.ss.serviceImpl.inforServiceImpl"%>
<%@page import="nuc.ss.entity.Information"%>
<%@page import="nuc.ss.entity.Courier"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>快递员信息管理</title>
<script type="text/javascript">
		function update(id){
			window.location.href = "queryInformationps?id=" + id +"&flag=1";
		}
	</script>
	<style type="text/css">
	body{
		background-image:url("3.jpg");
		background-repeat:no-repeat;
		background-position:center 0px;
		background-size: 100% 200%;
	}
</style>
</head>
<body>
<a href="querysomeCourier"><b>查看快递员信息</b></a>
<%
    
   if(session.getAttribute("courier")==null){
	 response.sendRedirect("login.jsp"); 
    
   }
    Courier courier = (Courier)session.getAttribute("courier");
    System.out.println(courier.toString());
    int pageNow = 1;
	String spageNow = request.getParameter("pageNow");
	if(spageNow != null){
		pageNow = Integer.parseInt(spageNow);
	}
%>
	<table  align="center" border="1" width="750px" cellspacing="0">
			<tr>
				<th width="100px">快递编号</th>
				<th width="100px">发件人姓名</th>
				<th width="120px">发件地址</th>
				<th width="200px">联系电话</th>
				<th width="100px">收件人姓名</th>
				<th width="100px">收件地址</th>
				<th width="100px">联系电话</th>
				<th width="100px">快递员姓名</th>
				<th width="200px">联系电话</th>
				<th width="100px">配送情况</th>
				<th width="100px">公司编号</th>
				<th width="50px">快递员编号</th>
				<th width="200px">操作</th>
		    </tr>
	    <%
	    
	   
	   
	    int uid =courier.getPs_no(); 
	    
	    informationService cs = new inforServiceImpl();
	    List<Information> list = cs.querySome(uid); 
	    
	    /* List<Courier> list =(List)request.getAttribute("list"); */
	    for(Information inf: list){
	    %>
	    	<tr>
	    		<td><%=inf.getKd_no() %></td>
	    		<td><%=inf.getFj_name() %></td>
	    		<td><%=inf.getFj_address() %></td>
	    		<td><%=inf.getFj_phone() %></td>
	    		<td><%=inf.getSj_name() %></td>
	    		<td><%=inf.getSj_address() %></td>
	    		<td><%=inf.getSj_phone() %></td>
	    		<td><%=inf.getPs_name() %></td>
	    		<td><%=inf.getPs_phone() %></td>
	    		<td><%=inf.getPs_condition() %></td>
	    		<td><%=inf.getGs_no() %></td>
	    		<td><%=inf.getPs_no() %></td>
	    		
	    		
	    		<td>
	    			
	    			<a href="javascript:update(<%=inf.getKd_no() %>)">分配</a>
	    		</td>
	    	</tr>
	    <%
	    	}

	    %>
	</table>
	<center>
	<a href="登录.jsp">返回登录界面</a>
</center>
</body>
</html>