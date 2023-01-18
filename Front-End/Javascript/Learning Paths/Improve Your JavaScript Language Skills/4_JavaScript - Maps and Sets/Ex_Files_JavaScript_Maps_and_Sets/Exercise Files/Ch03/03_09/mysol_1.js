//Letters Guessed
//You are playing a game of snowman with a friend and keep track of
//letters that have been guessed using Set().
//Follow the tasks below to test your knowledge.

//1. So far, your friend has gussed the following letters: r, s, t, l, n, e.
//Create a Set using the letters guessed thus far.
let guesses = new Set();
guesses.add("r").add("s").add("t").add("l").add("n").add("e");

//2. Your friend takes another guess: p. Before you add it to the set check
//to see if the Set has 'p'. If not, add it to the Set.
console.log(guesses.has('p'));
if (!guesses.has('p')) {
  guesses.add('p');
}

//3. At this point, we will assume your friend hasn't tried to guess the same letter twice.
//The size of the Set will indicate how many guesses he's made. How many guesses
//has your friend made?
console.log(guesses.size);

//4. Delete the letter 'l' from your Set.
guesses.delete('l');
console.log(guesses);

//5. What is the second value in your Set?
let guessesValues = guesses.values();
guessesValues.next();
console.log(guessesValues.next().value);

//6. What is the first entry in your Set?
let guessesEntries = guesses.entries();
console.log(guessesEntries.next().value);

//7. For each entry in your Set, log out whether the guess was a consonant or a vowel.
//This one is a little challenging!
const vowels = ["a", "e", "i", "o", "u"];

for (let item of guesses) {
  let letterType = vowels.includes(item) ? "vowel" : "consonant";
  console.log(`${item} is a ${letterType}`);
}

guesses.forEach((value) => {
  const letterType = vowels.includes(value) ? "vowel" : "consonant";
  console.log(`Foreach: ${value} is a ${letterType}`);
});

//8. Clear your Set!
guesses.clear();
console.log(guesses);
