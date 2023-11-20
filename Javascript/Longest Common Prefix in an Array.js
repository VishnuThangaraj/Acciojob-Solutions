// https://course.acciojob.com/idle?question=3db0e81f-45be-4ff1-99f4-a6ac548a7747

function longestCommonPrefix( arr) {
    let result = arr[0];

    for(let word=1; word<arr.length; word++){
        let count = 0, current = arr[word];
        for(let index=0; index<current.length && index<result.length; index++){
            if(result[index] == current[index]) count++;
            else break;
        }
        result = (count < result.length) ? result.substring(0,count) : result;
    }
    
    return (result.length == 0) ? -1 : result;
}


var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
let arr=[];
let n,k;
readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;
  if(lineNumber==0)n=parseInt(line);
if(lineNumber>0)arr.push(line);
  
  if(lineNumber==n)
  {logic("s");
  readline.close();}
}

function logic(input) {
 


    console.log(longestCommonPrefix(arr));
  }


