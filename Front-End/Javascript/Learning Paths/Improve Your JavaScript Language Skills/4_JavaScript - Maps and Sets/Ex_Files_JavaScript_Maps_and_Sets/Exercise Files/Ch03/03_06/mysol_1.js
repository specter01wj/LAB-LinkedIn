//Ice Cream Flavor Suggestions
//chocolate
//vanilla
//coffee
//coffee
//strawberry
//vanilla

const iceCream = new Set();
iceCream.add('chocolate')
.add('vanilla')
.add('coffee')
.add('coffee')
.add('strawberry')
.add('vanilla');

//What is the second value in our iceCream Set?
let iceCreamValues = iceCream.values();
console.log(iceCreamValues);
iceCreamValues.next();

console.log(iceCreamValues.next());

