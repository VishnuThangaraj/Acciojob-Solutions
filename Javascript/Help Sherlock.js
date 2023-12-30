// https://course.acciojob.com/idle?question=3d112dd6-a48b-4a06-b2b5-cb36dbf4d7ec

function Help(N, M) {
  //complete this function
  //do not console.log here
    if(N%M == 0) return 1;

    return 0;
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
    logic("s");
    readline.close();
  }
}

function logic(input) {
  const [A, B] = inputArr[0].split(" ").map((x) => parseInt(x));

  console.log(Help(A, B));
}

