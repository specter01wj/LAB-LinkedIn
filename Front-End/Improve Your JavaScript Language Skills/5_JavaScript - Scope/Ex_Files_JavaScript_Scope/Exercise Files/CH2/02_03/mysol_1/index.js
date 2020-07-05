// this array is globally scoped 
const warriors = [
    {
        name: 'James',
        type: 'Ninja',
        weapon: 'Shuriken',
        agility: 91
    },
    {
        name: 'Kim',
        type: 'Viking',
        weapon: 'Swing blade',
        agility: 72
    },
    {
        name: 'May',
        type: 'Samurai',
        weapon: 'Boken',
        agility: 65
    }
]

// this functions is globally scoped
const screamWarriors = () => {
    return console.log(warriors);
    
}

// no issues running this function!
screamWarriors();

