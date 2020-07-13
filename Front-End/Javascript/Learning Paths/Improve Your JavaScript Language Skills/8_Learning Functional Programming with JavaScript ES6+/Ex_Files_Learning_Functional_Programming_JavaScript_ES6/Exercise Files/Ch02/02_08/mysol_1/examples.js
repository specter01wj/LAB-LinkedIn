
const divide = (x, y) => { 
    if(y === 0) {
        console.log('Error: dividing by 0!');
        return null;
    }

    return x / y;
}

console.log(divide(7, 0));
console.log(divide(5, 3));


const divide2 = (x, y) => x / y;

const secondArgumentIsntZero = (func) => {
    return (...args) => {
        if (args[1] === 0) {
            console.log('Error: dividing by zero');
            return null;
        }

        return func(...args);
    }
}

const divideSafe = secondArgumentIsntZero(divide2);

console.log(divideSafe(7, 0));
console.log(divideSafe(5, 3));





