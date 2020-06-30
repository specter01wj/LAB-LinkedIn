// Learning Functional Programming with Javascript
// Chapter 03, Video 02, Exercise 01

/*var numbers = [ 1, 2, 3, 4, 5 ]
var numbersCubed = [ ]

for(var i = 0; i < numbers.length; i++) {
  var element = numbers[i]
  numbersCubed.push(element * element * element)
}*/

let _ = require('lodash');

let numbers = [ 1, 2, 3, 4, 5 ];

let numbersCubed = _.map(numbers, function(elem) {
	return elem * elem * elem;
});

console.log(numbersCubed);


let numbersCubed2 = numbers.map( (x) => {
	return	x * x * x;
});

console.log(numbersCubed2);



