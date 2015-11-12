/**
 * Created by John on 11/8/2015.
 */
/*var app = angular.module('angularTable', []);

app.controller('listdata', function ($scope, $http) {
    $scope.menus = []; //declare an empty array
    $http.get("/admMenus{}").success(function(response){
        $scope.menus = response;  //ajax request to fetch data into $scope.data
    });
});*/
(function(angular) {
    angular.module("myApp.controllers", []);
    angular.module("myApp.services", []);
    angular.module("myApp", ["ngResource", "spring-data-rest", "myApp.controllers", "myApp.services","ui.bootstrap"]);
}(angular));