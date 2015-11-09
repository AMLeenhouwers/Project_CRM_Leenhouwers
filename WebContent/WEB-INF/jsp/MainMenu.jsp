

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main</title>
</head>
<body>
<H1>CRM</H1>

<H2>Welcome ${user.name}</H2>
	<FORM method="post" action="/Project_CRM_Leenhouwers/MainMenu">
	<TABLE width="100%" border="0" cellpadding="0" cellspacing="1">
		<TBODY>
			<TR>
				<TH align="center" width="25%"><INPUT type="submit" name="submit" value="Add new customer"></TH>
				<TH align="center" width="20%"><INPUT type="submit" name="submit" value="Display customer"></TH>
				<TH align="center" width="20%"><INPUT type="submit" name="submit" value="Remove"></TH>
			</TR>
		</TBODY>
	</TABLE>
	</FORM>
</body>
</html>