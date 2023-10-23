// https://course.acciojob.com/idle?question=c978cb03-f171-461c-8fa7-40d33558141c

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

function NumberSum(N) {
  let sum = 0;

	for(let loop=1; loop<=N; loop++)
		sum += loop;

	return sum;
}

readline.question('', N => {
  console.log(NumberSum(Number(N)));
  readline.close();
});
