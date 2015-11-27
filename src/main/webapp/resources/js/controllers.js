(function(angular) {
    var AppController = function($scope, $http, SpringDataRestAdapter) {
        $scope.maxSize = 5;
        $scope.size = 5;
        $scope.status = {
            isopen: false
        };

        $scope.getListMenu = function(){
            if($scope.currentPage==null)
                $scope.currentPage=1;
            var currentPage = $scope.currentPage-1;
            var httpPromise = $http.get('/rest/admMenus?page='+currentPage+'&size='+$scope.size).success(function (response) {
                $scope.response = angular.toJson(response, true);
            });

            SpringDataRestAdapter.process(httpPromise).then(function (processedResponse) {
                $scope.items = processedResponse._embeddedItems;
                $scope.processedResponse = angular.toJson(processedResponse, true);
                $scope.totalItems = processedResponse.page.totalElements;
            });
        }
        $scope.getListMenuAll = function(){
            var httpPromise = $http.get('/rest/admMenus').success(function (response) {
                $scope.response = angular.toJson(response, true);
            });

            SpringDataRestAdapter.process(httpPromise).then(function (processedResponse) {
                $scope.itemsAll = processedResponse._embeddedItems;
                $scope.processedResponse = angular.toJson(processedResponse, true);
            });
        }
        $scope.getListMenu();
        $scope.getListMenuAll();
        $scope.setSize= function (size) {
            $scope.size = size;
            $scope.getListMenu();
        }
        $scope.pageChanged = function() {
            $scope.getListMenu();
        };

        /*Item.query(function(response) {
            $scope.items = response ? response : [];
        });

        $scope.addItem = function(description) {
            new Item({
                description: description,
                checked: false
            }).save(function(item) {
                    $scope.items.push(item);
                });
            $scope.newItem = "";
        };

        $scope.updateItem = function(item) {
            item.save();
        };

        $scope.deleteItem = function(item) {
            item.remove(function() {
                $scope.items.splice($scope.items.indexOf(item), 1);
            });
        };*/
    };

    AppController.$inject = ['$scope', '$http','SpringDataRestAdapter'];
    angular.module("myApp.controllers").controller("AppController", AppController);
}(angular));