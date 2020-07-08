// global variable
var numberOfPlatoon = 45;

const platoon = () => {
    // local variable
    let warriorsPerPlatoon = 60;

    // local as well
    let totalWarriors = numberOfPlatoon * warriorsPerPlatoon;

    return `Our army is ${totalWarriors} strong!`;
}

console.log(platoon());

// warriorsPerPlatoon & totalWarriors aren't available globally
// console.log(warriorsPerPlatoon, totalWarriors);
console.log(numberOfPlatoon);


