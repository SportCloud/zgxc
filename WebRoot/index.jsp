<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<base href="<%=basePath%>">
    <title>职工薪酬管理系统登陆界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/assert/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="<%= request.getContextPath()%>/assert/css/login.css"/>
 
 	    <script type="text/javascript">
        function imgError()
        {
            //IE
            var img = event.srcElement;
            img.src = "<%= request.getContextPath()%>/assert/img/default.gif";
            //控制不要一直跳动
            img.onerror = null;
        }
    </script>
 
  </head>
  
  <body>
  <img class="bg" src="<%= request.getContextPath()%>/assert/img/background.jpeg" alt="背景图片" onerror="imgError()" />
  	<div class="formArea">
  	<form action="/zgxc/servlet/loginServlet.action" method="post">
  		<table align="center">
	  		<tr>
		  		<th>用户姓名：</th>
                <td><input class="userName" type="text" name="username"/></td>
            </tr>
            <tr>
                <th>用户密码：</th>
                <td><input class="userName" type="password" name="password"/></td>
            </tr>
		  	<tr class="buttons">
		  		<td><input type="button" name="exit" value="退出" /></td>
                <td><input type="submit" name="confirm" value="登陆" /></td>
            </tr>
  		</table>
  	</form>
  </div>
  </body>
</html>
