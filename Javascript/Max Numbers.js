// https://course.acciojob.com/idle?question=970d8dbc-5856-4753-aed0-cbf16f7c4b03

function maxNumbers(arr, n) {
  // write code here
  // do not console.log the answer
  // return the answer as an array of 3 numbers
    const result = [-9999,-9999,-9999];

    for(let num of arr){
        if(num > result[0]){
            result[2] = result[1];
            result[1] = result[0];
            result[0] = num;
        }else if (num > result[1]){
            result[2] = result[1];
            result[1] = num;
        }else if(num > result[2]){
            result[2] = num;
        }
    }

    return result;
}

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

  if (lineNumber == 2 * size) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  const T = size;
  for (let i = 1; i <= T * 2; i = i = i + 2) {
    let N = parseInt(inputArr[i]);
    let Arr = inputArr[i + 1].split(" ").map((x) => parseInt(x));
    console.log(maxNumbers(Arr, N).join(" ").trim());
  }
}

