var EventEmitter = require('events').EventEmitter;

var Person = function(name){
    this.name = name;
};
Person.prototype = new EventEmitter();

let Joanne = new Person("Joanne Wilson");

Joanne.on('speak', function(say) {
    console.log("Ooooh helloooo " + say);
});

Joanne.emit('speak', "how's it goin");
