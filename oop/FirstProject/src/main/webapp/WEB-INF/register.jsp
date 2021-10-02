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
    <title>Registration & Login Page</title>
    <style>
    	body{
    		display: flex;
    		justify-content: space-between;
    		margin-left:150px;
    		margin-right:300px;
    	}
    </style>
</head>
<body>
	<div class="register">
    	<h1>Register!</h1>
    
   		<p><form:errors path="userObj.*"/></p>
    
    	<form:form method="POST" action="/register" modelAttribute="userObj">
    		<p>
            	<form:label path="name">Name:</form:label>
            	<form:input type="text" path="name"/>
        	</p>
        	<p>
            	<form:label path="email">Email:</form:label>
            	<form:input type="email" path="email"/>
        	</p>
        	<p>
            	<form:label path="password">Password:</form:label>
            	<form:password path="password"/>
        	</p>
        	<p>
            	<form:label path="passwordConfirmation">Password Confirmation:</form:label>
            	<form:password path="passwordConfirmation"/>
        	</p>
        	<input type="submit" value="Register!"/>
    	</form:form>
    </div>
    <div class="login">
    	<h1>Login</h1>
    	<p><c:out value="${error}" /></p>
    	<form method="post" action="/login">
        	<p>
            	<label for="email">Email</label>
            	<input type="text" id="email" name="email"/>
        	</p>
        	<p>
            	<label for="password">Password</label>
            	<input type="password" id="password" name="password"/>
        	</p>
        	<input type="submit" value="Login!"/>
    	</form>   
    </div>
</body>
</html>