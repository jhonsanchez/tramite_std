(function(angular) {
    var AppController = function($scope, $http, SpringDataRestAdapter) {
        var httpPromise = $http.get('/admMenus').success(function (response) {
            $scope.response = angular.toJson(response, true);
        });

        SpringDataRestAdapter.process(httpPromise).then(function (processedResponse) {
            $scope.items = processedResponse._embeddedItems;
            $scope.processedResponse = angular.toJson(processedResponse, true);
        });


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