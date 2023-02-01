warrior = 'Ninja'; // warrior is defined here
warrior3 = 'Viking';

const screamWarrior = () => {
    let warrior2 = 'Samurai';
    // wrapped in a function now is a closure
    return {
        shootWarrior: () => {
            return console.log(warrior, warrior2);
            
        }
    }
}

const newWarrior = screamWarrior();

newWarrior.shootWarrior();

console.log(warrior, warrior3);

var warrior; // warrior is declared here...

var warrior3; // will show undefined 

