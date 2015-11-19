<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer updated</title>
<link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />		
</head>
<body>
	<h1>CRM</h1>
	<h2>Customer has been updated</h2>
	<p><a href="<c:url value="/Secure/MainMenu"/>" class="myButtonLink">Return to main menu</a></p>

<footer>
  <p>Logged in as: ${sessionScope.user.name}</p>
</footer>
	
</body>
</html>