<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="/WEB-INF/views/header.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="resources\bootstrap-3.3.6-dist\css\bootstrap.min.css">
  <script src="resources\bootstrap-3.3.6-dist\js\jquery-3.1.0.min.js"></script>
  <script src="resources\bootstrap-3.3.6-dist\js\bootstrap.min.js"></script>
 
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <link rel="stylesheet" href="<c:url value="/resources/bootstrap-3.3.6-dist/css/bootstrap.min.css"/>">
 
</head>
   <style>
 body{
  margin: 0 auto;
  background-image: url("resources/images/enfield5.jpg");
  background-repeat: no-repeat;
}
</style>
<body>

</head>
<body>

<div class="container">    
    <div id="signin" class="mainbox col-sm-6 col-sm-offset-3">   
    <div class="panel panel-default" >
    <div class="panel-heading">
    <h2>REGISTER</h2>
    <form:form method="POST" commandName="john" action="registered">
    <table class="table table-bordered">
    <tr>
        <td><form:label path="username">Username</form:label></td>
        <td><form:input class="form-control" path="username" required="true" /></td>
    </tr>
    <tr>
        <td><form:label path="emailaddress">Email Address</form:label></td>
        <td><form:input type="email" id="email" name="email" class="form-control" placeholder="e.g. something@example.com" path="emailaddress" required="true" /></td>
    </tr>
     <tr>
        <td><form:label path="password">Password</form:label></td>
        <td><form:input class="form-control" type="password" name="password" path="password" id="txtPassword" required="true"></form:input></td>
    </tr>
     <tr>
        <td><form:label path="confirmpassword">Confirm Password</form:label></td>
        <td><form:input class="form-control" type="password" name = "confirmpassword" path="confirmpassword" id="txtConfirmPassword" onkeyup="checkPass()" required="true"></form:input></td>
    </tr>  
    <tr>
        <td colspan="2">
            <button value="Submit" id="btnSubmit" class="btn btn-lg btn-default btn-block" type="submit">REGISTER</button>
        </td>
    </tr>
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script type="text/javascript">
    $(function () {
        $("#btnSubmit").click(function () {
            var password = $("#txtPassword").val();
            var confirmPassword = $("#txtConfirmPassword").val();
            if (password != confirmPassword) {
                alert("Passwords do not match.");
                return false;
            }
            return true;
        });
    });
</script>
    
    
    </form:form>
</table>
</div> 
</div>
</div>
</div>
    </body>
    </html>
    </body>

</body>
</html>
