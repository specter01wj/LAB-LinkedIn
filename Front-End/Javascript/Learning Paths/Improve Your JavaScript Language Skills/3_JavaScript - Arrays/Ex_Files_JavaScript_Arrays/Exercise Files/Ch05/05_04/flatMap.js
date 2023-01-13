const wordJumble = ['shampoo', 'conditioner', 'soap'];

//You want to create a word jumble which requires you to split
//the following array of words into individual letters. You want
//a new array, that is flattened to a single level.

//Hint: You will need to use the string method .split()
let splitWords = wordJumble.flatMap(word => word);
console.log(splitWords);

let splitWords_2 = wordJumble.flatMap((word) => {
  return word.split('');
});
console.log(splitWords_2);

