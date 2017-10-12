var speak = function(what) {
  console.log(what);
  console.log(this.love);
}

var saySomething = {normal: "meow", love: "purr"}
speak.apply(saySomething, ['meouff']);
