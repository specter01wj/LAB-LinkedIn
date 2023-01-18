console.log("Hi!");

setTimeout(function() {
    console.log("Asynchronous result");
}, 5000);

console.log("Synchronous result.");

setTimeout(() => {
  console.log("Asynchronous result_2")
}, 6000);
