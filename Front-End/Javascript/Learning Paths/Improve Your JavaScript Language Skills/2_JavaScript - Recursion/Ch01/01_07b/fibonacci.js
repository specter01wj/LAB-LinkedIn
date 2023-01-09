function fibonacci(N) {
    if (N === 0 || N === 1) {
      return N;
    }

    return fibonacci(N - 1) + fibonacci(N - 2);
}

// console.log(fibonacci(5));
console.log(fibonacci(10));
