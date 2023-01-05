const map = (arr, func) =>
    arr.reduce((acc, x) => [
        ...acc,
        func(x),
    ], []);

// testing if it works:

// Should be [2, 4, 6]
console.log(map([1, 2, 3], x => x * 2));

// Should be [-5, -6, -7, -8, -9, -10]
console.log(map([5, 6, 7, 8, 9, 10], x => -x));

// Should be ['A', 'B', 'C', 'D']
console.log(map(['a', 'b', 'c', 'd'], x => x.toUpperCase()));


const map_1 = (arr, func) => {
  let newArr = [];
  for (let item of arr) {
    let result = func(item);
    newArr.push(result);
  }
  return newArr;
};


console.log(map_1([1, 2, 3], x => x * 2));

console.log(map_1([5, 6, 7, 8, 9, 10], x => -x));

console.log(map_1(['a', 'b', 'c', 'd'], x => x.toUpperCase()));
