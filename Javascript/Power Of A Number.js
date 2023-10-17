// https://course.acciojob.com/idle?question=0f925a63-cce8-449c-983d-bfc2bacada93

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (line) => {
  const [a, b] = line.split(' ').map(Number);
	let result = 1;
  for(let i=0;i<b;i++){
	  result*=a;
  }

	console.log(result);
});
