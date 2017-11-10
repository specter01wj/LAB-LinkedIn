// JavaScript Document

// Create a variable
var myScore;
init(1000);
changeScore(100);
changeScore(50);
changeScore(-250);
changeScore(125);

function init(newScore)
{
    console.log("Setting the score to " + newScore);
    myScore = newScore;
    displayScore();
}

function changeScore(scoreDelta)
{
    console.log("Changing the score by " + scoreDelta);
    myScore = myScore + scoreDelta;
    displayScore();
}

function displayScore()
{
    console.log("Player score: " + myScore);
}