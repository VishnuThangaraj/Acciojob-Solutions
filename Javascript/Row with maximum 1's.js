// https://course.acciojob.com/idle?question=71db14be-9bbc-4bca-b059-9e65d95cfa90

function max1Row(mat, n, m) {
  // write code here
  // do not console.log
  // return the answer as a number
	let result = -1;
	let count = 0;

	for(let row =0; row <n; row++){
		let current = 0;
		for(let col=0; col<m; col++){
			if(mat[row][col] == 1)
				current++;
		}
		if(current > count){
			result = row;
			count = current;
		}
			
	}

  return result;
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
    [n, m] = inputArr[0]
      .trim()
      .split(" ")
      .map((x) => parseInt(x));
  }
  //Exit Condition
  if (lineNumber == n) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  let [n, m] = inputArr[0]
    .trim()
    .split(" ")
    .map((x) => parseInt(x));
  let Arr = [];
  for (let i = 1; i <= n; i = i + 1) {
    Arr.push(
      inputArr[i]
        .trim()
        .split(" ")
        .map((x) => parseInt(x))
    );
  }

  console.log(max1Row(Arr, n, m));
}
