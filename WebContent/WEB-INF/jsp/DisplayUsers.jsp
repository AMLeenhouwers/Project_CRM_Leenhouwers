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
		<h2>User list</h2>
 <form:form id="form" cssClass="cleanform">
	  <c:forEach items="${users}" var="userVar"> 
	  	<fieldset>
	  		<legend>User Info</legend>
	  		<table>		  
		  		<tr><th>User Name</th> 
		  		<td>${userVar.name}</td></tr>
		  		<tr><th>Password</th> 
		  		<td>******</td></tr>
		  		<tr><th>User can add customers </th>  
		  		<td>${userVar.addPermission}</td></tr>
		  		<tr><th>User can edit customers </th>  
		  		<td>${userVar.editPermission}</td></tr>	  		
		  		<tr><th>User can remove customers </th> 
		  		<td> ${userVar.removePermission}</td></tr>
		  		<tr><th>User has access to user management</th> 
		  		<td> ${userVar.userPermission} </td></tr>
	  		</table>
		<a href="<c:url value="/Secure/UserManagement/${userVar.id}" />" class="myButton">Edit user</a>
	  	<a href="<c:url value="/Secure/UserManagement/RemoveUser/${userVar.id}" />" class="myButton">Remove user</a>	  		  		
	  	</fieldset>
	  	</c:forEach>

	  	</form:form>
	  	</div>
	  	<a href="<c:url value="/Secure/MainMenu" />" class="myButtonLink">Return to main menu</a>
	  	
<footer>
  <p>Logged in as: ${sessionScope.user.name}</p>
</footer>
</body>
</html>