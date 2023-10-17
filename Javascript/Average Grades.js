//https://course.acciojob.com/idle?question=00e259d0-ef89-4a96-8054-27055509293a

function averageGrade(arr) {
 // return the average value
// do not console.log here
	var total = 0;

	//iterate through the array
	for(var i=0; i<arr.length; i++){
		total+=arr[i];
	}

	//divide total by array length and return
	return total/arr.length;
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

  //Exit Condition
  if (lineNumber == 0) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  let str = JSON.parse(inputArr[0].trim());
  console.log(averageGrade(str));
}
