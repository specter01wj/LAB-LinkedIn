angular.module('learndigest', []);

angular.module('learndigest').controller('PlaygroundCtrl', function($scope) {
  var vm = this;

  vm.userProperties = {
    favoriteColor: 'white',
    nickname: 'iftach',
    force: 30
  };

  vm.enableForceEdit = true;
  vm.userProperties.force = 30;

  vm.resetForce = function() {
    vm.userProperties.force = 0;
  }

  $scope.$watch('vm.userProperties', function() {
    console.log('user properties changed:', vm.userProperties);
  }, true);
});

angular.module('learndigest').controller('InternalCtrl', function($scope) {
  var vm = this;

  vm.playground = $scope.$parent.vm;

  vm.secret = "shhhhhhhh" + vm.playground.force;
});
