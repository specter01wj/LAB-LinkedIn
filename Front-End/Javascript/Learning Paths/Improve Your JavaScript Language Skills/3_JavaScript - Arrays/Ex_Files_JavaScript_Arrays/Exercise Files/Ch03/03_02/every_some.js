const states = [
  'California',
  'New York',
  'New Jersey',
  'Alaska',
  'New Mexico',
  'Montana',
];

//Use this handy string method to find the solution: startsWith("New")

//Do some of the states in the array start with "New"?
console.log(states.some((state) => state.startsWith('New')));

//Does every state in the array start with "New"?
console.log(states.every((state) => state.startsWith('New')));
