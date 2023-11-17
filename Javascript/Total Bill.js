// https://course.acciojob.com/idle?question=ab3a9059-8553-4649-abc1-f9d8d42c0cad

function totalPrice(arr) {
 // return the total price as a number
// do not console.log here
    let sum = 0;
    for(let num of arr)
        sum += num;

    return sum;
}
/*Do not change the code below */

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var inputSize;

//multipleline input from User
readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;

  //Exit Condition
  if (lineNumber == 0) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  let str = JSON.parse(inputArr[0].trim());
  console.log(totalPrice(str));
}
