// JavaScript Document

// Create variable outside of a function
var outsideValue = 5;

// Output variables to the console
// console.log("From outside: outsideValue = " + outsideValue);
// console.log("From outside: functionValue = " + functionValue);

myFunction();

function myFunction()
{
    // Create variable insode of a function
    var functionValue = 10;

    // Output variables to the console
    console.log("From inside: outsideValue = " + outsideValue);
    console.log("From inside: functionValue = " + functionValue);

    myOtherFunction();
}

function myOtherFunction()
{
    // Output variables to the console
    console.log("From inside: outsideValue = " + outsideValue);
    console.log("From inside: functionValue = " + functionValue);
}
