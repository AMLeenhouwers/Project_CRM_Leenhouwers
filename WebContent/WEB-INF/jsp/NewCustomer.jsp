<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Customer</title>
</head>
<body>
<form method="POST" action="/Project_CRM_Leenhouwers/ProcessLogin"> 
<TABLE border="0" cellpadding="0" cellspacing="1" width="100%">
	<TBODY>
		<TR>
			<TH width="20%" align="left">Company:</TH>
			<TD><INPUT type="text" name="customerName" size="40" maxlength="50" value="${idCookie}"></TD>
			<TH width = "20%" align="left">Contact Person:</TH>
			<TD><INPUT type="text" name="contactPerson" size="40" maxlength="50" value="${idCookie}"></TD>
			
		</TR>
		<TR>
			<TD>Password:</TD>
			<TD><INPUT type="password" name="password" size="20" maxlength="20"></TD>
		</TR>
		<TR>
			<TD><INPUT type="submit" name="submit" value="Login"></TD>
			<TD></TD>
		</TR>
	</TBODY>
</TABLE>
</form>

</body>
</html>