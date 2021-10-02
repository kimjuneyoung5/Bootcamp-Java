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
	<title>All Languages</title>
</head>
<body>
	<div class="container">
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Name</th>
					<th>Creator</th>
					<th>Version</th>
					<th>action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="language" items="${languages}">
					<tr>
						<td><a href="languages/${language.id}"><c:out value="${language.name}" /></a></td>
						<td><c:out value="${language.creator}" /></td>
						<td><c:out value="${language.version}" /></td>
						<td>
							<a href="/languages/delete/${language.id}">delete</a>
							<a href="/languages/edit/${language.id}">edit</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<form:form action="/languages/create" method="POST" modelAttribute="langObj">
			<p>
				<form:label path="name">Name: </form:label>
				<form:input path="name" type="text"/>
				<form:errors path="name" />
			</p>
			<p>
				<form:label path="creator">Creator: </form:label> 
				<form:input path="creator" type="text"/>
				<form:errors path="creator" />
			</p>
			<p>
				<form:label path="version">Version: </form:label>
				<form:input path="version" type="text"/>
				<form:errors path="version" />
			</p>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>
	</div>
</body>
</html>