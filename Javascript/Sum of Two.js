// https://course.acciojob.com/idle?question=5deb9268-0ae5-4c8d-8115-20e8812dcd09

function findPair(array, k) {
 const storage = new Map();

    for(let index=0; index<array.length; index++){
        if(storage.has(k-array[index])){
            return (storage.get(k-array[index])+1)+" "+(index+1);
        }
        if(!storage.has(array[index]))
            storage.set(array[index], index);
    }

    return "";
}

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;

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
 
  
    let N =parseInt(inputArr[0].split(" ")[0]);
    let X=parseInt(inputArr[0].split(" ")[1]);
    let Arr = inputArr[1].split(" ").map((x) => parseInt(x));
 
  
    console.log(findPair(Arr,X));
  
}


