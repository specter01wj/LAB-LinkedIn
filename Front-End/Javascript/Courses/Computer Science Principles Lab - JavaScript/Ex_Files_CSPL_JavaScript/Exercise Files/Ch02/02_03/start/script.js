// JavaScript Document

// Create a variable
var myScore;
init();
changeScore();

function init()
{
    myScore = 1000;
}

function changeScore()
{
    myScore = myScore + 100;
    console.log("Player score: " + myScore);
}
