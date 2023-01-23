const calc = () => {
    return 4 * 3;
}

let printCalc = (callback) => {
  console.log(callback());
}

printCalc(calc);
