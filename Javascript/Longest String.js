//https://course.acciojob.com/idle?question=1a94b879-53cd-48a5-bc66-5d9e01a447ff

function longestString(arr) {
	let max = 0;
	let largeString = "";

	//iterate the array
	for(let i=0; i<arr.length; i++){
		//check the length of the current string in the array
		if(arr[i].length > max){
			largeString = arr[i];
			max = arr[i].length;
		}
	}

	return largeString;
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
 

    let Arr = inputArr[1].split(" ").map((x) => (x));

    console.log(longestString(Arr));
  }



