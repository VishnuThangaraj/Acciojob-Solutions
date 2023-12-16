// https://course.acciojob.com/idle?question=350e23a9-83f5-4b85-96c7-b3c3ff21bd5c

function findSmallestMissingPositive(nums) {
    const storage = new Set();

    for(let num of nums) storage.add(num);

    let result = 1;

    while(storage.has(result))
        result++;

    return result;
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
 

    let Arr = inputArr[1].split(" ").map((x) => parseInt(x));

    console.log(findSmallestMissingPositive(Arr));
  }

