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

console.log(iceCream);

//Delete vanilla from the iceCream Set.
iceCream.delete('vanilla');
console.log(iceCream);

//Clear the iceCream Set.
iceCream.clear();
console.log(iceCream);
