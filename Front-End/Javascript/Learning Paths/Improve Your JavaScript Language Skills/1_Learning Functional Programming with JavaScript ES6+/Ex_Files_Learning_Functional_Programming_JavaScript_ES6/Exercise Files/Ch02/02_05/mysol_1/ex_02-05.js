const createMultiplier_1 = function() {
  return function() {
    console.log('hello');
  }
};

const createMultiplier = y => x => x * y;

// const double = x => x * 2;
// const triple = x => x * 3;
// const quadruple = x => x * 4;

const double = createMultiplier(2);
const triple = createMultiplier(3);
const quadruple = createMultiplier(4);

console.log(double(3));
