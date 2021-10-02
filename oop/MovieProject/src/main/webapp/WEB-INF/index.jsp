<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>

<html xmlns:th="http://www.thymeleaf.org">

<head>
    <title>COVID-19 Tracker</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <style>
    	
    </style>
</head>

<body>
<div class="container">
<h1>COVID-19 Tracker</h1>
<form id="searchForm">
	<input type="text" id="searchText" placeholder="Search Country..." size="70px">
</form>

<div class="jumbotron">
    <h1 class="display-4"><c:out value="${totalReportedCases}"/></h1>
    <p class="lead">Total cases reported as of today</p>
    <hr class="my-4">
    <p>
        <span>New cases reported since previous day:</span>
        <span><c:out value="${totalNewCases}" /></span>
    </p>

</div>
    <table class="table table-dark">
    	<thead>
        	<tr>
            	<th>State</th>
            	<th>Country</th>
            	<th>Total cases reported</th>
            	<th>Cases reported in the previous day</th>
            	<th>Changes since last day</th>
        	</tr>
        </thead>
        <tbody>
        	<c:forEach var="locationStat"  items="${locationStats}">
        		<tr>
        			<c:if test="${locationStat.provinceState == ''}">
            			<td><c:out value="${locationStat.countryRegion}"/></td>
            		</c:if>
            		<c:if test="${locationStat.provinceState != ''}">
            			<td><c:out value="${locationStat.provinceState}"/></td>
            		</c:if>
            		<td><c:out value="${locationStat.countryRegion}"/></td>
            		<td><c:out value="${locationStat.latestTotalCases}"/></td>
            		<td><c:out value="${locationStat.prevDayCases}"/></td>
            		<td><c:out value="${locationStat.diffFromPrevDay}"/></td>
        		</tr>
        	</c:forEach>
        </tbody>
    </table>
</div>
</body>

</html>