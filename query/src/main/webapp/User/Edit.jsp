<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>User</title>
</head>
<body> 
<h2>
	<s:if test="null == user">
		Add Book
	</s:if>
	<s:else>
		Edit Book
	</s:else>
</h2>
<s:form action="Save" >
	<s:textfield name="user.id" label="ID" />
	<s:textfield name="user.loginname" label="Loginname" />
	<s:password name="user.password" label="Password" showPassword="true" />
	<s:textfield name="user.name" label="Name" />
	<s:submit />
</s:form>
</body>
</html>