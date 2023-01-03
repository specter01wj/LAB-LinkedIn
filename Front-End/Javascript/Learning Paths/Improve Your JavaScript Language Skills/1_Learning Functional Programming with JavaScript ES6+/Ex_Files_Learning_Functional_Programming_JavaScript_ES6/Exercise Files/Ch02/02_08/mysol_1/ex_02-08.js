const divide = (x, y) => x / y;

const secondArgumentIsntZero = func =>
    (...args) => {
        if (args[1] === 0) {
            console.log('Error: dividing by zero');
            return null;
        }

        return func(...args);
    }

const divideSafe = secondArgumentIsntZero(divide);

console.log(divideSafe(7, 0));
console.log(divideSafe(5, 3));


const add4 = (a, b, c, d) => a + b + c + d;

const checkAdd4 = func => (...args) => {
  if (args[3] !== -1) {
    console.log(`Error: last var should be -1, now is ${args[3]}`);
    return null;
  }

  return func(...args);
};

const inst_checkAdd4 = checkAdd4(add4);

console.log(inst_checkAdd4(1,2,3,4));
console.log(inst_checkAdd4(1,2,3,-1));

