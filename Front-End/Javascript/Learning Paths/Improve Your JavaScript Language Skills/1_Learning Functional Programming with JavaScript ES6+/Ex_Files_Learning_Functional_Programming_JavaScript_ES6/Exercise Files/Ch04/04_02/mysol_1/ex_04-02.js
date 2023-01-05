const add = (x, y, z) => x + y + z;

const addPartial = x =>
    y => 
        z => add(x, y, z);

const sum = addPartial(5)(6)(7);

console.log(sum);


const addPartial_2 = x =>
    (y, z)=> add(x, y, z);

const add5 = addPartial_2(50);
const sum5 = add5(60, 70);

console.log(sum5);