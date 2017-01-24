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
    
    <title>薪资查看</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
	<script type="text/javascript">
		function del(id)
		{
		//jquery中的方法$.get()实现ajax异步数据
			 $.get("<%=basePath%>servlet/deleteSalary.action?id="+id,function(data)
			 {  
	            
	            if("success" == data.result)
	            {  
	                alert("删除成功");  
	                window.location.reload();  
	            }
	            else
	            {  
	                alert("删除失败");  
	            }  
	        });  
        }
	</script>
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
				<table border="1" width="100%" cellspacing="0px" cellpadding="5px" style="margin-top:25px;">
				   <thead>
					<tr align="center">
						
						<th >日期</th>
						<th >基本工资</th>
						<th >津贴</th>
					</tr>
				   </thead>
					<c:forEach items="${name.salary }" var="s" varStatus="status">
						<tr align="center">
							<td>${s.date }</td>
							<td>${s.base_pay }</td>
							<td>${s.allowance }</td>
						</tr>
					</c:forEach>
				</table>
				</td>
			</tr>
		</table>
  </body>
</html>
