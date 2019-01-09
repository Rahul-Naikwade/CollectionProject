<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="update">
<table border="2">
<tr>
<th>EID </th>
<td><input type="hidden" name="eid" value="${data.eid}"> </td> 
</tr>
<tr>
<th>NAME</th>
<td><input type="text" name="name" value="${data.name }"> </td>
</tr>

<tr>
<th>ADDRESS</th>
<td><input type="text" name="address" value="${data.address }"> </td>
</tr>

<tr>
<th> EMAIL</th>
<td><input type="text" name="mail" value="${data.mail}"> </td>
</tr>

<tr>
<th>UNAME</th>
<td><input type="text" name="uname" value="${data.uname }">  </td>
</tr>

<tr>
<th>PASS </th>
<td><input type="text" name="pass" value="${data.pass}"> </td>
</tr> 
<tr>
<th></th>
<td><input type="submit" value="UPDATE"> </td>
</tr>

</table>
</form>
</body>
</html>