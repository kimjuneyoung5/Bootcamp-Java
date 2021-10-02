<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Movies</title>
<style>
	html,body{
		margin:0 auto;
	}
	input{
		width:70%;
		height:25px;
		border: 2px solid black;
		font-size:20px;
		margin-left:150px;
	}
	h1{
		text-align: center;
	}
</style>
</head>
<body>
	<div class="top-nav">
		<p><a href="/dashboard">Home</a></p>
	</div>
	<div class="container">
		<h1>Search for Movies</h1>
		<div class="center">
			<form id="searchForm">
				<input type="text" id="searchText" placeholder="Search...">
			</form>
		</div>
	</div>
	<div class="container">
		<div id="movies" class="row"></div>
	</div>
</body>
<script
  src="https://code.jquery.com/jquery-3.6.0.min.js"
  integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
  crossorigin="anonymous"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script src="main.js"></script>
</html>