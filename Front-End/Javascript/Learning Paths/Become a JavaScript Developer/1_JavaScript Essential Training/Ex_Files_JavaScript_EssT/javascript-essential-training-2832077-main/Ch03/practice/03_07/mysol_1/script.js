/**
 * Practice: Building objects
 *
 * - Create JavaScript objects based on objects in your current environment.
 * - Give each object an identifiable name.
 * - Create properties to describe the objects and set their values.
 * - Find an object that has another object inside of it to create a nested object.
 * - Test your objects in the browser console by accessing the entire object and its specific properties.
 */


const Car = {
  brand: "Honda",
  yearBuild: 2016,
  mileage: 12000,
  engine: {
    type: "v8",
    cyclinder: 4
  },
  startEngine: function (type, cyc) {
    this.engine.type = type;
    this.engine.cyclinder = cyc;
  },
  drive: function (type, cyc, name) {
    this.startEngine(type, cyc);
    console.log(`The driver ${name} starts the car!`);
  }
}


console.log(Car.brand);
console.log(Car.drive('v6', 6, 'James'));

