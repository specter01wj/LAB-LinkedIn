// let instance = null;

/*class Car {
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
}*/

class Car {
    constructor(doors, engine, color) {
        this.doors = doors;
        this.engine = engine;
        this.color = color;
    }
}

class carFactory {
    createCar(type) {
        switch(type) {
            case 'civic':
                return new Car(4, 'V6', 'grey');
            case 'honda':
                return new Car(2, "V8", 'red'); 
            default:
                return new Car(1, "V2", 'black'); 
        }
    }
}

// class SUV extends Car {
//     constructor(doors, engine, color) {
//         super(doors, engine, color);
//         this.wheels = 4;
//     }
// }


/*const civic = new Car(4, 'V6', 'grey');
const honda = new Car(2, "V8", 'red');*/

const factory = new carFactory();
const myHonda = factory.createCar('civic');

// console.log(civic);
// console.log(honda);
console.log(myHonda);
