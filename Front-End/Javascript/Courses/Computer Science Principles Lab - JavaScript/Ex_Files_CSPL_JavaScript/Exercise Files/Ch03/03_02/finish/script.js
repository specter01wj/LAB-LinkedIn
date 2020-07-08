// JavaScript Document

// Create a number
var myVariable = 5;
var msg = "myVariable is equal to " + myVariable + " and is a " + typeof myVariable;
console.log(msg);

// Change the variable to a string
myVariable = myVariable.toString();
var msg = "myVariable is equal to " + myVariable + " and is a " + typeof myVariable;
console.log(msg);

// Add one to the "string"
myVariable += 1;
var msg = "myVariable is equal to " + myVariable + " and is a " + typeof myVariable;
console.log(msg);

// Add one to the number
myVariable = Number(myVariable) + 1;
var msg = "myVariable is equal to " + myVariable + " and is a " + typeof myVariable;
console.log(msg);

// Try to convert a number with commas
myVariable = Number("1234.56");
var msg = "myVariable is equal to " + myVariable + " and is a " + typeof myVariable;
console.log(msg);
