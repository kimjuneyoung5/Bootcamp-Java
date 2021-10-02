<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display One Language</title>
<style>
	.container{
		margin-left:100px;
	}
	h3{
		margin-left:600px;
	}
</style>
</head>
<body>
	<div class="container">
		<h3><a href="/languages">Dashboard</a></h3>
		<p><c:out value="${language.name}" /></p>
		<p><c:out value="${language.creator}" /></p>
		<p><c:out value="${language.version}" /></p>
		<p><a href="/languages/delete/${language.id}">delete</a></p>
		<p><a href="/languages/edit/${language.id}">edit</a></p>
	</div>
</body>
</html>