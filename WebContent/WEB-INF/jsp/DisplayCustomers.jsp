<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">	
<title>Search results</title>
<link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />	
</head>
<body>
<h1>CRM</h1>
	<div id="formsContent">
		<h2>Search results</h2>
 <form:form id="form" cssClass="cleanform">
		  <table>
		  <c:forEach items="${customers}" var="customers3"> 
		  <tr>
		  <c:forEach items="${customers3}" var="customer"> 
		  <td>
		  	<fieldset>
		  		<legend>Customer Info</legend>
		  		Company: ${customer.company} <br>
		  		Contact person: ${customer.contactPerson} <br>
		  		Phone number: ${customer.phoneNumber} <br>
		  		Mobile phone: ${customer.mobileNumber}<br>
		  		Fax number: ${customer.faxNumber} <br>
		  		Email: ${customer.email} <br>
		  		company: ${customer.company} <br>
	
		  	</fieldset>
			<a href="<c:url value="/Secure/DisplayCustomer/${customer.id}" />">Display customer</a>
		  	<a href="<c:url value="/Secure/RemoveCustomer/${customer.id}" />">Remove customer</a>
		  </td>
		  </c:forEach>
		  </tr>
		  	</c:forEach>
		  	</table>
		  	</form:form>
		  	</div>
		  	<a href="<c:url value="/Secure/MainMenu" />">Return to main menu</a>
</body>
</html>