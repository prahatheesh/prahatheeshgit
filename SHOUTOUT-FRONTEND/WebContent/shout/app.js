var app=angular.module("register",[]);
app.controller('ctrl',function($scope,$http,$location,$window)
		{
	var url="http://"+$window.location.host+"/SHOUTOUT-BACKEND/";
	
	$scope.register=function()
	{
	$http.post(url+'/register/'+$scope.name).success(function(data)
	{
	
	$log.log(data);
				
	});
	}
	
})
				

	
	
	
	
	
		