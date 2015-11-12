<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />		
<title>User Management</title>
</head>
<body>
<H1>CRM</H1>

<H2>User Management</H2>
	<form:form id="form" method="post" cssClass="cleanform" action="/Project_CRM_Leenhouwers/MainMenu">
	<table>
		<TBODY>
			<TR>
				<th align="center"><a href="<c:url value="/Secure/UserManagement/NewUser"/>">Add a new user</a></th>
				<th align="center"><a href="<c:url value="/Secure/UserManagement/SearchUser"/>">Search a user</a></th>
<%-- 				<th align="center"><a href="<c:url value="/DeleteCustomer"/>">Search and delete a customer</a></th> --%>

			</TR>
		</TBODY>
	</table>
	</form:form>
<footer>
  <p>Logged in as: ${user.name}</p>
</footer>
</body>
</html>