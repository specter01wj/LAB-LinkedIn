
const createPrinter = () => {
    const myFavNum = 42;

    return () => {
        console.log(`My favorite number is ${myFavNum}`);
    }
}

const printer = createPrinter();
printer();









