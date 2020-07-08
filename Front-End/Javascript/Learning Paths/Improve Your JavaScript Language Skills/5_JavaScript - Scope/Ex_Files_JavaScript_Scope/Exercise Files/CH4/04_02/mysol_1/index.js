/*// global variable
var numberOfPlatoon = 45;

const platoon = () => {
    // local variable
    const warriorsPerPlatoon = 60;
    warriorsPerPlatoon = 70;

    // local as well
    let totalWarriors = numberOfPlatoon * warriorsPerPlatoon;

    return `Our army is ${totalWarriors} strong!`;
}

console.log(platoon());

// warriorsPerPlatoon & totalWarriors aren't available globally
// console.log(warriorsPerPlatoon, totalWarriors);
console.log(numberOfPlatoon);
*/


let warrior1 = 'Ninja';
const warrior2 = 'Viking';

console.log(warrior1, warrior2);


const screamWarrior = () => {
	let warrior4 = 'Cannon';
	if(warrior2 === 'Viking') {
		let warrior3 = 'Infantry';
		console.log(`Our army consists of ${warrior1}, ${warrior2} and ${warrior3}.`);
	}
	// console.log(warrior3);
	console.log(warrior4);
}


screamWarrior();








