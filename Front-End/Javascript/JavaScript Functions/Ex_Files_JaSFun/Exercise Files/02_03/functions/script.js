var speak = function(saywhat) {
  console.log(saywhat);
}

var Dog = function() {
  var name, breed;
}

var Cat = function() {
  var name, breed;
}

Dog.prototype.speak = speak;
Cat.prototype.speak = speak;

firstDog = new Dog;
firstDog.name = "Rover";
firstDog.breed = "Doberman";
firstDog.speak('woof');

firstCat = new Cat;
firstCat.name = "Sniggles";
firstCat.breed = "Manx";
firstCat.speak('meow');