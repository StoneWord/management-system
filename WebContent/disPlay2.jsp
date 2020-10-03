<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>

<%@page import="nuc.ss.service.informationService"%>
<%@page import="nuc.ss.serviceImpl.inforServiceImpl"%>
<%@page import="nuc.ss.entity.Information"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>快递员信息管理</title>
<script type="text/javascript">
		function del(id){
			var flag = window.confirm("是否真的要删除？");
			if(flag){
				window.location.href = "deleteInformation?id=" + id;
			}
		}
		function update(id){
			window.location.href = "queryInformation?id=" + id +"&flag=1";
		}
		function query(id){
			window.location.href = "queryInformation?id=" + id +"&flag=0";
		}
	</script>
	<style type="text/css">
	body{
		background-image:url("3.jpg");
		background-repeat:no-repeat;
		background-position:center 0px;
		background-size: 100% 180%;
	}
</style>
</head>
<body>
<a href="addInformation.jsp"><b>添加快递信息</b></a>&nbsp;
<a href="disPlay.jsp"><b>查看快递员信息</b></a>
<%
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
	    informationService cs = new inforServiceImpl();
	    List<Information> list = cs.GetByPage(pageNow); 
	    
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
	    			<a href="javascript:del(<%=inf.getKd_no()%>)">删除</a>
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
	    <a href="disPlay2.jsp?pageNow=<%=(pageNow-1) %>">上一页</a>
	 <% 
	 }
	 for(int i =1;i<=pageCount;i++){
		 
	 %>
	 	<a href="disPlay2.jsp?pageNow=<%=i%>"><%=i%></a>
	 <% 
	 }
	 if(pageNow<pageCount){
		    %>
		    <a href="disPlay2.jsp?pageNow=<%=(pageNow+1) %>">下一页</a>
	 <% 
		 }
	 %>
	 (当前第<%=pageNow%>页/共<%=pageCount%>页)
	 </center>
	 <center>
	<a href="登录.jsp">返回登录界面</a>
</center>
</body>
</html>