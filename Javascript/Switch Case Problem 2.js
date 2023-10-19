// https://course.acciojob.com/idle?question=462924fb-c9f5-479b-8aef-e1ecb1366df8

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('', (N) => {
	N = parseInt(N);
  //Write code here and print output here
	switch(N){
		case(12):
			console.log("I am even");
			break;
		case(13):
			console.log("I am prime");
			break;
		case(25):
			console.log("I am odd");
			break;
		default:
			console.log("I am just a number");	
	}
  rl.close();
});
