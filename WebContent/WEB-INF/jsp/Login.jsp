<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <LINK href="../../theme/Master.css" rel="stylesheet" type="text/css"> -->
<title>Login.jsp</title>
</head>
<body>
<H1>Twenty One Game</H1>
<P>Welcome to the login page. Please enter your username</P>
<form method="POST" action="/Project_CRM_Leenhouwers/ProcessLogin"> 
<TABLE border="0" cellpadding="0" cellspacing="1" width="100%">
	<TBODY>
		<TR>
			<TD>Username:</TD>
			<TD><INPUT type="text" name="userName" size="40" maxlength="50" value="${idCookie}"></TD>
		</TR>
<!-- 		<TR>
			<TD>Password:</TD>
			<TD><INPUT type="password" name="password" size="20" maxlength="20"></TD>
		</TR> -->
		<TR>
			<TD><INPUT type="submit" name="submit" value="Login"></TD>
			<TD></TD>
		</TR>
	</TBODY>
</TABLE>
</form>
</body>
</html>