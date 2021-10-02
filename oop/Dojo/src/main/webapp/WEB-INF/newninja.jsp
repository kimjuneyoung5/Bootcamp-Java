<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ninja</title>
</head>
<body>
	<h1>New Ninja</h1>
	<form:form aciton="/ninjas/new" method="post" modelAttribute="ninjaObj">
		<p>
			Dojo: 
			<form:select path="ninjaman">
				<c:forEach var="dojo" items="${dojos}">
					<form:option value="${dojo.id}">
						<c:out value="${dojo.name}" />
					</form:option>
				</c:forEach>
			</form:select>
		</p>
		<p>
			First Name: 
			<form:input type="text" path="firstName" />
		</p>
		<p>
			Last Name: 
			<form:input type="text" path="lastName" />
		</p>
		<p>
			Age: 
			<form:input type="number" path="age" />
		</p>
		<button type="submit">Create</button>
	</form:form>
</body>
</html>