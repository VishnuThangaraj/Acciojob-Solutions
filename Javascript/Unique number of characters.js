// https://course.acciojob.com/idle?question=665b5b46-4ec7-4a52-80c9-4519582e02d9

function countUniqueCharacters(s) {
 // return the count
// do not console.log here
    const storage = new Set();

    for(let letter of s){
        storage.add(letter);
    }

    return storage.size;
}

/*Do not change the code below */

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var query = 100000;
var K;
readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;
  if (lineNumber == 0) {
    size = parseInt(inputArr[0]);
  }
  //Exit Condition
  if (lineNumber == 0) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  //let s = parseInt(inputArr[0].trim());
  //let str1 = inputArr[1].trim();
  let Arr = inputArr[0].trim();

  console.log(countUniqueCharacters(Arr));
}
