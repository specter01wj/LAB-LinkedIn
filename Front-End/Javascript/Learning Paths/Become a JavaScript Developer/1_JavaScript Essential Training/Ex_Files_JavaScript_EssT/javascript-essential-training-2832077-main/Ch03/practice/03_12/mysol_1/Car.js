/**
 * Creating classes:
 *
 * Class declaration: class Name {}
 * Class expression:  const Name = class {}
 */

class Car {
  constructor(manu, type, color, engineType, enginePower) {
    this.manu = manu;
    this.type = type;
    this.color = color;
    this.engine = {
      type: engineType,
      power: enginePower,
    };
  }

  carUpgrade(engineType, enginePower) {
    this.engine.type = engineType;
    this.engine.power = enginePower;
  }

  startCar() {
    console.log(`Start the Car with ${this.manu} with ${this.engine.engineType} Engine!`);
  }

}

export default Car;
