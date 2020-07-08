angular.module('learndigest', []);

angular.module('learndigest').controller('PlaygroundCtrl', function($scope) {
  var vm = this;

  vm.force = 30;
  vm.forceInUSD = vm.force * 10;
  vm.enableForceEdit = true;

  vm.resetForce = function() {
    vm.force = 0;
  };

  var times = 0;
  $scope.$watch(function() {
    console.log('watcher was called', times);
    times++;
    return 0;
  }, function() {});

  $scope.$watch('vm.force', function() {
    vm.forceInUSD = vm.force * 10;
  });

  $scope.$watch('vm.force', function() {
    vm.force = vm.force + 2;
  });
});
