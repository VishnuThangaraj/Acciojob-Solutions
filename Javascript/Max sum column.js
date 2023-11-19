// https://course.acciojob.com/idle?question=d6a7bc77-23a7-4f01-8537-2f41a1f01f61

function maxColSum(mat) {
 // do not console.log here
// return the sum 
    let result = 0;

    for(let col=0; col<mat[0].length; col++){
        let temp = 0;
        for(let row = 0; row<mat.length; row++){
            temp += mat[row][col];
        }
        result = (result < temp) ? temp : result;
    }
    return result;
}

/*Do not edit the code below*/

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
let mat =[];
var lineNumber = -1;

readline.on("line", readInputs);

let n, m;

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;
  
  if (lineNumber == 0) {
    
    let Arr = inputArr[0].split(" ").map((x) => parseInt(x));
     n=Arr[0];
     m=Arr[1];
  
     
  }
   
  else{
       let Arr = inputArr[lineNumber].split(" ").map((x) => parseInt(x));
       mat.push(Arr);
      
  }

  if (lineNumber ==  n) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  console.log(maxColSum(mat));
}
