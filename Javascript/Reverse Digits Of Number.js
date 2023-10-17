// https://course.acciojob.com/idle?question=817d51d8-e009-4322-8e51-257b76455a4c

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', n => {
  let copy = n;
	let reverse = 0;

	while(copy > 0){
		reverse = (reverse * 10) + copy%10;
		copy = Math.floor(copy/10);
	}

	console.log(reverse);
  readline.close();
});
