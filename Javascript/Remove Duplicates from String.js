// https://course.acciojob.com/idle?question=262b09fd-d23e-42b9-b697-7a28a7855c83

function removeDuplicates(str) {
// return the string
// do not console.log here
// Your code here
    let result = "";
    const set = new Set();

    for(let letter of str){
        if(!set.has(letter)) result+=letter
        // add to Set
        set.add(letter);
    }
    return result;
}


/*Do not change the code below */

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;
  if (lineNumber == 0) {
    size = parseInt(inputArr[0].trim());
  }
  //Exit Condition
  if (lineNumber == size) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  for (let i = 1; i <= parseInt(inputArr[0]); i++) {
    console.log(removeDuplicates(inputArr[i].trim()));
  }
}
