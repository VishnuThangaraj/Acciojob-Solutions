//  https://course.acciojob.com/idle?question=731ed146-cda9-481c-aea0-b6d23428a540

function sumPlusOne(arr) {
    let sum = 0;
  for(let num of arr){
      sum += num;
  }
    return sum+arr.length;
}

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;

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
 

    let Arr = inputArr[0].split(" ").map((x) => parseInt(x));

    console.log(sumPlusOne(Arr));
  }



