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
		<h2>Notes</h2>
		<c:if test="${empty customer.notes}">
		No notes have been saved for this customer
		</c:if>
		
		<c:if test="${not empty customer.notes}">
 		<form:form id="form" cssClass="cleanform">   
		  <fieldset>
		  <legend>List of notes</legend>
		  <table>
		  <tr>
		  <th>Date added</th><th>Message</th></tr>
		  		<c:forEach items="${customer.notes}" var="note">
		  		<tr><td>${note.date}</td>
		  		<td>${note.note}</td></tr>
		  		<tr>
			  	<td><a href="<c:url value="/Secure/EditNote/${customer.id}/${note.id}" />">Edit note</a></td>
			  	<td><a href="<c:url value="/Secure/RemoveNote/${customer.id}/${note.id}" />">Remove note</a></td>	
			  	</tr>
		  	</c:forEach>
		  </table>
		  </fieldset>
		  	</form:form>  	
		  </c:if>
		  </div>
		  	<a href="<c:url value="/Secure/Notes/{customerId}/AddNote"/>">Add new note</a>
		  	<a href="<c:url value="/Secure/MainMenu"/>">Return to main menu</a>
</body>
</html>