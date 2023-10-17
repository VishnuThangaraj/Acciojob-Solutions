// https://course.acciojob.com/idle?question=0661073e-27be-4658-8f37-e166372a2cdb

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function numDigits(num){
  var count = 0;

	while(num > 0){
		count++; //increase count
		num = Math.floor(num/10); //divide and remove decimal points
	}

	return count;
}

rl.question('', (n) => {
  console.log(numDigits(parseInt(n)));
  rl.close();
});
