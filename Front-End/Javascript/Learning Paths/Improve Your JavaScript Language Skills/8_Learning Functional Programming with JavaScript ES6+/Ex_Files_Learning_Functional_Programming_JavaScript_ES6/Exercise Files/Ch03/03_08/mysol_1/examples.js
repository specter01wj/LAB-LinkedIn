const numbers = [5, 7, 2, 40, 23, 14, 8, 4, 11];

const product = numbers.reduce( (acc, elem) => {
    console.log(`acc is ${acc}`);
    console.log(`x is ${elem}`);
    return acc + elem;
}, 0);

console.log(product);

