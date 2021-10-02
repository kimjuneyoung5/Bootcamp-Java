<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Language</title>
<style>
	.container{
		margin-left:100px;
	}
	h3{
		margin-left: 600px;
	}
</style>
</head>
<body>
	<div class="container">
		<h3>
			<a href="/languages/delete/${langObj.id}">Delete</a>
			<a href="/languages">Dashboard</a>
		</h3>
		<form:form action="/languages/edit/${langObj.id}" method="POST" modelAttribute="langObj">
			<input type="hidden" name="_method" value="put">
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