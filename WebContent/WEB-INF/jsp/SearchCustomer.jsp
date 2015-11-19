<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">		
<title>Search Customer</title>
<link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />	
</head>

<body> 
<H1>CRM</H1>
<div id="formsContent">

<form:form id="form" method="post" cssClass="cleanform">
	<div class="header">
		<h2>Please enter customer search criteria</h2>
		<c:if test="${not empty message}">
		<div id="message" class="error">${message}</div>	
		</c:if>
	</div>
<fieldset>
<legend>Search criteria</legend>
	<TABLE>
		<TBODY>
		  	<tr><th>Company</th></tr>
		  	<tr><td><input type="text" name="company" /></td></tr>
		  	<tr><th>Contact person</th></tr>
		  	<tr><th><input type="text" name="contactPerson"/></th></tr>
		  		
			<tr> 
			<td><INPUT type="submit" name="submit" value="Search customer" class="myButton"></td>
			</tr>	
		</TBODY>
	</TABLE>
</fieldset>
</form:form>
</div>
<a href="<c:url value="/Secure/MainMenu" />" class="myButtonLink">Return to main menu</a>

<footer>
  <p>Logged in as: ${sessionScope.user.name}</p>
</footer>
</body>
</html>