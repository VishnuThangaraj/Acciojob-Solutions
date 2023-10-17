// https://course.acciojob.com/idle?question=b8d834c5-f968-4536-be97-41244ba6d2ac

// n is the input number
function factorial(n) {
  // write code here
  // do not console.log
  // return the answer as a number
	if(n == 1){
		return 1;
	}
 return n * factorial(n-1);

 }

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var inputSize;

//multipleline input from User
readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;
  // if (lineNumber == 0) {
  //   size = parseInt(inputArr[0]);
  // }
  //Exit Condition
  if (lineNumber == 0) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  const n = parseInt(inputArr[0]);
  console.log(factorial( n));
}
