var app=angular.module('register',[]);
app.controller('ctrl',function($scope,$http,$location,$window)
		{
	var url="http://"+$window.location.host+"/SHOUTOUT-BACKEND";
	alert("check");
	$scope.register=function()
	{
    alert("reg")
	$http.post(url+'/register/'+$scope.username+'/'+$scope.emailaddress+'/'+$scope.password+'/'+$scope.mobilenumber).success(function(data)
	{
	alert("controller")
	
	$log.log(data);
				
	});
	}
	
})
		

/*var app = angular.module('register', []);
app.controller('ctrl', function($scope) {
   // $scope.firstName= "John";
   // $scope.lastName= "Doe";
    
    $scope.register=function register()
	{
    alert("reg")
    console.log("insie register");
	$http.post(url+'/register/'+$scope.username+'/'+$scope.emailaddress+'/'+$scope.password+'/'+$scope.mobilenumber).success(function(data)
	{
	alert("controller")
	
	$log.log(data);
				
	});
    
	}
});*/