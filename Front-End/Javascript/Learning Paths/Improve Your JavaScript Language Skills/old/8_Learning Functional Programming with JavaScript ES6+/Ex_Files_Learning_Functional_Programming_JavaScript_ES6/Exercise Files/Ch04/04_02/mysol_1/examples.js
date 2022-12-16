
const add = (x, y, z) => x + y + z;

const addPartial = x => 
    (y, z) => add(x, y, z);

const addPartial2 = x => {
    return y => {
        return z => {
            return add(x, y, z);
        }
    }
}

const add5 = addPartial(5)(6, 7);
// const sum = add5(6, 7);
console.log(add5);

const add56 = addPartial2(5)(6)(7);
console.log(add56);

