// https://course.acciojob.com/idle?question=880bf366-ebe4-4437-b987-c6552fcc3db4

// str is input
function isPalindrome(str) {
  // write code here
  // do not console.log
  // return the 1 or 0
    // Two-Pointers
    let first = 0, second = str.length-1;

    while(first < second){
        if(str[first++] != str[second--]){
            return 0; // Not a Palindrome
        }
    }
    return 1; // Palindrome
 }


var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var inputSize;

//multipleline input from User
readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;
  // if (lineNumber == 0) {
  //   size = parseInt(inputArr[0]);
  // }
  //Exit Condition
  if (lineNumber == 0) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  const str=inputArr[0].trim();
  console.log(isPalindrome(str));
}
