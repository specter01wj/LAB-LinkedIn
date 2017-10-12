var ray = (function() {
  var DEFAULTS = {
    say: 'hello',
    speed: 'normal'
  }

  return {
    speak: function() {
      var myArguments = arguments[0] || '';
      var statement = myArguments.say || DEFAULTS.say;
      console.log(statement);
      return this;
    },
    run : function() {
      var myArguments = arguments[0] || '';
      var running = myArguments.speed || DEFAULTS.speed;
      console.log('running...'+ running);
      return this;
    }
  };
})();