// https://course.acciojob.com/idle?question=7d78c798-5554-4d17-b0e4-6f97375d5d89

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('', (n) => {
	n = parseInt(n);
	// Your code here
	let total = 0

	while(n > 0){
		total += n%10;
		n = Math.floor(n/10);
	}

	console.log(total);
});
