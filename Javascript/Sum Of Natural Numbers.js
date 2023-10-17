// https://course.acciojob.com/idle?question=75a292e5-d69d-44a0-a74d-366c7c3c5e95

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('', (N) => {
	let Num = Number(N);

	console.log((Num*(Num+1)) / 2);

    rl.close();
});
