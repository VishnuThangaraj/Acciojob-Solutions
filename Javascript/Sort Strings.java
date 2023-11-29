// https://course.acciojob.com/idle?question=36e1dce4-e0d3-4eba-91fe-8104142d8225

function sortStrings(arr) {
// your code here
// do not console.log here
// return the sorted array
    arr.sort();
    return arr;
}

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;

readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;
  
  if (lineNumber == 1) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
 

    let Arr = inputArr[1].split(" ").map((x) => (x));

    console.log(sortStrings(Arr).join(" "));
  }
