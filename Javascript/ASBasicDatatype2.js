//https://course.acciojob.com/idle?question=04d7d78a-91e9-4bca-91cf-96b6a5560ee7

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

function printCount(a, b, c) {
  var count = 0;
	
	if(a<0){ //a is negative
		count++;
	}
	if(b<0){ //b is negative
		count++;
	}
	if(c<0){ //c is negative
		count++;
	}

	return count;
}

readline.question('', (input) => {
  const [a, b, c] = input.split(' ').map(Number);
  console.log(printCount(a, b, c));
  readline.close();
});
