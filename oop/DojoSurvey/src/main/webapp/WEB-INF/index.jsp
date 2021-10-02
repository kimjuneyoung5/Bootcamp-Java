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
        .container{
            width: 700px;
            min-height: 500px;
            margin:0px auto;
            border: 1px solid black;
            font-size: 20px;
        }
        .your_name, .location, .language {
            display: flex;
            justify-content: space-evenly;
            margin: 30px 0;
        }
        .comment {
            margin-left: 100px;
        }
        #comment_box {
            width: 500px;
            height:150px;
        }
        .button {
            margin-left: 550px;
            margin-top: 20px;
        }
</style>
</head>
<body>
	<div class="container">
        <form method="POST" action="/process">
            <div class="your_name">
                <label>Your Name: </label>
                <input type="text" name="firstName">
            </div>
            <div class="location">
                <label>Dojo Location: </label>
                <select name="dojoLocation">
                    <option>San Jose</option>
                    <option>Irvine</option>
                    <option>Chicago</option>
                </select>
            </div>
            <div class="language">
                <label>Favorite Language: </label>
                <select name="favLanguage">
                    <option>Python</option>
                    <option>Javascript</option>
                    <option>C++</option>
                </select>
            </div>
            <div class="comment">
                <label>Comment (optional): </label>
                <input type="text" id="comment_box" name="comment">
            </div>
            <div class="button">
                <input type="submit" value="Button">
            </div>
        </form>
    </div>
</body>
</html>