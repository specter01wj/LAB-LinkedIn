const grades = [99, 83, 65, 87, 91, 77];

//Find the first grade that is less than 80.
console.log(grades.find((elem) => elem < 80));

//Find the index of the first grade that is over 80.
console.log(grades.findIndex((elem) => elem > 80));
