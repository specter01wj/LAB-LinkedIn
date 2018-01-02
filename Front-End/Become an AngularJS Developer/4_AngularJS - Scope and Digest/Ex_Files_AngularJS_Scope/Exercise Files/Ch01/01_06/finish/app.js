angular.module('learndigest', []);

angular.module('learndigest').controller('PlaygroundCtrl', function($scope) {
  var vm = this;

  vm.force = 30;

  vm.resetForce = function() {
    vm.force = 0;
  }
});

angular.module('learndigest').controller('InternalCtrl', function($scope) {
  $scope.secret = "shhhhhhhh" + $scope.playground.force;
});
