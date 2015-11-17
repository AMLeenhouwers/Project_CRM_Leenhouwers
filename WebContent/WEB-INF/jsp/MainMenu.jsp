<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="<c:url value="/resources/form.css" />" rel="stylesheet"  type="text/css" />		
<title>Main</title>

	<!-- Deze tag is nodig voor verzenden van data met CSRF-protectie -->
	<sec:csrfMetaTags />

	<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
	
	<script type="text/javascript">
		// configureer JQuery om csrf-token mee te sturen
		var csrfParameter = $("meta[name='_csrf_parameter']").attr("content");
		var csrfHeader = $("meta[name='_csrf_header']").attr("content");
		var csrfToken = $("meta[name='_csrf']").attr("content");
		$(function () {
			var token = $("meta[name='_csrf']").attr("content");
			var header = $("meta[name='_csrf_header']").attr("content");
			$(document).ajaxSend(function(e, xhr, options) {
				xhr.setRequestHeader(header, token);
			});
		});
	
		var root_url = "/Project_CRM_Leenhouwers/api/";
		var birthday_url = root_url + "birthdays/3/";
		
		function addBirthday(customer) {
			var d = new Date(parseInt(customer.birthday));
			var date = d.toDateString(); 
 			var element = $('<li>'+ customer.contactPerson + " of company " + customer.company + ": " + date + '</li>')
			$('ul').append(element);	 
			//var element = "Contact person" + customer.contactPerson + " of company " + customer.company + " has an upcoming birthday: " + date + "\n";
			document.getElementById("birthdays").className = "warning";
			//var content = document.createTextNode(element);
			//theDiv.appendChild(content);
		}
		
		function getBdays(){
		$.get(birthday_url, function(data) {
			if(data.length > 0) {
			//var theDiv = document.getElementById("warning");
			var element = "Please note that the following people have an upcoming birthday:";
			$('ul').append(element);
/* 			var content = document.createTextNode(element);
			theDiv.appendChild(content); */
			
			}
			for(var i=0; i < data.length; i++){
				addBirthday(data[i]);
			}
		})}
		
		
		$(document).ready(function(){getBdays()})
	</script>

</head>

<body>
<H1>CRM</H1>
<H2>Welcome ${user.name}</H2>
	<div id="birthdays"><ul></ul></div>

	<form:form id="form" method="post" cssClass="cleanform" action="/Project_CRM_Leenhouwers/MainMenu">
	<table>
		<TBODY>
			<tr>
				<c:if test="${user.addPermission}"><th align="center"><a href="<c:url value="/Secure/NewCustomer"/>" class="myButtonLink">Add a new customer</a></th></c:if>
				<th align="center"><a href="<c:url value="/Secure/SearchCustomer"/>" class="myButtonLink">Search in customers</a></th>
				<th align="center"><a href="<c:url value="/Secure/DisplayCustomers"/>" class="myButtonLink">Display all customers</a></th>
				<c:if test="${user.userPermission}"><th><a href="<c:url value="/Secure/UserManagement"/>" class="myButtonLink"> Manage Users</a></th></c:if>
			</tr>
		</TBODY>
	</table>
	</form:form>
	
<footer>
  <p>Logged in as: ${user.name}</p>
</footer>
</body>
</html>