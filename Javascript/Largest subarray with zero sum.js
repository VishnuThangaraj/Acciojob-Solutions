// https://course.acciojob.com/idle?question=f847c39d-4b37-4e23-8932-6cd3e8100b3a

function findMaxLengthSubarrayWithSum0(arr) {
  let result = -1, sum = 0;

   const storage = new Map();

    for(let index=0; index<arr.length; index++){
        sum += arr[index];
        if(storage.has(sum)){
            result = Math.max(result, index-storage.get(sum));
        }else if(sum == 0) {
            result = index+1;
        }
        else{
            storage.set(sum, index);
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
 
  
  if (lineNumber == 1) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  const T = inputArr[0];
  
    let Arr = inputArr[1].split(" ").map((x) => parseInt(x));
    console.log(findMaxLengthSubarrayWithSum0(Arr));
  
}




