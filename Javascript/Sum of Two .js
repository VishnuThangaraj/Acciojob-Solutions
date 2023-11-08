// https://course.acciojob.com/idle?question=dea47a42-973b-44c4-a005-b721f8fe7cbf

function SumofTwo(N, Target, myArr) {
  // do not console.log here
  // complete your code
    const result = [];
    const storage = new Map();

    for(let index=0; index<N; index++){
        if(storage.has(Target - myArr[index])){
            result.push(storage.get(Target - myArr[index]));
            result.push(index+1);
            break;
        }
        if(!storage.has(myArr[index])){
            storage.set(myArr[index], index+1);
        }
    }

    return result;
}


/*Do not change the code below */
var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var inputSize;
let x = 0;
let K;
//multipleline input from User
readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);

  lineNumber++;

  if (lineNumber === 0) {
    [size, K] = inputArr[0].split(" ").map((x) => +x);
    ///console.log(size,K);
    // cool=false;
  } else if (lineNumber < size) {
    //lineNumber--;
  }

  //Exit Condition
  if (lineNumber == 1) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  const myArr = inputArr[1].split(" ").map((x) => +x);
  console.log(...SumofTwo(size, K, myArr));
}

