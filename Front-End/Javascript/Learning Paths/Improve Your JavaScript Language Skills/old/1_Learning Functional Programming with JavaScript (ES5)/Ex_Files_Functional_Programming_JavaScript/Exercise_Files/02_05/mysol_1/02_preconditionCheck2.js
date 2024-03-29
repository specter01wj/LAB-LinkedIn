// Learning Functional Programming with Javascript
// Chapter 02, Video 05, Exercise 02

/*function doIfSafe(n, message, func) {
  if (n != null && typeof n === 'number') {
    if (message != null && typeof message === 'string') {
      return func(n, message)
    }
  }
}

function printMessageNTimes(n, message) {
  for (var i = 0; i < n; i++) { console.log(message) }
}

function getNthLetter(n, string) {
  return string.charAt(n)
}

function getSubstringOfLength(n, string) {
  return string.substring(0, n)
}

doIfSafe(4, "Banana", printMessageNTimes) // prints "Banana Banana Banana Banana"
doIfSafe(2, "Javascript", getNthLetter) // 'v'
doIfSafe(5, "Hello and welcome", getSubstringOfLength) // "Hello"*/


function createSafeVersion(func) {
  return function(n, message) {
    if (n != null && typeof n === 'number') {
      if (message != null && typeof message === 'string') {
        return func(n, message);
      }
    }
  }
}

function printMessageNTimes(n, message) {
  for (var i = 0; i < n; i++) { console.log(message) }
}

function getNthLetter(n, string) {
  return string.charAt(n);
}

function getSubstringOfLength(n, string) {
  return string.substring(0, n);
}


var printMessageNTimesSafe = createSafeVersion(printMessageNTimes);
var getNthLetterSafe = createSafeVersion(getNthLetter);
var getSubstringOfLengthSafe = createSafeVersion(getSubstringOfLength);


printMessageNTimesSafe(4, "Banana"); // prints "Banana Banana Banana Banana"
console.log(getNthLetterSafe(2, "Javascript")); // 'v'
console.log(getSubstringOfLengthSafe(5, "Hello and welcome")); // "Hello"

console.log(getNthLetterSafe("two", "Javascript"));




