const warrior = {
	name: 'Kim',
	type: 'Ninja',
	weapon: 'Shuriken',
	agility: 87
}

const screamWarrior = () => {
    let warrior2 = 'Samurai';
    
    warrior3 = 'Viking';
    return {
        shootWarrior: () => {
            return console.log(warrior, warrior2);
            
        }
    }
}

const newWarrior = screamWarrior();

newWarrior.shootWarrior();

console.log(warrior, warrior3);



