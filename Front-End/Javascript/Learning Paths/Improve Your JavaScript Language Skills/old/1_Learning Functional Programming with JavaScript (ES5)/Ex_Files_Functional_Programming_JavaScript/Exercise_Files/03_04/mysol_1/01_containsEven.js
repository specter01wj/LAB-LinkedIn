// Learning Functional Programming with Javascript
// Chapter 03, Video 04, Exercise 01

/*var numbers = [ 2, 4, 6, 8, 10, 12 ]

var arrayContainsEven = false

for (var i = 0; i < numbers.length; i++) {
  var element = numbers[i]
  if (element % 2 === 0) {
    arrayContainsEven = true
  }
}

var arrayIsAllEven = true

for (var i = 0; i < numbers.length; i++) {
  var element = numbers[i]
  if (!(element % 2 === 0)) {
    arrayIsAllEven = false
  }
}*/

let _ = require("lodash");

let numbers = [ 3, 5, 7, 9, 10, 11, 13 ];

let arrayContainsEven = _.some(numbers, function(elem) {
	return elem % 2 === 0;
});

console.log("Array contains even?: " + arrayContainsEven);

let arrayContainsEven2 = numbers.some( x => x % 2 === 0);

console.log("Array2 contains even?: " + arrayContainsEven2);


let arrayIsAllEven = _.every(numbers, function(element) {
  return element % 2 === 0
})

console.log("Array is all even?: " + arrayIsAllEven);

let arrayIsAllEven2 = numbers.every( x => x % 2 === 0);

console.log("Array2 contains even?: " + arrayIsAllEven2);



