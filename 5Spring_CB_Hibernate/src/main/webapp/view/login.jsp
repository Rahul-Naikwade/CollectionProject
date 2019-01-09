<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
${msg}
</head>
<body>
	<form action="log">
		<table>
			<tr>
				<th>UNAME:</th>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<th>PASS:</th>
				<td><input type="password" name="pass"></td>
			</tr>
			<tr>
				<td><input type="submit" value="OK"></td>
			</tr>

			<tr>
				<th></th>
				<td><a href="reg"> OPEN REG PAGE</a></td>
			</tr>
		</table>
	</form>
</body>
</html>