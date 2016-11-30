<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/WEB-INF/views/adminheader.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

  <style>
 body{
  margin: 0 auto;
  background-image: url("resources/images/enm.jpg");
  background-repeat: no-repeat;
}
</style>

</head>
<body>
<div class="panel-heading">
	<!--  use JSTL tags -->
	<!--  iterate list of objects -->
	<!--  For each book b in books -->
	<div class="panel panel-default" >
    
	<table border="0" class="table table-striped table-hover">
		<tr>
			<th>PRODUCT ID</th>
			<th>PRODUCT NAME</th>
			<th>PRODUCT MANUFACTURER</th>
			<th>PRODUCT PRICE</th>
			<th>PRODUCT STRENGTH</th>
			<th>CATEGORY</th>
			<th>delete/edit</th>
			</tr>
					<!--  for Each book b in books -->
		
		<c:forEach items="${lobj}" var="b">
		
		  <tr>
		  <th>${b.pid}</th>
		  <th>${b.pname}</th>
		  <th>${b.productmanufacturer}</th>
		  <th>${b.productprice}</th>
		  <th>${b.productstrength}</th>
		  <th>${b.category}</th>
		  
		  
		  <%-- <td><a href="getProductsByid/${b.pid}" >${b.pid}</a></td> --%> 
	    <td><a href="getProductsByid?pid=${b.pid }"></a> 
		<a href="delete?pid=${b.pid }"><span class="glyphicon glyphicon-remove"></span></a>
		<a href="editProduct?pid=${b.pid}"><span class="glyphicon glyphicon-pencil"></span></a>
	
		</td>
		</tr>
	
		</c:forEach>
	</table>
</body>
</html>
