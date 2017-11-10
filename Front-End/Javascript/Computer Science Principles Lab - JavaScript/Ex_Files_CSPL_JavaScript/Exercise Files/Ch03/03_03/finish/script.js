// JavaScript Document

// Create a Boolean variable
var knowJavaScript = true;
console.log("The variable knowJavaScript is equal to " + knowJavaScript + " and is a " + typeof knowJavaScript);

// Test using an if statement with a Boolean variable
if (knowJavaScript)
{
    console.log("I know JavaScript");
}

if (knowJavaScript) console.log("I still know JavaScript");

// Test using an if statement with an evaluation
var myValue = 5;
console.log("myValue is equal to 5");

if (myValue ==  5)
{
    console.log("This condition (myValue == 5) is true.");
}

// Test using an if, else statement with an evaluation
var myValue = 5;
console.log("myValue is equal to 5");

if (myValue < 5)
{
    console.log("This condition (myValue < 5) is true.");
} else {
    console.log("This condition (myValue < 5) is false.");
}

// Test using an if, else if, else statement with an evaluation
var myValue = 5;
console.log("myValue is equal to 5");

if (myValue != 5)
{
    console.log("This condition (myValue != 5) is true.");
} else if (myValue > 5)
{
    console.log("This condition (myValue > 5) is true.");
} else {
    console.log("All conditions are false.");
}

// Test using nested if statements with an evaluation
var myValue = 5;
console.log("myValue is equal to 5");

if (myValue >= 1)
{
    console.log("This condition (myValue >= 1) is true.");

    if (myValue <= 5)
    {
        console.log("This condition (myValue <= 5) is true.");
    }
}