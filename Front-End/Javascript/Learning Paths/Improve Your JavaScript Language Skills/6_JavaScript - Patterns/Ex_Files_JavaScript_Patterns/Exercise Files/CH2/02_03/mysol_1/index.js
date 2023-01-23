class Car {
    constructor(doors, engine, color) {
        this.doors = doors;
        this.engine = engine;
        this.color = color;
    }
}

class SUV extends Car {
  constructor(doors, engine, color, wheels) {
    super(doors, engine, color);
    this.wheels = wheels;
  }
}

const civic = new Car(4, 'V6', 'grey');
const cx5 = new SUV(4, "V8", 'red', 6);

console.log(civic);
console.log(cx5);
