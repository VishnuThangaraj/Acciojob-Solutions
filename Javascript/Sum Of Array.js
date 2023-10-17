// https://course.acciojob.com/idle?question=246da4dd-1811-4fcc-8feb-fc4a9799ee9a

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('', (N) => {
  rl.question('', (arr) => {
    arr = arr.split(' ').map(Number);
    let ans = findSum(arr, N);
    console.log(ans);
    rl.close();
  });
});

function findSum(arr, N) {
  
	let sum = 0;

	for (let num of arr) {
		sum += num;
	}
	return sum;
}
