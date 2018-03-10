<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration !!!</title>
</head>
<body>
	<jsp:include page="header.jsp" />

	<h1>Provide you details</h1>
	<form action="registration-processor.jsp" method="post">
		<table>
			<tr>
				<td>Username</td>
				<td><input type="email" name="email" /></td>
			</tr>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="firstName" /></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lastName" /></td>
			</tr>

			<tr>
				<td>Gender</td>
				<td>Male: <input type="radio" name="gender" value="Male" />&nbsp;Female:
					<input type="radio" name="gender" value="Female" /></td>
			</tr>
			<tr>
			<td>Mobile</td>
			<td><input type="text" name="number"/></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>

	<jsp:include page="footer.jsp" />
</body>
</html>