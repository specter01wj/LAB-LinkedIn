var ray = (function() {
  var DEFAULTS = {
    say: 'hello'
  }

  return {
    speak: function() {
      var myArguments = arguments[0] || '';
      var statement = myArguments.say || DEFAULTS.say;
      console.log(statement);
    }
  };
})();