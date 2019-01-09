<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript">
	function add() {

		alert("hii add...emp");
		document.myform.action = "reg";
		document.myform.submit();
	}
</script>
</head>
<body>
	<form name="myform">
		${msg}
		<table border="12">
			<tr>
				<th>SELECT</th>
				<th>NAME</th>
				<th>ADDRESS</th>
				<th>MAIL</th>
				<th>UNAME</th>
				<th>PASS</th>
				<th>Delete</th>
				<th>update</th>
			</tr>
			<c:forEach items="${data}" var="e">
				<td><input type="radio" value="${s.eid}" name="eid"></td>
				<td><c:out value="${e.name}"></c:out></td>
				<td><c:out value="${e.address}"></c:out></td>
				<td><c:out value="${e.mail}"></c:out></td>
				<td><c:out value="${e.uname}"></c:out></td>
				<td><c:out value="${e.pass}"></c:out></td>
				<td><a href="delete${e.eid}">Delete</a></td>
				<td><a href="edit${e.eid}">EDIT</a></td>
				</tr>
			</c:forEach>
		</table>
		<table>
			<tr>
				<td><input type="button" value="ADD" onclick="add()"></td>
				<td></td>
			</tr>
		</table>
	</form>
</body>
</html>