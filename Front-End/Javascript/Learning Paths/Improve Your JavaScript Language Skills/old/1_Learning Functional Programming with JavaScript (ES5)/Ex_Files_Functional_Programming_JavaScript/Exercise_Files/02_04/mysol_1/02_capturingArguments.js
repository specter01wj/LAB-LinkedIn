// Learning Functional Programming with Javascript
// Chapter 02, Video 04, Exercise 02

/*function createCounter() {
  var count = 0

  return {
    increment: function() {
      count = count + 1
    },

    currentValue: function() {
      return count
    }
  }
}*/


function createCounter(count) {

  return {
    increment: function() {
      count = count + 1;
    },

    currentValue: function() {
      return count;
    }
  }
}

let counterStartingAt5 = createCounter(5);

let counterStartingAtMinus2 = createCounter(-2);



