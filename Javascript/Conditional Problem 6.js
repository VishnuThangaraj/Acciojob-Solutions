// https://course.acciojob.com/idle?question=3f36c2e7-2f78-4446-8a9c-c2de5ef059b2

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (input) => {
  const [a, b] = input.split(' ').map(Number);
  // write code here
	if(a%2 !=0 && b%2 != 0)
		console.log('we are odd')
	else
		console.log('we are simple')

  rl.close();
});
