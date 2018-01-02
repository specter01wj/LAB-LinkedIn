angular.module('learndigest', []);

angular.module('learndigest').controller('PlaygroundCtrl', function($scope) {
  var vm = this;

  vm.dream = 'sweet dream';
  vm.force = 30;
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


});

angular.module('learndigest').controller('InternalCtrl', function($scope) {
  var vm = this;
  vm.playground = $scope.$parent.vm;
  $('#theButton').on('click', function() {
    vm.playground.dream = 'nightmare';
    $scope.$digest();
  });
});
