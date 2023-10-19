// https://course.acciojob.com/idle?question=7ef4729b-1d19-445d-b839-3ebf7112e5be

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('', (N) => {
  console.log(printSum(parseInt(N)));
  rl.close();
});

function printSum(N) {
	// convert to integer
	N = parseInt(N);
  let total = 0;

	for(let num = 1; num <=N; num++)
		total += num;

	return total;
}
