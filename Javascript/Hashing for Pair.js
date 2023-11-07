// https://course.acciojob.com/idle?question=5a7cc954-fda7-4352-beef-39e991089b89

function findSum(arr, n, sum) {
 // return 0 or 1
// do not cosole.log here
    const storage = new Set();

    for(let num of arr){
        if(storage.has(sum - num)){
            return "1"; // Pair found
        }
        storage.add(num);
    }

    return "0"; // Pair not found
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
  if (lineNumber == 2 * size) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  let T = parseInt(inputArr[0].trim());
  //let str1 = inputArr[1].trim();
  for (let i = 1; i <= 2 * T; i += 2) {
    let [n, k] = inputArr[i].split(" ").map((x) => parseInt(x));
    let Arr = inputArr[i + 1]
      .trim()
      .split(" ")
      .map((x) => parseInt(x));
   // console.log(n, Arr,k);
    console.log(findSum(Arr,n,k));
  }
}
