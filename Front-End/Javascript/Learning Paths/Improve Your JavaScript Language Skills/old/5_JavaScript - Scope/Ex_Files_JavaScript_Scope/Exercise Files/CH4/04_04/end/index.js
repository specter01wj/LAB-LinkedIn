// global block-scoped variable
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


const screamWarriors = () => {
    // global variable warriors available
    console.log(warriors);
    
    warriors.map((warrior) => {
        if (warrior.agility === 60) {
            // block-scoped agility
            let agility = warrior.agility;
            console.log(`${warrior.name}, who is a ${warrior.type} has an agility of ${agility}`);
        }

        // block-scoped agility isn't available here
        // console.log(warrior.agility);
    })
    
}

screamWarriors();
