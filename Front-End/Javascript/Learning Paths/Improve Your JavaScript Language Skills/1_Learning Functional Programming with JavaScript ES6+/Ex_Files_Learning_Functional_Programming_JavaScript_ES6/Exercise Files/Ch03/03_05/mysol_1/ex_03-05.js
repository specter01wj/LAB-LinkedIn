const employees = [{
    name: 'Jane Doe',
    salary: 90000,
}, {
    name: 'Donald Jones',
    salary: 65000,
}, {
    name: 'Donna Appleseed',
    salary: 1500000,
}, {
    name: 'John Smith',
    salary: 250000,
}];

const makesMoreThanOneMillion = employee => 
    employee.salary > 1000000;

const makesLessThanOneThousand = employee => 
    employee.salary < 1000;

const result = employees.some(makesMoreThanOneMillion);
const result_1 = employees.every(makesMoreThanOneMillion);
const result_2 = employees.some(makesLessThanOneThousand);

console.log(result);
console.log(result_1);
console.log(result_2);

const formValues = [
    'Shaun',
    'Wassell',
    'Maine',
    'developer',
];

const isNotEmpty = string => !!string;

const allFieldsFilled = formValues.every(isNotEmpty);

console.log(allFieldsFilled);