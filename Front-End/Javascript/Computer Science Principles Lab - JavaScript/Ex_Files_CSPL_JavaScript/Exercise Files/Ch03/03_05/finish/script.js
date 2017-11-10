// JavaScript Document

// Creating a while loop
var myValue = 0;

// Loop to find numbers that are multiples of nine that are less than 100
while (myValue < 100)
{
    if (myValue % 9 == 0)
    {
        console.log(myValue);
    }

    myValue++;
}

// A do while loop that will run at least one time
var myBadValue = 0;

do
{
    console.log("This will run at least once.");
} while (myBadValue != 0)