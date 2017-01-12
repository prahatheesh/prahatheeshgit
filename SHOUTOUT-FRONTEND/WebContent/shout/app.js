var app=angular.module("register",[]);
app.controller('ctrl',function($scope,$http,$location,$window)
		{
	var url="http://"+$window.location.host+"/SHOUTOUT-BACKEND";
	
	$scope.ch=function()
	{
		alert("check");
	$http.post(url+'/ch').success(function(data)
	{
	alert("controller")
	
	$log.log(data);
				
	});
	}
	
})
				

	
	
	
	
	
		