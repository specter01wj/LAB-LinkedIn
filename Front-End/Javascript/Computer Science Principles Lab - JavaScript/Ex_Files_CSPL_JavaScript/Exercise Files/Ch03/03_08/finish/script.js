// JavaScript Document

// Creating an array
var myArray = ["Doug", "Mike", "Janet", "Matt"];

// Looping through an array with a for loop
for (var i = 0; i < myArray.length; i++)
{
    console.log("Hello, " + myArray[i]);
}

// Looping through an array with a for each loop
for (var element of myArray)
{
    console.log("Good bye, " + element);
}