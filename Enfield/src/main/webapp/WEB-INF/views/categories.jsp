<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
   
  <meta charset="utf-8">
  <%@ include file="/WEB-INF/views/header.jsp" %>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="resources/bootstrap-3.3.6-dist/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="styles.css">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
  <style>
 body{
  margin: 0 auto;
  background-image: url("resources/images/ef.jpg");
  background-repeat: no-repeat;
}
</style>

<body>

<div id="category" class="mainbox col-sm-6 col-sm-offset-3">  
<div class="panel panel-default" >
<title>CATEGORIES</title>
<div class="panel-heading">
<table border="0" class="table table-striped table-hover">
<tr>
			
			<th>PRODUCT NAME</th>
			<th>PRODUCT MANUFACTURER</th>
			<th>PRODUCT PRICE</th>
			<th>OPTIONS</th>
</tr>

<c:forEach items="${categ}" var="cat" >
              
<tr>
		  
		  <td>${cat.getPname()}</td>
		  <td>${cat.getProductmanufacturer()}</td>
		  <td>${cat.getProductprice()}</td>
		  
             <%--  <td>${cat.getCategory()}</td> --%>

</c:forEach>
</table>
</div>
</div>

</body>
</html>