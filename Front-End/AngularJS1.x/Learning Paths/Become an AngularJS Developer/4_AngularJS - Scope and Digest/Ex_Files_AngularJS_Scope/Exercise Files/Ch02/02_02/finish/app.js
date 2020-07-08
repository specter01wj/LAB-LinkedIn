angular.module('learndigest', []);

angular.module('learndigest').controller('PlaygroundCtrl', function($scope) {
  var vm = this;

  vm.enableForceEdit = true;
  vm.force = 30;

  vm.resetForce = function() {
    vm.force = 0;
  }

  $scope.$watch(function() { return vm.force % 2 === 0; }, function(newValue, oldValue) {
    console.log(newValue ? 'force is even' : 'force is odd');
  })
});

angular.module('learndigest').controller('InternalCtrl', function($scope) {
  var vm = this;

  vm.playground = $scope.$parent.vm;

  vm.secret = "shhhhhhhh" + vm.playground.force;
});
