<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />		
<title>Main</title>
</head>
<body>
<H1>CRM</H1>

<H2>Welcome ${user.name}</H2>
	<form:form id="form" method="post" cssClass="cleanform">
	<table>
		<TBODY>
			<TR>
				<TH align="center" width="25%"><INPUT type="submit" name="submit" value="Add new customer"></TH>
				<TH align="center" width="20%"><INPUT type="submit" name="submit" value="Display customer"></TH>
				<TH align="center" width="20%"><INPUT type="submit" name="submit" value="Remove"></TH>
			</TR>
		</TBODY>
	</table>
	</form:form>
<%-- <footer>
  <p>Logged in as: ${user.name}</p>
</footer> --%>
</body>
</html>