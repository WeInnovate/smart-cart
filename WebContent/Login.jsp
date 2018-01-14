<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="Logservlet" method="post">
		<h1>Login!</h1>

		<table>
		${requestScope.msg}

<%
		String msg=request.getAttribute("msg").toString();
		out.print(msg);
		
		%>
			<tr>
				<td>User name</td>
				<td><input type="text" placeholder="enter username here"
					name="un"/></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><input type="password" placeholder="enter password here"
					name="ps"/></td>
			</tr>
			
			<tr>
			<td><input type="Reset" value="Reset"></td>
			<td><input type= Submit" value="Login"></td>
			
		</table>
	</form>
</body>
</html>