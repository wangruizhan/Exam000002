<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>登录界面</title>
</head>
	<style>
		#body{
			url('b.jpg')
		
		}
	
	</style>

<body id="body">
   <div id="ha">
   		8801 王锐展
   </div>
   <div>
   	电影租赁管理系统
   </div>

   <div id="haha" align="center">
   <s:form action="slogin" method="post" >
   		<s:textfield name="username" label="用户名"  size="20"></s:textfield>
   		<s:password name="password" label="密码"  size="20"></s:password>
   		<s:submit name="登录" label="登录" align="center"/> 	
   </s:form>
   </div>
</body>


</html>