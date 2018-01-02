angular.module('learndigest', []);

angular.module('learndigest').controller('PlaygroundCtrl', function($scope) {
  var vm = this;

  vm.force = 30;
  vm.enableForceEdit = true;

  vm.resetForce = function() {
    vm.force = 0;
  };
});

angular.module('learndigest').controller('InternalCtrl', function($scope) {
  var vm = this;
  vm.playground = $scope.$parent.vm;

  var watchesRemain = 3;
  var watchDestroyer = $scope.$watch('vm.playground.force', function() {
    console.log('the force is strong', vm.playground.force);
    watchesRemain--;
    if (watchesRemain === 0) {
      watchDestroyer();
    }
  });

});
