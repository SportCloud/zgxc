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
    
    <title>职工主页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>

	<style type="text/css">
	    a{
	        text-decoration: none;
	    }
	    a:hover{
	        cursor: pointer;
	    }
	    thead th{
	        padding: 10px 5px;
	        background-color: #c3f3c3;
	        font-size: 16px;
	    }
	    .content>td:first-child{
	        background-color: #c3f3c3;
	    }
	    input[type=button]{
	        width: 80px;
		    height: 38px;
		    font-size: 18px;
		    font-weight: bold;
		    color: #ff5862;
	    }
	</style>

  </head>
  
  <body style="background-color: #eeffcc;">
	
	<table align="center" width="80%" style="margin-top:30px;">
		<tr>
			<td>
				<table border="1" width="100%" cellspacing="0px" cellpadding="5px" style="margin-top:25px;">
				   <thead>
					<tr align="center">
						<th >序号</th>
						<th >职工号</th>
						<th >姓名</th>
						<th >年龄</th>
						<th >电话号</th>
						<th >电子邮件</th>
						<th >爱好</th>
						<th >操作</th>
					</tr>
				   </thead>
					<c:forEach items="${staff }" var="s" varStatus="status">
						<tr align="center" class="content">
							<td>${s.id }</td>
							<td>${s.staff_num }</td>
							<td>${s.name }</td>
							<td>${s.gender }</td>
							<td>${s.phonenum }</td>
							<td>${s.email }</td>
							<td>${s.hobby }</td>
							<td>
								<a href="${pageContext.request.contextPath}/servlet/findStaffById.action?id=${s.id }">修改</a>
								<a href="${pageContext.request.contextPath}/servlet/findSalaryByName.action?staff_num=${s.staff_num}">查看薪资</a>
								<a href="${pageContext.request.contextPath}/servlet/findUserByName.action?staff_num=${s.staff_num}" >修改密码</a>
							</td>
						</tr>
					</c:forEach>
				</table>
				</td>
			</tr>
		</table>
  </body>
</html>
