let instance = null;

class Car {
    constructor(doors, engine, color) {
      if (!instance) {
        this.doors = doors;
        this.engine = engine;
        this.color = color;
        instance = this;
      } else {
        return instance;
      }
    }
}

/* class SUV extends Car {
    constructor(doors, engine, color, wheels) {
        super(doors, engine, color);
        this.wheels = wheels;
    }
} */


const civic = new Car(4, 'V6', 'grey');
const honda = new Car(2, "V8", 'red');

// const cx5 = new SUV(2, "V8", 'red', 8);

console.log(civic);
console.log(honda);

// console.log(cx5);

