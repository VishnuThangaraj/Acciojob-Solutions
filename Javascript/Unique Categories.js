// https://course.acciojob.com/idle?question=15a56f78-05c0-406d-9ad5-91cd574670fe

function uniqueCategories(arr) {
// use set to get unique elements
	let storage = new Set();
	let result = [];

	for(let [exhibit, category] of arr){
		if(!storage.has(category)){
			storage.add(category);
			result.push(category);
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
 
  if (lineNumber ==  0) {
    logic("s");
    readline.close();
  }
}



function logic(input) {
    let arr=JSON.parse(inputArr[0]);
    let word=inputArr[1];
    console.log(uniqueCategories(arr).join(" "));
    
}
