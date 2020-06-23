const CEILING = 100;

function primeTest(testValue) {
    let isPrime = true;
    for ( let i = 2; i<testValue; i++ ) {
        if ( testValue % i === 0 ) {
            isPrime = false;
        }
    }
    return isPrime;
    /*var divisor = 2;

	  while (testValue > divisor){
	    if(testValue % divisor === 0){
	     return false; 
	    }
	    else
	      divisor++;
	  }
	  return true;*/
}

for (let i = 2; i<=CEILING; i++) {
    let result = primeTest(i);
    /*if(result===true){
    	console.log(i + " is a prime number.");
    }*/
    if(result===false) continue;
    console.log(i + " is a prime number.");
    //result === true ? console.log(i + " is a prime number.") : console.log(i + " is NOT a prime number.");
}
