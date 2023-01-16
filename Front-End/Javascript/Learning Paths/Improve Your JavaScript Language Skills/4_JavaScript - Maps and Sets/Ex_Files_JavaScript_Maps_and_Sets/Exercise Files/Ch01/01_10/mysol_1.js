//Maps: Challenge

//Below is a list of Oscar-winning Best Pictures from the last several years.
// 2020 - "Parasite"
// 2019 - "Green Book"
// 2018 - "The Shape of Water"
// 2017 - "Moonlight"
// 2016 - "Spotlight"
// 2015 - "Birdman"
// 2014 - "12 Years a Slave"
// 2013 - "Argo"

//1. Create a new Map with the Best Pictures list from above.
//Make sure your keys are the year, BUT they can be any format.
let movies = new Map();
movies.set(2013, "Argo");
movies.set(2014, "12 Years a Slave");
movies.set(2015, "Birdman");
movies.set(2016, "Spotlight");
movies.set(2017, "Moonlight");
movies.set(2018, "The Shape of Water");
movies.set(2019, "Green Book");
movies.set(2020, "Parasite");

console.log(movies);

//2. What film won best picture in 2015?
console.log(movies.get(2015));

//3. Does this list contain Best Picture from 2010? 2018?
console.log(movies.has(2010));
console.log(movies.has(2018));

//4. How many films are included in this list?
console.log(movies.size);

//5. What is the second key in this movies Map?
let movieKeys = movies.keys();
console.log(movieKeys);
movieKeys.next();
console.log(movieKeys.next());

//6. What is the third value in this movies Map?
let movieValues = movies.values();
movieValues.next();
movieValues.next();
console.log(movieValues.next());

//7. What is the first set of entries in this movies Map?

//8. Loop over the map, and if the movie won Best Picture before 2017,
//log it in the console. Include the year and the movie.

//9. Delete the Best Picture from 2013 from your movies Map.

//10. Clear your movies Map.
