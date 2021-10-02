<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Main Page</title>
</head>
<body>
	<div class="container">
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Name</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="dojo" items="${dojos}">
					<tr>
						<td><c:out value="${dojo.name}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>