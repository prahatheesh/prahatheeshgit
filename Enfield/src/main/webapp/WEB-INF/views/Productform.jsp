<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <%@ include file="/WEB-INF/views/adminheader.jsp" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="resources\bootstrap-3.3.6-dist\css\bootstrap.min.css">
  <script src="resources\bootstrap-3.3.6-dist\js\jquery-3.1.0.min.js"></script>
  <script src="resources\bootstrap-3.3.6-dist\js\bootstrap.min.js"></script>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <link rel="stylesheet" href="<c:url value="/resources/bootstrap-3.3.6-dist/css/bootstrap.min.css"/>">
  
   <style>
 body{
  margin: 0 auto;
  background-image: url("resources/images/classic.jpg");
  background-repeat: no-repeat;
}
</style>
  </head>
<body>


</head>
<body>
<div class="container">    
    <div id="productbox" class="mainbox col-sm-6 col-sm-offset-3">   
    <div class="panel panel-default" >
    <div class="panel-heading">
    <h2>Product Information</h2>
    <form:form method="POST" commandName="productformobj" action="adminADDS">
    <table class="table table-bordered">
     <tr>
        <td><form:label path="pname">Product name</form:label></td>
        <td><form:input class="form-control" path="pname" /></td>
    </tr>
    <tr>
        <td><form:label path="productmanufacturer">Product manufacturer</form:label></td>
        <td><form:input class="form-control" path="productmanufacturer" /></td>
    </tr> 
     <tr>
        <td><form:label path="productstrength">Product strength</form:label></td>
        <td><form:input class="form-control" path="productstrength" /></td>
    </tr> 
     <tr>
        <td><form:label path="productprice">Product price</form:label></td>
        <td><form:input class="form-control" path="productprice" /></td>
    </tr>  
       <tr>
        <td><form:label path="category">Product Category</form:label></td>
        <td><form:input class="form-control" path="category" /></td>
    </tr>  
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
  </div>
</div>
</div>
</div>
 

</body>
</html>

