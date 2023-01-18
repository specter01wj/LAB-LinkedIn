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

//Loop through our iceCream Set and if the value does NOT equal 'vanilla',
//log it in the console.
for(let item of iceCream) {
  if (item !== 'vanilla') {
    console.log(`Non-vanilla flavor: ${item}`);
  }
}

iceCream.forEach(flavor => {
  if (flavor !== 'coffee') {
    console.log(`${flavor}`);
  }
})
