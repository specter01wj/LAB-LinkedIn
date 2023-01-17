const newYork = { city: "New York" };
const nola = { city: "New Orleans" };
const chicago = { city: "Chicago" };
const losAngeles = { city: "Los Angeles" };

//Create a WeakMap using the provided variables as keys.
//Set the value to whatever term you think of when you hear
//those cities. The value can be anything. Hint: use set()
let cities = new WeakMap();
cities.set(newYork, "Big Apple");
cities.set(nola, "Mardi Gras");
cities.set(chicago, "Windy City");
cities.set(losAngeles, "Hollywood");

console.log(cities);

//Get the value associated with the key: nola.
console.log(cities.get(nola));

//Get the value associated with the key: dallas.
const dallas = { city: "Dallas" };
console.log(cities.get(dallas));

//Does this WeakMap have the key: newYork?
console.log(cities.has(newYork));

//Delete the following key from your WeakMap: chicago
console.log(cities.get(chicago));







cities.delete(chicago);
console.log(cities);
console.log(cities.get(chicago));
