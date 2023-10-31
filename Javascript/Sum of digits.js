// https://course.acciojob.com/idle?question=16ae2277-0d38-4eba-9a84-d4326ea2da2e

function SumofDigits(n) {
  //complete this function
  // write a recursive method
    if(n==0) return 0;

    return n%10 + SumofDigits(Math.floor(n/10));
}

/*Do not change the code below */

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var inputSize;
var K;
readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;
  if (lineNumber == 0) {
    size = parseInt(inputArr[0]);
  }

  if (lineNumber == size) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  const T = size;
  for (let i = 1; i <= T; i = i = i + 1) {
    let N = parseInt(inputArr[i]);
    console.log(SumofDigits(N));
  }
}
