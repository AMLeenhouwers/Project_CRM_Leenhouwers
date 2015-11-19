<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">	
<title>Edit Customer</title>
<link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />	
</head>
<body>
<h1>CRM</h1>
	<div id="formsContent">
		<h2>Edit customer details</h2>
 <form:form id="form" method="post" commandName="customer" cssClass="cleanform">
		  <fieldset>
		  <legend>Customer Details</legend>
		  <table>
		  <tr>
		  <td> 
		  	<fieldset>
		  		<legend>General Info</legend>
		  		<form:label path="company">
		  			Company <form:errors path="company" cssClass="error" />
		 		</form:label>
		  		<form:input path="company"/>
	
		  		<form:label path="contactPerson">
		  			Contact person <form:errors path="contactPerson" cssClass="error" />
		 		</form:label>
		  		<form:input path="contactPerson" />
		  		
		  		<form:label path="bday">
		  			Birthday (dd-mm-yyyy) <form:errors path="bday" cssClass="error" />
		 		</form:label>
		  		<form:input path="bday"/>
		  		
		  		<form:label path="website">
		  			Website <form:errors path="website" cssClass="error" />
		 		</form:label>
		  		<form:input path="website" />
		  		</fieldset></td><td>
		  		<fieldset>
		  		<legend>Contact Info</legend>
		  		<form:label path="phoneNumber">
		  			Phone number <form:errors path="phoneNumber" cssClass="error" />
		 		</form:label>
		  		<form:input path="phoneNumber" />
		  		
		  		<form:label path="mobileNumber">
		  			Mobile number <form:errors path="mobileNumber" cssClass="error"/>
		 		</form:label>
		  		<form:input path="mobileNumber" />
		  		
		  		
		  		<form:label path="faxNumber">
		  			Fax number <form:errors path="faxNumber" cssClass="error" />
		 		</form:label>
		  		<form:input path="faxNumber" />
		  		
		  		<form:label path="email">
		  			Email <form:errors path="email" cssClass="error" />
		 		</form:label>
		  		<form:input path="email" />
		  				  		
		  	</fieldset>
		  </td>
		  <td>
		  		<fieldset>
		  		<legend>Company adress</legend>
		  		<form:label path="adress.firstLine">
		  			First adress line <form:errors path="adress.firstLine" cssClass="error" />
		 		</form:label>
		  		<form:input path="adress.firstLine" />
		  		 
		  		<form:label path="adress.secondLine">
		  			Second adress line <form:errors path="adress.secondLine" cssClass="error" />
		 		</form:label>
		  		<form:input path="adress.secondLine" />
		  		
		  		<form:label path="adress.thirdLine">
		  			Third adress line <form:errors path="adress.thirdLine" cssClass="error" />
		 		</form:label>
		  		<form:input path="adress.thirdLine" />
		  		
		  		<form:label path="adress.country">
		  			Country <form:errors path="adress.country" cssClass="error" />
		 		</form:label>
		  		<form:input path="adress.country" />
		  		</fieldset></td><td>
		  		<fieldset>
		  		<legend>Billing adress</legend>
		  		<form:label path="billingAdress.firstLine">
		  			First adress line <form:errors path="billingAdress.firstLine" cssClass="error" />
		 		</form:label>
		  		<form:input path="billingAdress.firstLine" />
		  		 
		  		<form:label path="billingAdress.secondLine">
		  			Second adress line <form:errors path="billingAdress.secondLine" cssClass="error" />
		 		</form:label>
		  		<form:input path="billingAdress.secondLine" />
		  		
		  		<form:label path="billingAdress.thirdLine">
		  			Third adress line <form:errors path="billingAdress.thirdLine" cssClass="error" />
		 		</form:label>
		  		<form:input path="billingAdress.thirdLine" />
		  		
		  		<form:label path="billingAdress.country">
		  			Country <form:errors path="billingAdress.country" cssClass="error" />
		 		</form:label>
		  		<form:input path="billingAdress.country" />
		  		</fieldset>
		  </td>
		  </tr>
		  <tr><td> <input type="submit" name="submit" value="Apply changes" class="myButton"></td></tr>
		  	</table>
		  	<c:if test="${user.removePermission}"><a href="<c:url value="/Secure/RemoveCustomer/${customer.id}" />" class="myButtonLink">Remove customer</a></c:if>
		  	</fieldset>
		  	</form:form>
		  	</div>		  	
		  	<a href="<c:url value="/Secure/MainMenu" />" class="myButtonLink">Return to main menu</a>
</body>
</html>