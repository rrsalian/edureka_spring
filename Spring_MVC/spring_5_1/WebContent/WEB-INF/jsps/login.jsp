<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/static/css/main.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body><br/><br/><br/><br/><br/><br/><br/><br/>
<center><h1>${message}</h1></center>

<div align="center">

<form:form  action="checkLogin" method="post" commandName="user">
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Username : 
<form:input path="username" name="username" type="text" /><br/>
<form:errors path="username" cssClass="error"></form:errors><br/>
Password :
<form:input path="password" name="password"  type="password"/><br/>
<form:errors path="password" cssClass="error" ></form:errors><br/>

<input type="submit" value="Login"/>
</form:form>

</div>

</body>
</html>