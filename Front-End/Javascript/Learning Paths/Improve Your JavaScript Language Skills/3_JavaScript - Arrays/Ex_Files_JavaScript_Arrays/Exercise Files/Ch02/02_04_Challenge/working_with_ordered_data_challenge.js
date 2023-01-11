//Sort, Reverse, Find, FindIndex
const students = [
  { name: 'John', grade: 75 },
  { name: 'Jane', grade: 93 },
  { name: 'Samantha', grade: 90 },
  { name: 'Michael', grade: 94 },
];

//Challenge Question #1
//Sort the array of students based on their grade,
//in descending order(largest to smallest).
students.sort((a, b) => b.grade - a.grade);
console.log(students);

//Challenge Question #2
//After sorting the array, reverse the order of the array.
console.log(students.reverse());

//Challenge Question #3
//Find a student in the array who has a grade over 90.
console.log(students.find((elem) => elem.grade > 90));
