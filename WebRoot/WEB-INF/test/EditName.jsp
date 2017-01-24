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
    
    <title>管理员职工号编辑页面</title>
    
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
		<form action="/zgxc/servlet/updateName.action" method="post">
			<input type="hidden" name="id" value="${name.id }"/>  
		<table border="1" width="250" align="center" cellspacing="0px" cellpadding="5px">
			<tr>
				<td align="center">职工号</td>
				<td><input type="text" name="staff_num" value="${name.staff_num }"/></td>
			</tr>
			<tr>
				<td align="center">姓名:</td>
				<td><input type="text" name="staff_name" value="${name.staff_name }"/></td>
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
