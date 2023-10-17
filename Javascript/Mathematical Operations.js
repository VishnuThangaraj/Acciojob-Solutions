// https://course.acciojob.com/idle?question=db7c833b-1a2d-451f-8357-c67567270e1d

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', input => {
  const [a, b] = input.split(' ').map(Number);
      console.log(a+b);
	  console.log(a-b);
	  console.log(a*b);
	  console.log(Math.floor(a/b));
	  console.log(a%b);

	
  readline.close();
});
