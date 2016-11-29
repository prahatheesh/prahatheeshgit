<!DOCTYPE html>
<html lang="en">
<head>
  <%@ include file="/WEB-INF/views/header.jsp" %>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="resources/bootstrap-3.3.6-dist\css\bootstrap.min.css">
  <script src="resources/bootstrap-3.3.6-dist\js\jquery-3.1.0.min.js"></script>
  <script src="resources/bootstrap-3.3.6-dist\js\bootstrap.min.js"></script>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <link rel="stylesheet" href="<c:url value="/resources/bootstrap-3.3.6-dist/css/bootstrap.min.css"/>">

</head>
<body>

<div class="container"> 
    <div id="loginbox" class="mainbox col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">   
    <div class="panel panel-default" >
    <div class="panel-heading">
    <h2 class="form-signin-heading">LOGIN</h2>
   
    <div class="wrapper">
    <form action="Signin" class="form-signin">       
    
     
      <input type="text" class="form-control" name="username" placeholder="Username"  required="" autofocus="" />
      <input type="password"  class="form-control" name="password" placeholder="Password"  required=""/>      
      
      
        <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
      <button class="btn btn-lg btn-default btn-block" type="submit">Login</button>   
    </form>
  
  </div>
</div>
</div>
</div>
  <style>
 body{
  margin: 0 auto;
  background-image: url("resources/images/enfield9.jpg");
  background-repeat: no-repeat;
}
	</body>
</html>