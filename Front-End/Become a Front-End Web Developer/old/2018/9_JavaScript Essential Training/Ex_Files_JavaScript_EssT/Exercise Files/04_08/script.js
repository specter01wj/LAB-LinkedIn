
const MYC = 6;

console.log(MYC);


function logScope() {

	var localVar = 2;

	if(localVar) {
		let localVar = 'Str';
		console.log('inner var: ', localVar);
	}

	console.log('outter var: ', localVar);

}


logScope();
