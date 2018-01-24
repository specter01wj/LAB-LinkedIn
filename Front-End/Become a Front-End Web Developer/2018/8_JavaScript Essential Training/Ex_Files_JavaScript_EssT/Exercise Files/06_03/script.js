const HOURHAND = document.querySelector("#hour");
const MINUTEHAND = document.querySelector("#minute");
const SECONDHAND = document.querySelector("#second");

let hrPos = 20, minPos = 130, secPos = 267;

HOURHAND.style.transform = 'rotate(' + hrPos + 'deg)';
MINUTEHAND.style.transform = 'rotate(' + minPos + 'deg)';
SECONDHAND.style.transform = 'rotate(' + secPos + 'deg)';
