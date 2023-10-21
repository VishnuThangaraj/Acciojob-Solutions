// https://course.acciojob.com/idle?question=906aec93-4171-4669-9c94-f2a9bcac0778

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', n => {
  console.log(count7(parseInt(n)));
  readline.close();
});

function count7(n) {
	let count = 0;

	while(n >0){
		if(n % 10 == 7)
			count ++;
		n = Math.floor(n/10);
	}

	return count;
}
