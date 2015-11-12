<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">		
<title>Login</title>
<link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />	
</head>
<body> 
<H1>CRM</H1>
<form:form id="form" method="post" cssClass="cleanform" commandName="user">
	<div class="header">
		<h2>Welcome to the login page. Please enter your username</h2>
		<c:if test="${not empty message}">
		<div id="message" class="error">${message}</div>	
		</c:if>
	</div>
	<TABLE>
	<TBODY>
		<TR>
			<TD>Username:</TD>
			<TD><INPUT type="text" name="name" size="40" maxlength="50" value="${name}"></TD>
		</TR>
		<TR>
			<TD>Password:</TD>
			<TD><INPUT type="password" name="password" size="20" maxlength="20"></TD>
		</TR>
		<TR>
			<TD><INPUT type="submit" name="submit" value="Login"></TD>
			<TD></TD>
		</TR>
	</TBODY>
</TABLE>
</form:form>
</body>
</html>