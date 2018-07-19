'use strict'

var module = angular.module('demo.controllers', []);
module.controller("UserController", [ "$scope", "UserService","$http",
		function($scope, UserService, $http) {

	        $scope.queryData={
	        	keyword:null,
				country:null,
				categoryType:null
			};
			$scope.qDatas=[];
            $scope.response

			$scope.getNewsData=function () {
			  console.log($scope.queryData);
			  UserService.sendQueryData($scope.queryData).then(function (value) {
				  console.log(value);

                  $scope.allArticle= value.data.articles;
                  $scope.qDatas['keyword']=value.data.queryData[0];
                  $scope.qDatas['country']=value.data.queryData[1];
                  $scope.qDatas['catogoryType']=value.data.queryData[2];
                  $scope.response=true;
                  console.log($scope.qDatas);

              })
            };
		} ]);