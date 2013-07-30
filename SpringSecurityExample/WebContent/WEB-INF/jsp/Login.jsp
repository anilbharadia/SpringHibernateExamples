<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	This is Login.jsp


	<form action="j_spring_security_check">
		<table>
			<tr>
				<td>Username</td>
				<td><input type="text" name="j_username" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="text" name="j_password" /></td>
			</tr>
			<tr>
				<td><button type="submit">Login</button> </td>
				<td></td>
			</tr>
		</table>
	</form>

</body>
</html>