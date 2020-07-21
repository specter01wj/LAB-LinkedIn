
const sayHello = () => console.log('Hello');
console.log(sayHello.name);


const add = (x, y, z) => x + y + z;
console.log(add.length);
console.log(add.toString());
console.log(add.call(this, 1, 2, 3));
console.log(add.apply(this, [1, 2, 3]));


const args = [1, 2, 3];
console.log(add(...args));



