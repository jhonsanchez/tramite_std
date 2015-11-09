/**
 * Created by John on 11/8/2015.
 */
(function(angular) {
    var HATEOAS_URL = './alps/admMenus';
    var ItemFactory = function($http, SpringDataRestAdapter) {
        function Item(item) {

            if (item._resources) {
                item.resources = item._resources("self", {}, {
                    update: {
                        method: 'PUT'
                    }
                });
                item.save = function(callback) {
                    item.resources.update(item, function() {
                        callback && callback(item);
                    });
                };

                item.remove = function(callback) {
                    item.resources.remove(function() {
                        callback && callback(item);
                    });
                };
            } else {
                item.save = function(callback) {
                    Item.resources.save(item, function(item, headers) {
                        var deferred = $http.get(headers().location);
                        return SpringDataRestAdapter.processWithPromise(deferred).then(function(newItem) {
                            callback && callback(new Item(newItem));
                        });
                    });
                };
            }

            return item;
        }

        Item.query = function(callback) {
            var deferred = $http.get(HATEOAS_URL);
            /*return SpringDataRestAdapter.processWithPromise(deferred).then(function(data) {
                Item.resources = data._resources("self");
                callback && callback(_.map(data._embeddedItems, function(item) {
                    console.log(item);
                    return new Item(item);
                }));
            });*/
            return SpringDataRestAdapter.process(deferred).then(function(processedResponse){
                console.log(processedResponse._embeddedItems);
            });
        };

        Item.resources = null;

        return Item;
    };

    ItemFactory.$inject = ['$http', 'SpringDataRestAdapter'];
    angular.module("myApp.services").factory("Item", ItemFactory);
}(angular));