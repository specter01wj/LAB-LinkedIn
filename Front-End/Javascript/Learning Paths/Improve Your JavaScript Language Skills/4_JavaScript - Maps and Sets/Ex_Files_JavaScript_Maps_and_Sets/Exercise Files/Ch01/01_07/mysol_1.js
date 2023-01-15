//Saturday To Do List
//8am: Walk the dogs
//12pm: Lunch
//3pm: Watch a movie

const saturday = new Map();

saturday.set(8, 'walk the dogs');















saturday.set(12, 'lunch');
saturday.set(3, 'watch a movie');

//What is the first key in your saturday Map object?
console.log(saturday.keys());
console.log(saturday.keys().next());
//What is the second value in your saturday Map object?
console.log(saturday.values());
console.log(saturday.values().next());

let saturdayValue = saturday.values();
saturdayValue.next();
console.log(saturdayValue.next());

