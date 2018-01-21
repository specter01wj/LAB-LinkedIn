/*function doSomeMath() {
	var a = 5;
	var b = 4;

	function multiply() {
		var result = a * b;
		return result;
	}

	return multiply;
}

var theResult = doSomeMath();

console.log("The result: ", theResult());*/


function giveMeEms(pix) {

	var baseV = 16;

	return function doMath() {
		var res = pix/baseV;
		baseV++;
		return res;
	}

	//return doMath;

}


var smallSize = giveMeEms(12);

console.log('smallSize: ' + smallSize());
console.log('smallSize: ' + smallSize());
console.log('smallSize: ' + smallSize());
console.log('smallSize: ' + smallSize());
console.log('smallSize: ' + smallSize());


