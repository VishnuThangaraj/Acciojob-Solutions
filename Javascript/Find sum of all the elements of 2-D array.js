// https://course.acciojob.com/idle?question=6f64e510-b7fd-44b7-9d5f-923a0995bde9

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
  let [n, m] = input[0].split(' ').map(Number);
  let arr = [];
  for(let i = 1; i <= n; i++){
    arr.push(input[i].split(' ').map(Number));
  }
  console.log(findSum(arr, n, m));
});

function findSum(arr, n, m) {
	let sum = 0;

	for(let row=0; row<n; row++)
		for(let col=0; col<m; col++)
			sum += arr[row][col];

	return sum;
}
