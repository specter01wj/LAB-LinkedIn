/*// this array is globally scoped 
const warriors = [
    {
        name: 'Jujin Take',
        type: 'Ninja',
        weapon: 'Shuriken',
        agility: 79
    },
    {
        name: 'Viggo Rusen',
        type: 'Viking',
        weapon: 'Swing blade',
        agility: 60
    },
    {
        name: 'Ro Rake',
        type: 'Samurai',
        weapon: 'Boken',
        agility: 82
    }
]

// this functions is globally scoped
const screamWarriors = () => {
    return console.log(warriors);
}

// no issues running this function!
screamWarriors();*/


const screamWarrior = () => {
    let warrior1 = 'Ninja';
    let warrior2 = 'Samurai';

    return `Our warriors are ${warrior1} and ${warrior2}`;
}

const screamWarrior2 = () => {
    let warrior1 = 'Viking';
    let warrior2 = 'DeadPool';

    return `Our warriors are ${warrior1} and ${warrior2}`;
}


console.log(screamWarrior(), screamWarrior2());









