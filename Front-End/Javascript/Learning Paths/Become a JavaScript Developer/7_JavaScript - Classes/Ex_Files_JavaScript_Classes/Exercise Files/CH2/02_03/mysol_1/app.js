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
    #_brand;

    constructor(doors, engine, color, carStats) {
        super(doors, engine, color, carStats);
        this.#_brand = 'No brand yet';
        this.wheels = 4;
        this.ac = true;
    }

    get getBrand() {
        return this.#_brand;
    }

    set setBrand(newBrand) {
        this.#_brand = newBrand;
    }

    myBrand() {
        return console.log(`This SUV is a ${this.#_brand}`); 
    }
}

const cx5 = new SUV(4, 'V6', 'Grey');
// const civic = new Car(3, 'V4', 'Blue');

console.log(cx5.getBrand);
cx5.setBrand = 'mazda';
console.log(cx5.getBrand);
console.log(cx5.myBrand());
// console.log(cx5.#_brand);

// console.log(civic);
// console.log(civic.carStats());
// console.log(Car.totalDoors(cx5, civic));
