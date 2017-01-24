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
    
    <title>职工号新增页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		input{
			outline: none;
		}
	
	</style>
  </head>
  
  <body style="background-color: #eeffcc;">
	<form action="/zgxc/servlet/insertName.action" method="post">
		<table border="1" width="250" align="center" cellspacing="0px" cellpadding="5px">
			<tr>
				<td align="center">职工号:</td>
				<td><input type="text" name="staff_num" placeholder="请输入职工号"/></td>
			</tr>
			<tr>
				<td align="center">姓名:</td>
				<td><input type="text" name="staff_name" placeholder="请输入姓名"/></td>
			</tr>
			<tr align="center" >
    			<td colspan="2">
    				<input type="button" name="退出" value="退出"/>
    				<input type="submit" name="注册" value="保存"/>
    			</td>
    		</tr>

		</table>
		
	</form>
	</body>
</html>
