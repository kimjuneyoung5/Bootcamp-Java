<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
<style>
	.container{
		display:flex;
		justify-content:space-between;
	}
</style>
</head>
<body>
	<div class="container">
		<h1>Hello <c:out value="${user_name}"/></h1>
		<a href="/your_server">Go Back</a>
	</div>
	<p>Welcome to SpringBoot!</p>
</body>
</html>