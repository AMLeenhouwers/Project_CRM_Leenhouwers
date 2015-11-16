<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />		
<title>Main</title>
</head>
<body>
<H1>CRM</H1>

<H2>Welcome ${user.name}</H2>
	<form:form id="form" method="post" cssClass="cleanform" action="/Project_CRM_Leenhouwers/MainMenu">
	<table>
		<TBODY>
			<TR>
				<c:if test="${user.addPermission}"><th align="center"><a href="<c:url value="/Secure/NewCustomer"/>">Add a new customer</a></th></c:if>
				<th align="center"><a href="<c:url value="/Secure/SearchCustomer"/>">Search in customers</a></th>
				<th align="center"><a href="<c:url value="/Secure/DisplayCustomers"/>">Display all customers</a></th>
				<c:if test="${user.userPermission}"><th align="center"><a href="<c:url value="/Secure/UserManagement"/>">Manage Users</a></th></c:if>
			</TR>
		</TBODY>
	</table>
	</form:form>
<footer>
  <p>Logged in as: ${user.name}</p>
  ${user.userPermission}
</footer>
</body>
</html>