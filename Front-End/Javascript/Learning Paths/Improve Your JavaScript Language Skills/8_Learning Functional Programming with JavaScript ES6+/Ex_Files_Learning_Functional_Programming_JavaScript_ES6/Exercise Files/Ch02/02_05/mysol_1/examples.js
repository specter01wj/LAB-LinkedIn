
const createPrinter = () => () => console.log('Hello');

const createPrinter2 = function() {
    return function() {
        console.log('Hello');
    }
};

createPrinter()();
createPrinter2()();



