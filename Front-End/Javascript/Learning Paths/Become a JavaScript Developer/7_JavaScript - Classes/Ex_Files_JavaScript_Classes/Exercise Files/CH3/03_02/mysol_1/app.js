let mixin = {
    madeIn() {
        console.log('This car was made this year');
    } 
}

let carMixin = {
    __proto__: mixin,

    madeIn() {
        super.madeIn();
    }
};

class Car {
    constructor(doors, engine, color) {
        this.doors = doors;
        this.engine = engine;
        this.color = color;
    }

    carStats() {
        return `This car has ${this.doors} doors, a ${this.engine} and a beautiful ${this.color} color!`;
    }

    static totalDoors(car1, car2) {
        const doors1 = car1.doors;
        const doors2 = car2.doors;

        return doors1 + doors2;
    }
}

class SUV extends Car {
    constructor(doors, engine, color, carStats) {
        super(doors, engine, color, carStats);
        this._brand = 'No brand yet';
        this.wheels = 4;
        this.ac = true;

        // assign mixin
        Object.assign(this, carMixin);
    }

    get getBrand() {
        return this._brand;
    }

    set setBrand(newBrand) {
        this._brand = newBrand;
    }

    myBrand() {
        return console.log(`This SUV is a ${this.brand}`); 
    }
}

const cx5 = new SUV(4, 'V6', 'Grey');
// const civic = new Car(3, 'V4', 'Blue');

console.log(cx5.getBrand);
cx5.setBrand = 'mazda';
console.log(cx5.madeIn());


// console.log(civic);
// console.log(civic.carStats());
// console.log(Car.totalDoors(cx5, civic));
