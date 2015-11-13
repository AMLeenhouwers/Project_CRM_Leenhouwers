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
		  <table>
		  <c:forEach items="${users}" var="userVar"> 
		  <tr>
		  <td>
		  	<fieldset>
		  		<legend>User Info</legend>
		  		User Name: ${userVar.name} <br>
		  		Password: ****** <br>
		  		User can add customers: ${userVar.addPermission} <br>
		  		User can remove customers: ${userVar.removePermission}<br>
		  		User has access to user management: ${userVar.userPermission} <br>
		  	</fieldset>
			<a href="<c:url value="/Secure/EditUser/${userVar.id}" />">Edit user</a>
		  	<a href="<c:url value="/Secure/RemoveUser/${userVar.id}" />">Remove user</a>
		  </td>
		  </tr>
		  	</c:forEach>
		  	</table>
		  	</form:form>
		  	</div>
		  	<a href="<c:url value="/Secure/MainMenu" />">Return to main menu</a>
</body>
</html>