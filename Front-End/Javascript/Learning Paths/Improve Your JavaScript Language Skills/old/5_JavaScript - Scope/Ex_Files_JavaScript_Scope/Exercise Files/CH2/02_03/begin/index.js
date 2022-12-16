// this array is globally scoped 
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
screamWarriors();

