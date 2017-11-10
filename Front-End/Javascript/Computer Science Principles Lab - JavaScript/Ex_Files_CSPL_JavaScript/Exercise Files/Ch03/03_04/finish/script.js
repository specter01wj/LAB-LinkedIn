// JavaScript Document

// Testing OR
if (true || false)
{
    console.log("Only one value needs to be true in an OR statement for the whole evaluation to be true");
}

// Testing AND
if (true && false)
{
    //
} else {
    console.log("Both values need to be true for an AND statement to be true");
}

// Test if a number is between two numbers
var myMaxLimit = 20;
var myMinLimit = 5;

var myValue = 10;

if (myValue < myMaxLimit && myValue > myMinLimit)
{
    console.log("The value " + myValue + " is between " + myMinLimit + " and " + myMaxLimit);
} else {
    console.log("The value " + myValue + " is not between " + myMinLimit + " and " + myMaxLimit);
}

// Test if two numbers are between two sets of numbers
var myMaxXLimit = 5;
var myMinXLimit = 1;
var myMaxYLimit = 3;
var myMinYLimit = 1;

var myXValue = 6;
var myYValue = 2;

if ( (myXValue < myMaxXLimit && myXValue > myMinXLimit) && (myYValue < myMaxYLimit && myYValue > myMinYLimit))
{
    console.log("Both the X and Y values are within the limits");
} else {
    console.log("One or both of the X and Y values are outside of the limits");
}

// Using NOT
var myBoolean = false;
if (!myBoolean)
{
    console.log("NOT false is true")
}