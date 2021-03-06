const person = {
    name: 'Jimmy Smith',
    age: 40,
    hairColor: 'brown',
    eyeColor: 'blue',
    company: 'IBM',
};

const careerData = {
    name: 'Bob Smith',
    title: 'developer',
    company: 'ABC Software',
};


const personWithCareerData = {
    ...person,
    ...careerData
};

console.log(personWithCareerData);

const updates = {
    name: 'James Smith',
};

const updatedPerson = {
    ...person,
    ...updates,
};

console.log(updatedPerson);

const numbers = [1, 2, 3, 4, 5];

const newNumbers = [0, ...numbers, 6];

console.log(newNumbers);
