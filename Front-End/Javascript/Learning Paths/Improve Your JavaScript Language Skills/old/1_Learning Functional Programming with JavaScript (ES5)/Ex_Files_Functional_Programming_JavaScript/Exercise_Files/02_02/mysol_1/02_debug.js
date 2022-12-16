// Learning Functional Programming with Javascript
// Chapter 02, Video 02, Exercise 02

/*function debug(message) {
  console.log("DEBUG: " + message)
}

// ...

debug("Some debug message")*/

// ...

// function printDebugMessage(message) {
//   console.log("DEBUG: " + message)
// }
//
// function doNothing() { }

const DEBUG_MODE_ENABLED = true;

let debug;

if (DEBUG_MODE_ENABLED) {
  debug = printDebugMessage
} else {
  debug = doNothing
}

debug("Some debug message");

function printDebugMessage(message) {
  console.log("DEBUG: " + message)
}

function doNothing() { 
	console.log("Did nothing!")
}
