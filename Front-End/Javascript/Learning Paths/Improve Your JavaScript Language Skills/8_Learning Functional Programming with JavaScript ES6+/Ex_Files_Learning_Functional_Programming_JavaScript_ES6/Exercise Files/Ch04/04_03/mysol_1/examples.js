
const countDown = x => {
    if(x < 0) return;
    console.log(x);
    countDown(x - 1);
}

countDown(10);










