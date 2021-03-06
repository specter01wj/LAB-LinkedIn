angular.module('app').controller('TodoCtrl', function($scope, $timeout) {
  var self = this;
  var wayToGoPromise = undefined;

  self.$onInit = function() {
    $scope.$watch(function() { return self.todo; }, function() {
      var name = self.todo.name;
      self.formattedTodoName = name.charAt(0).toUpperCase()
          + name.substring(1).toLowerCase();
    });

    $scope.$watch(function() { return self.todo.done; }, displayWayToGoMessage);
  };

  function displayWayToGoMessage() {
    if (self.todo.done) {
      self.showWayToGo = true;

      if (wayToGoPromise) {
        $timeout.cancel(wayToGoPromise);
      }

      wayToGoPromise = $timeout(function() {
        self.showWayToGo = false;
      }, 1500);
    }
  }
});

angular.module('app').component('todo', {
  templateUrl: 'app/todo.html',
  bindings: {
    todo: '<',
    deleteTodo: '&'
  },
  controller: 'TodoCtrl'
});
