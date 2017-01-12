var app=angular.module("register",[]);
app.controller('ctrl',function($scope,$http,$location,$window)
		{
	var url="http://"+$window.location.host+"/SHOUTOUT-BACKEND";
	alert("ctrl")
	$scope.reg=function reg()
	{
		alert("check");
	$http.post(url+'/register/'+$scope.username+'/'+$scope.emailaddress+'/'+$scope.password+'/'+$scope.mobilenumber).success(function(data)
	{
	alert("controller")
	
	$log.log(data);
				
	});
	}
	
})
				

	
	
	
	
	
		