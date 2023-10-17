// https://course.acciojob.com/idle?question=90be04a3-8f4e-4e83-aa54-19c4b1f2d24b

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let input = [];

rl.on('line', (line) => {
  input.push(line);
});

rl.on('close', () => {
  let n = parseInt(input[0]);
  let arrA = input[1].split(' ').map(Number);
  let m = parseInt(input[2]);
  let arrB = input[3].split(' ').map(Number);
  console.log(arrayProblem(arrA, arrB));
});

function arrayProblem(arrA, arrB) {
  let sum =0;

	// add the first array to sum
	for (let num of arrA) {
		sum += num;
	}

	// subtract the second array to sum
	for (let num of arrB) {
		sum -= num;
	}

	if(sum == 0) // both are equal
		return "Both are equal";
	if(sum > 0) // first is larger
		return "First array is larger";

	return "Second array is larger";
}
