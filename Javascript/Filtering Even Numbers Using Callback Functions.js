// https://course.acciojob.com/idle?question=b7384b42-6caa-4f39-a671-55a38ab17dbf

function filterEvenNumbers(arr, isEven) {
  // Write your code here
  // Do not console.log, just return the result.
	result = [];
	for(let num of arr){
		if(!isEven(num)) // odd number found
			result.push(num);
	}

	return result;
}

const isEven = (num) => num % 2 === 0;

const readline = require("readline");

const input = [];

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on("line", function (cmd) {
  input.push(cmd);
});

rl.on("close", function (cmd) {
  Main(input);
});

function Main(input) {
  const arr = JSON.parse(input[0]).map((e) => parseInt(e, 10));
  console.log(filterEvenNumbers(arr, isEven));
}
