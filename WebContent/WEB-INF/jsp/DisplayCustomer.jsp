<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Customer</title>
<link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />	
</head>
<body>
	<div id="formsContent">
		<h2>Add new customer</h2>
		<p>
			Please fill in all known information
		</p>
		
 <form:form id="form" method="post" commandName="customer" cssClass="cleanform">
		  <table>
		  <tr>
		  <td>
		  	<fieldset>
		  		<legend>Customer Info</legend>
		  		<form:label path="company">
		  			company <form:errors path="company" cssClass="error" />
		 		</form:label>
		  		<form:input path="company"/>
	
		  		<form:label path="contactPerson">
		  			contact person <form:errors path="contactPerson" cssClass="error" />
		 		</form:label>
		  		<form:input path="contactPerson" />
		  		
		  		<form:label path="phoneNumber">
		  			contact person <form:errors path="phoneNumber" cssClass="error" />
		 		</form:label>
		  		<form:input path="phoneNumber" />
		  		
		  		<form:label path="faxNumber">
		  			contact person <form:errors path="faxNumber" cssClass="error" />
		 		</form:label>
		  		<form:input path="faxNumber" />
		  		
		  		<form:label path="email">
		  			contact person <form:errors path="contactPerson" cssClass="error" />
		 		</form:label>
		  		<form:input path="contactPerson" />
		  		
		  	</fieldset>
		  </td>
		  <td>
		  	<fieldset>	
		  	<legend>Adress Information</legend>
		  		<fieldset>
		  		<legend>Company adress</legend>
		  		<form:label path="adress.firstLine">
		  			first adress line <form:errors path="adress.firstLine" cssClass="error" />
		 		</form:label>
		  		<form:input path="adress.firstLine" />
		  		 
		  		<form:label path="adress.secondLine">
		  			second adress line <form:errors path="adress.secondLine" cssClass="error" />
		 		</form:label>
		  		<form:input path="adress.secondLine" />
		  		
		  		<form:label path="adress.thirdLine">
		  			first adress line <form:errors path="adress.thirdLine" cssClass="error" />
		 		</form:label>
		  		<form:input path="adress.thirdLine" />
		  		
		  		<form:label path="adress.country">
		  			first adress line <form:errors path="adress.country" cssClass="error" />
		 		</form:label>
		  		<form:input path="adress.country" />
		  		</fieldset>
		  		<fieldset>
		  		<legend>Billing adress</legend>
		  		<form:label path="billingAdress.firstLine">
		  			first adress line <form:errors path="billingAdress.firstLine" cssClass="error" />
		 		</form:label>
		  		<form:input path="billingAdress.firstLine" />
		  		 
		  		<form:label path="billingAdress.secondLine">
		  			second adress line <form:errors path="billingAdress.secondLine" cssClass="error" />
		 		</form:label>
		  		<form:input path="billingAdress.secondLine" />
		  		
		  		<form:label path="billingAdress.thirdLine">
		  			first adress line <form:errors path="billingAdress.thirdLine" cssClass="error" />
		 		</form:label>
		  		<form:input path="billingAdress.thirdLine" />
		  		
		  		<form:label path="billingAdress.country">
		  			first adress line <form:errors path="billingAdress.country" cssClass="error" />
		 		</form:label>
		  		<form:input path="billingAdress.country" />
		  		</fieldset>
		  		
		  		
		  	</fieldset>
		  </td>
		  </tr>
		  <tr>
		  <td><a href="<c:url value="/Secure/MainMenu" />">Return to main menu</a></td>
		  <td><a href="<c:url value="/Secure/RemoveCustomer/${customer.id}" />">Delete customer</a></td>
		  </tr>
		  	</table>
		  	
		  	</form:form>
		  	</div>
</body>
</html>