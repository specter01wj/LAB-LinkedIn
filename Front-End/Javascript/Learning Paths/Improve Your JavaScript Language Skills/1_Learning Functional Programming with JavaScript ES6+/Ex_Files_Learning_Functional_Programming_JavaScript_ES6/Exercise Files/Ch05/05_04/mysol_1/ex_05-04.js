// import words from 'an-array-of-english-words';

const words = ['iceman', 'anemic', 'cinema', 'aaa', 'bbbb', 'cc', 'abcdefg'];

const countOccurrences = arr => {
  return arr.reduce((acc, item) => ({
    ...acc,
    [item]: acc[item] ? ++acc[item] : 1,
  }), {});
};

const hasSameLetterCount = (word1, word2) => {
  const word1Count = countOccurrences(word1.split(''));
  const word2Count = countOccurrences(word2.split(''));

  return Object.keys(word1Count).length === Object.keys(word2Count).length
      && Object.keys(word1Count).every(letter => word1Count[letter] === word2Count[letter]);
}

const findAnagrams = (word, allWords) => {
    const letters = word.split('');

    return allWords
        .filter(entry => hasSameLetterCount(word, entry))
        .filter(anagram => anagram !== word);
}

console.log(findAnagrams('cinema', words));

/*
    Expected output: ['iceman', 'anemic']
*/