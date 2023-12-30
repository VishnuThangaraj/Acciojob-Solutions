// https://course.acciojob.com/idle?question=fc51ad78-3c34-4b42-9dd0-04c8d25ac0be

function sortString(strArray) {
  // return the sorted array

    return strArray.sort();

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
