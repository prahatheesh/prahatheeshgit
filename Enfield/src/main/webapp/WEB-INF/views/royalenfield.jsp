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
<style>
 body{
  margin: 0 auto;
  background-image: url("resources/images/royal-enfield-wallpaper.jpg");
  background-repeat: no-repeat;
}
	
.carousel-inner > .item > img,
.carousel-inner > .item > a > img {

       width:800px;
height:400px;
      margin: auto;
}

</style>

<body>


<div class="container">
<audio controls>
  <source src="resources/sounds/01.mp3" type="audio/mp3">
</audio>

<div class="container">
  <br>
 <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src='resources/images/enfield1.jpg'/>
      </div>

   <div class="item ">
        <img src='resources/images/enfield2.jpg'/>
      </div>

   <div class="item ">
        <img src='resources/images/enfield3.jpg'/>
      </div>
      
   <div class="item ">
       <img src='resources/images/enfield4.jpg'/>
     </div>
     
   </div>
    </div>

        <a class="left carousel-control" href="#myCarousel" data-slide="prev" >
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
        </a>
      
        <a class="right carousel-control" href="#myCarousel" data-slide="next" >
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
        </a>
  </div>
</div>


</body>
</html>

