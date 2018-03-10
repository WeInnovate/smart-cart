<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action=Address-processor method="post">
		<h1>Help us reach you better!!</h1>
		<table>
			<tr>
				<td>Line 1</td>
				<td><input type="text" name="Line1"
					placeholder="Enter your door number and name of apartment" /></td>
			</tr>
			<tr>
				<td>Line 2</td>
				<td><input type="text" name="Line2"
					placeholder="Enter your street name and area" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" name="city"
					placeholder="Enter your city name" /></td>
			</tr>
			<tr>
				<td>State</td>
				<td><input type="text" name="state"
					placeholder="enter your state" /></td>
			</tr>
			<tr>
				<td>PinCode</td>
				<td><input type="text" name="pin"
					placeholder="enter your pincode" /></td>
			</tr>
			<tr>
				<td>Address type</td>
				<td>Residential Address<input type="radio" name="addressType"
					value="Residential" />&nbsp;office Address <input type="radio"
					name="addressType" value="Office" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>

