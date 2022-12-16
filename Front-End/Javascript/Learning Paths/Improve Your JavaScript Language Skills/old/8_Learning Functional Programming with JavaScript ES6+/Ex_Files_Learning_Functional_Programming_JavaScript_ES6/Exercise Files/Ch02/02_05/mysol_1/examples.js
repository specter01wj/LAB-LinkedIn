
const createPrinter = () => () => console.log('Hello');

const createPrinter2 = function() {
    return function() {
        console.log('Hello');
    }
};

createPrinter()();
createPrinter2()();

const createMultiplier = y => x => x * y;

const double = createMultiplier(2);
const triple = createMultiplier(3);
const quadruple = createMultiplier(4);

console.log(double(3));
console.log(triple(3));
console.log(quadruple(3));
