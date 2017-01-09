var myApp = angular.module('myApp', []);

myApp.controller('MyCon', function MyCon($scope){
  $scope.author = {
    'name': 'James Wang',
    'title': 'Professor',
    'company': 'Canon USA'
  }

});
