var app=angular.module("register",[]);
app.controller('ctrl',function($scope,$http,$location,$window)
		{
	var url="http://"+$window.location.host+"/SHOUTOUT-BACKEND";
	alert("ctrl")
	$scope.register=function reg()
	{
	$http.post(url+'/register/'+$scope.username).success(function(data)
	{
	alert("controller")
	
	$log.log(data);
				
	});
	}
	
})
				

	
	
	
	
	
		