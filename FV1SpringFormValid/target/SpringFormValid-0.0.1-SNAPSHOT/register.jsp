<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


</head>
<body>
	<form:form action="reg" modelAttribute="student">
NAME:   <form:input path="name" />
		<form:errors path="name"></form:errors>
		<br>
ADDRESS:<form:input path="address" />
		<form:errors path="address"></form:errors>
		<br>
EMAIL:  <form:input path="email" />
		<form:errors path="email"></form:errors>
		<br>

<input type="submit" value="REGISTER">
	</form:form>

</body>
</html>