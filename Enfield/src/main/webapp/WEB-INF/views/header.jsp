<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ROYALENFIELD</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="resources/bootstrap-3.3.7-dist/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="styles.css">

<div class="container">
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="home">ROYAL ENFIELD</a>
    </div>
         <ul class="nav navbar-nav">
         <li class="active"><a href="home">Home</a></li>
         <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">CATEGORIES<span class="caret"></span></a>
         <ul class="dropdown-menu">
            <li><a href="categories?cat=CLASSIC">CLASSIC</a></li>
            <li><a href="categories?cat=THUNDERBIRD">THUNDERBIRD</a></li>
            <li><a href="categories?cat=CONTINENTAL-GT">CONTINENTAL GT</a></li>
            <li><a href="categories?cat=HIMALAYAN">HIMALAYAN</a></li>
            </ul>
            </li>
            <li><a href="aboutus">ABOUT US</a></li>
           
            <c:if test ="${sessionScope.name eq null}">
            <ul class="nav navbar-nav navbar-right">
            <li><a href="adduser">JOIN US</a></li>
            <li><a href="login">LOGIN</a></li>
            </ul>
            </c:if>
            <c:if test="${sessionScope.name  ne null}">
            <h1> Hai ${sessionScope.name}</h1>
            <li> <a href="logout">LOGOUT</a></li>
            </c:if>
          
        </ul> 
  </div>

</nav>

</body>
</html>