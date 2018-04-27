/*function findBiggestFraction(a,b) {
    var result;
    a>b ? result = ["firstFraction", a] : result = ["secondFraction", b];
    return result;
}

var firstFraction = 3/4;
var secondFraction = 5/7;

var fractionResult = findBiggestFraction(firstFraction,secondFraction);

console.log("First fraction result: ", firstFraction);
console.log("Second fraction result: ", secondFraction);
console.log("Fraction " + fractionResult[0] + " with a value of " + fractionResult[1] + " is the biggest!");
*/
var a = 3/4, b = 5/7;

var theB = function() {

	var res;


	a > b ? res = ['a: ', a] : res = ['b: ', b];
	//console.log(res);

	return res;


}

var output1 = theB(a, b);
console.log(output1);