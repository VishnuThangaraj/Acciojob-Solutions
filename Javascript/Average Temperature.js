// https://course.acciojob.com/idle?question=7f376860-d38b-4ff5-925b-c71f8f107d8a

function averageTemperatures(arr) {
    const result = [];

    for(let [name, ...temp] of arr){
        let sum = 0;
        for(let days of temp){
            sum += days;
        }
        result.push(sum/temp.length);
    }

    return result;
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
    console.log(averageTemperatures(arr).join(" "));
    
}
