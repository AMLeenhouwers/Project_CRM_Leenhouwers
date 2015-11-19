<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
		  
		  		<c:forEach items="${customer.notes}" var="note">	 
		  		<fieldset>
		  		
		  		<legend>Note details</legend> 	
		  		<table>	
		  		<tr><th>Date:</th><th>Added by user:</th></tr>
		  		<tr><td><input type="text" readonly value="<fmt:formatDate value="${note.date}" dateStyle="short"/>"></td>
		  		<td><input type="text" readonly value="${note.userName}"></td>
		  		<tr><th>Message:</th></tr>
		  		<tr><td><textarea rows="4" cols="70" readonly> ${note.message}</textarea></td></tr>
		  		<tr>
<%-- 			  	<td><a href="<c:url value="/Secure/EditNote/${customer.id}/${note.id}" />" class="myButton">Edit note</a></td> --%>
			  	<c:if test="${user.removePermission}"><td><a href="<c:url value="/Secure/RemoveNote/${customer.id}/${note.id}" />" class="myButton">Remove note</a></td></c:if>	
			  	</tr>
			  	  </table>
			  	</fieldset>
		  	</c:forEach>
		  </fieldset>
		  </form:form>  	
		  </c:if>
		  </div>
		  	<a href="<c:url value="/Secure/Notes/${customer.id}/AddNote"/>" class="myButtonLink">Add a new note</a>
		  	<a href="<c:url value="/Secure/MainMenu"/>" class="myButtonLink">Return to main menu</a>
		  	
<footer>
  <p>Logged in as: ${sessionScope.user.name}</p>
</footer>
</body>
</html>