/**
 * @param {number} n
 * @return {number}
 */

function fibo(position) {
  let cache = {};

  if (cache[position]) {
    return cache[position];
  }

  let result = position;
  if (position < 2) {
    result = position;
  } else {
    result = fibo(position - 1) + fibo(position - 2);
  }
  cache[position] = result;

  return result;
}

let d2 = new Date();
console.log("fibo : " + fibo(10));
console.log(new Date() - d2);
