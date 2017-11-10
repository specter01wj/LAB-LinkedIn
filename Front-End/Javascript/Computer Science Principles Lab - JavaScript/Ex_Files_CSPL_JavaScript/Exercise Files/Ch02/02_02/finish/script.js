// JavaScript Document

// Create the game score
var myScore;

// Setup and change the game score
init();
changeScore();

// Function to initialize the game score in the game
function init()
{
    myScore = 1000;
}

// Function to change the score of the game
function changeScore()
{
    myScore = myScore + 100;
    console.log("Player score: " + myScore);
}