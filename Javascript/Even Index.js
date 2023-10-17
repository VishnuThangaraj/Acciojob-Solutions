//https://course.acciojob.com/idle?question=146e42da-f008-480b-a087-944dc0f097ee

function evenIndices(arr) {
	var result = []; //to store the result
	
	//iterate throught the array
	for(var i=0; i<arr.length; i++){
		if(i%2 === 0){
			//add t result array
			result.push(arr[i]);
		}
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
  
  if (lineNumber == 1) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
 

    let Arr = inputArr[1].split(" ").map((x) => parseInt(x));

    console.log(evenIndices(Arr).join(" "));
  }
