<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>职工编辑页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body style="background-color: #eeffcc;">
		<form action="/zgxc/servlet/updateStaffServlet.action" method="post">
		<input type="hidden" name="id" value="${staff.id }"/>  
		<input type="hidden" name="staff_num" value="${staff.staff_num }"/>
		<table border="1" width="250" align="center" cellspacing="0px" cellpadding="5px">
			<tr>
				<td align="center">姓名:</td>
				<td><input type="text" name="name" value="${staff.name }"/></td>
			</tr>
			<tr>
				<td align="center">年龄:</td>
				<td><input type="text" name="gender" value="${staff.gender }"/></td>
			</tr>
			<tr>
				<td align="center">电话号:</td>
				<td><input type="text" name="phonenum"  value="${staff.phonenum }"/></td>
			</tr>
			<tr>
				<td align="center">电子邮件:</td>
				<td><input type="text" name="email"  value="${staff.email }"/></td>
			</tr>
			<tr>
				<td align="center">爱好:</td>
				<td><input type="text" name="hobby"  value="${staff.hobby }"/></td>
			</tr>
			<tr align="center">
    			<td colspan="2">
    				<input type="button" name="退出" value="退出"/>
    				<input type="submit" name="注册" value="保存"/>
    			</td>
    		</tr>

		</table>
		
		</form>
	</body>
</html>
