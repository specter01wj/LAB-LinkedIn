//Saturday To Do List
//8am: Walk the dogs
//12pm: Lunch
//3pm: Watch a movie

const saturday = new Map();

saturday.set(8, 'walk the dogs');
saturday.set(12, 'lunch');
saturday.set(3, 'watch a movie');
saturday.set('7pm', 'dinner');

//How do we get the value associated with the 12 key?
console.log(saturday.get(12));
//How do we get the value associated with the 9 key?
console.log(saturday.get(9));

console.log(saturday.get('7pm'));
