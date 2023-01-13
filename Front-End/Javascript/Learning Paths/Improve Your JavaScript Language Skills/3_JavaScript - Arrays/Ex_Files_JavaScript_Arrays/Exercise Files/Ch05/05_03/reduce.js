const bills = [1200, 29.99, 65.93, 17.32, 44.76];

//Determine how much the total bills are using the reduce method
let totalBills = bills.reduce((acc, curr) => {
  return acc + curr;
}, 0);

console.log(totalBills);
