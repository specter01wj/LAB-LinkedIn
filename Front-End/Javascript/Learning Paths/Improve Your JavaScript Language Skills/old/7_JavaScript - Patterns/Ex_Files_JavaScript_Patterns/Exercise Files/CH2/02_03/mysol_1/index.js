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
		this.wheels = wheels || 4;
	}
}

const civic = new Car(4, 'V6', 'grey');
const cx5 = new SUV(2, 'V8', 'red', 12);

console.log(civic);
console.log(cx5);
