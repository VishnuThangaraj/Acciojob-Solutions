// https://course.acciojob.com/idle?question=fa87f579-ca2e-4210-a4dc-acfd3414f669

function reverse(arr) {
 // return the reverse array
	let start = 0, end = arr.length-1;

	while(start < end){
		// swap elements
		const temp = arr[start];
		arr[start++] = arr[end];
		arr[end--] = temp;
	}

	return arr;
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
  console.log(reverse(str).join(" ").trim());
}
