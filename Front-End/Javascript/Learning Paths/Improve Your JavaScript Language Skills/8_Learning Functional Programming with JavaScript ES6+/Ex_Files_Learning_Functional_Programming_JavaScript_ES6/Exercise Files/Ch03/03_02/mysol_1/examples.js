const person = {
    name: 'Jimmy Smith',
    age: 40,
    hairColor: 'brown',
    eyeColor: 'blue',
    company: 'IBM',
};

const careerData = {
    title: 'developer',
    company: 'ABC Software',
};


const personWithCareerData = {
    ...person,
    ...careerData
};

console.log(personWithCareerData);




