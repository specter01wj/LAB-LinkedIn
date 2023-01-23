const calc = () => {
    return 4 * 5;
}

let printCalc = (callback) => {
  console.log(callback());
}

printCalc(calc);
