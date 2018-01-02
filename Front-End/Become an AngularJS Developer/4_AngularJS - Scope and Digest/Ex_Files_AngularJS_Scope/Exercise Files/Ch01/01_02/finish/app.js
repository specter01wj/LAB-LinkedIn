angular.module('learndigest', []);

angular.module('learndigest').controller('PlaygroundCtrl', function($scope) {
  $scope.force = 30;

  $scope.resetForce = function() {
    $scope.force = 0;
  }
});
