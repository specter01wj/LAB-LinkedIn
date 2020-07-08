// Learning Functional Programming with Javascript
// Chapter 03, Video 03, Exercise 01

/*var numbers = [ 1, 2, 3, 4, 5 ]
var evensFromNumbers = [ ]

for (var i = 0; i < numbers.length; i++) {
  var element = numbers[i]
  if (element % 2 === 0) {
    evensFromNumbers.push(element)
  }
}*/

let _ = require("lodash");

let numbers = [ 1, 2, 3, 4, 5 ];
let evensFromNumbers = _.filter(numbers, function(elem) {
	return elem % 2 === 0;
});

console.log(evensFromNumbers);


let evensFromNumbers2 = numbers.filter( x => x % 2 === 0);

console.log(evensFromNumbers2);





