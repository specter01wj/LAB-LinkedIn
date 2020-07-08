let warrior1 = 'Ninja';
const warrior2 = 'Viking';
console.log(warrior1, warrior2);

// this will return an error
warrior1 = 'Samurai';
console.log(warrior1);


const screamWarrior = () => {
    let warrior4 = 'Canon shooter';
    if (warrior2 === 'Viking') {
        let warrior3 = 'Infantry Soldier';
        console.log(`Our army consists of ${warrior1}, ${warrior2} and ${warrior3}!`)
    }
    console.log(warrior4);
    
}

screamWarrior();

console.log(warrior4);
