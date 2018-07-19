'use strict'

angular.module('demo.services', []).factory('UserService',
		[ "$http", function($http) {
			var service = {};
			// service.getUserById = function(userId) {
			// 	var url = CONSTANTS.getUserByIdUrl + userId;
			// 	return $http.get(url);
			// }
			// service.getAllUsers = function() {
			// 	return $http.get(CONSTANTS.getAllUsers);
			// }
			// service.saveUser = function(userDto) {
			// 	return $http.post(CONSTANTS.saveUser, userDto);
			// }
			service.sendQueryData= function (queryData) {
				return $http.post("/user/queryNewsApi", queryData);
            }
			return service;
		} ]);