<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Dojo Survey</title>
<style>
        .container {
            width:700px;
            min-height: 300px;
            margin: 0px auto;
            border: 1px solid black;
            text-align: center;
        }
        h2 {
            font-weight: bold;
            text-decoration: underline;
        }
</style>
</head>
<body>
	<div class="container">
        <h2>Submitted Info</h2>
        <p>Name: <c:out value="${firstName}"/></p>
        <p>Dojo Location: <c:out value="${dojoLocation}"/></p>
        <p>Favorite Language: <c:out value="${favLanguage}"/></p>
        <p>Comment: <c:out value="${comment}"/></p>
        <a href="/">Back</a>
    </div>
</body>
</html>