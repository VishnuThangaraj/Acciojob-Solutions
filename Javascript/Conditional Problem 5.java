// https://course.acciojob.com/idle?question=38436ae2-5f85-4b5c-82ad-f5bd437c5e73

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('', (n) => {
  if(n % 6 == 0)
	  console.log("Divisible");
	else
	  console.log("Not divisible");
});
