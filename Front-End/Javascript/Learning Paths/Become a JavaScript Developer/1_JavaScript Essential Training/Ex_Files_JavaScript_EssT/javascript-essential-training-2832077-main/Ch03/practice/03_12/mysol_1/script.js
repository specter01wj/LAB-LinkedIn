/**
 * Practice: Making classes and objects
 *
 * - Find a type of object you have more than one of in your house (eg. clothing, writing tools, etc).
 * - Create a class describing this object type - its properties and methods.
 * - Create several objects using the class.
 * - Test the objecs by calling their properties and using their methods in the console.
 */

import Car from "./Car.js";

const myCar = new Car('Honda', 'Civic', 'red', 'V6', 5000);

console.log(myCar);

const myCar2 = new Car('Honda', 'Civic', 'red', 'V6', 5000);

myCar2.carUpgrade('V8', 12000);

console.log(myCar2);
