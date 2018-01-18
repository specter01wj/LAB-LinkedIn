function findBiggestFraction(a,b) {
	var res;
    a>b ? res = ['First', a] : res = ['Sec', b];
    return res;
}

var firstFraction = 3/4;
var secondFraction = 5/7;

var output1 = findBiggestFraction(firstFraction,secondFraction);
console.log('Fra ' + output1[0] + ' val of ' + output1[1] + ' is the biggest!');

