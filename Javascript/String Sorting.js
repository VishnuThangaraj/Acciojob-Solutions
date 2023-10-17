//https://course.acciojob.com/idle?question=15d9cd6d-67e8-4f89-a034-316e40b68406

function sortString(strArray) {
  // return the sorted array
	 strArray.sort(); //sort using inbuilt method
	return strArray;

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
  let str=JSON.parse(inputArr[0].trim());
  console.log(sortString(str).join(" ").trim())
}
