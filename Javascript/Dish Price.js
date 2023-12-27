// https://course.acciojob.com/idle?question=0eeccf04-fe01-4172-82a8-e459cbe81114

function totalPrice(arr) {
    let cost = 0;
    for(let obj of arr){
        cost += obj[2];
    }
    return cost;
}

var readline = require("readline").createInterface(process.stdin);
let inputArr = [];
var lineNumber = -1;

readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;
 
  if (lineNumber ==  0) {
    logic("s");
    readline.close();
  }
}



function logic(input) {
    let arr=JSON.parse(inputArr[0]);
    console.log(totalPrice(arr));
    
}

