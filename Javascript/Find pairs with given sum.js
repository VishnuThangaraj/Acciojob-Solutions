// https://course.acciojob.com/idle?question=c3287644-0a7d-407f-9a57-bb7899ca62ff

function countPairs(n, sum, arr) {
 // return the count
// do not console.log here
    const storage = new Map();
    let count = 0;

    for(let num of arr){
        if(storage.has(sum-num))
            count += storage.get(sum-num);

        if(storage.has(num)) storage.set(num, storage.get(num)+1); 
        else storage.set(num,1);
    }
    return count;
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
  if (lineNumber == 0) {
    size = parseInt(inputArr[0]);
  }
  //Exit Condition
  if (lineNumber == 1) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  //let T = parseInt(inputArr[0].trim());
  //let str1 = inputArr[1].trim();
  let [n, k] = inputArr[0].split(" ").map((x) => parseInt(x));
  let Arr = inputArr[1]
    .trim()
    .split(" ")
    .map((x) => parseInt(x));
  console.log(countPairs(n, k, Arr));
}
