const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const evenNum = numbers.filter( (x) => {
    return x % 2 === 0;
});

console.log(evenNum);

const words = [
    'hello',
    'goodbye',
    'the',
    'Antarctica',
];

const createLengthTest = (minLen) => {
    return (word) => {
        return word.length > minLen;
    }
};

const longWords = words.filter(createLengthTest(5));

console.log(longWords);

