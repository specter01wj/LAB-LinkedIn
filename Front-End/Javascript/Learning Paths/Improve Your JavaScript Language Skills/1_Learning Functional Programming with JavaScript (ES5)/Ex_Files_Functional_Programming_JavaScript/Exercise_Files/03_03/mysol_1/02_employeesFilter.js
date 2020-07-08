// Learning Functional Programming with Javascript
// Chapter 03, Video 03, Exercise 02

/*var employees = [
  { name: "John",  salary: 50000  },
  { name: "Susan", salary: 60000  },
  { name: "Greg",  salary: 100000 },
  { name: "Mary",  salary: 120000 }
]

var dueForARaise = [ ]

for (var i = 0; i < employees.length; i++) {
  var employee = employees[i]
  if (employee.salary < 70000) {
    dueForARaise.push(employee)
  }
}*/

let _ = require("lodash");

let employees = [
  { name: "John",  salary: 50000  },
  { name: "Susan", salary: 60000  },
  { name: "Greg",  salary: 100000 },
  { name: "Mary",  salary: 120000 }
];

var dueForARaise = _.filter(employees, function(emp) {
	return emp.salary < 70000;
});

console.log(dueForARaise);


let dueForARaise2 = employees.filter( x => x.salary < 70000);

console.log(dueForARaise2);






