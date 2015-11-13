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
<TABLE>
	<TBODY>
			<tr><td>
			<fieldset>
		  		<legend>Search criteria</legend>
		  		Company
		  		<input type="text" name="company" />
		  		Contact person
		  		<input type="text" name="contactPerson" />
		  	</fieldset>	
			</td></tr>
			<tr> 
			<td><INPUT type="submit" name="submit" value="Search customer"></td>
			<td><a href="<c:url value="/Secure/MainMenu" />">Return to main menu</a></td>
			</tr>
			
	</TBODY>
</TABLE>
</form:form>
</div>

</body>
</html>