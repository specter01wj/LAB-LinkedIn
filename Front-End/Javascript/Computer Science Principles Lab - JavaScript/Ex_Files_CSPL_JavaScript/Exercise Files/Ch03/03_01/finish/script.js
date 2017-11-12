// JavaScript Document

// Initialize the textOutput div to provide instructions
function init()
{
    document.getElementById("textOutput").innerHTML = "Enter your name and then click the button.";
}

// Click handler for the myButton button element
function clickButton()
{
    var name = document.getElementById("textEntry").value;
    document.getElementById("textOutput").innerHTML = createGreeting(name);
}

// Function to return a greeting message
function createGreeting(newName)
{
    var greeting = "Hello, " + newName + "!";
    return greeting;
}
