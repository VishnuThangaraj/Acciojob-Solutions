// https://course.acciojob.com/idle?question=a93bddb1-78e4-4ad6-a018-275668ecc3e4

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', n => {
  readline.close();
  // Write your code here
let sum = 1;
	
	for(let fact=1; fact<=n; fact++)
		sum *= fact;

	console.log(sum);
});
