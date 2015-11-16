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
		<h2>Please enter the note</h2>
 <form:form id="form" commandName="note" method="post" cssClass="cleanform" action="/Project_CRM_Leenhouwers/Secure/Notes/${customer.id}/AddNote"> 
		  <form:label path="date">Date</form:label>
			<form:input path="date" readonly="true"/>
		  <fieldset>
		  <legend>Note details</legend>
		  <table>
		  <tr>
		  		<form:label path="date">Date</form:label>
				<form:input path="date" readonly="true"/>
				<form:label path="userName">Added by user</form:label>
				<form:input path="userName" readonly="true"/>
		  		<form:label path="message">Message</form:label>
		  		<form:textarea path="message" rows="5" cols="50"/>
		  </tr>
		  </table>
		  </fieldset>
		  <input type="submit" name="submit" value="Add note">
		  	</form:form>
		  	</div>
		  	<a href="<c:url value="/Secure/MainMenu"/>">Main menu</a>
</body>
</html>