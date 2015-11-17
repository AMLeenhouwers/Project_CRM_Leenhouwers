
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">	
<title>New User</title>
<link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />	
</head>
<body> 
<H1>CRM</H1>
<div id="formsContent">
<h2>Please enter user details</h2>
<form:form id="form" method="post" cssClass="cleanform" commandName="editUser">
<TABLE>
	<TBODY>
			<tr><td>
			<fieldset>
		  		<legend>User details</legend>
		  		<form:label path="name">
		  			User name <form:errors path="name" cssClass="error" />
		 		</form:label>
		  		<form:input path="name" />
	
		  		<form:label path="password">
		  			Password <form:errors path="password" cssClass="error" />
		 		</form:label>
		  		<form:input path="password" />
		  	</fieldset>	
	  	
	  		<fieldset class="checkbox">
				<legend>Request Additional Info</legend>
				<table><tr><td>
				<label><form:checkbox path="addPermission" value="true" />User may add customers</label>
				</td></tr>
				<tr><td>
				<label><form:checkbox path="editPermission" value="true" />User may edit customers</label>
				</td></tr>	
				<tr><td>
				<label><form:checkbox path="removePermission" value="true" />User may remove customers</label>
				</td></tr>	
				<tr><td>
				<label><form:checkbox path="userPermission" value="true" />User may manage users</label>
				</td></tr></table>		
			</fieldset>
			</td></tr>
			<tr> 
			<td><INPUT type="submit" name="submit" value="Edit user" class="myButton"></td>
		</TR>
	</TBODY>
</TABLE>
</form:form>
</div>

</body>
</html>