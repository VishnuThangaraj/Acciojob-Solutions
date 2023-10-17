// https://course.acciojob.com/idle?question=044b6db7-d0b6-4ab5-9bb5-8475269790cf

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', n => {
  console.log(factorial_recursive(parseInt(n)));
  readline.close();
});

function factorial_recursive(n) {
	if(n == 1){
		return 1;
	}
  return n * factorial_recursive(n-1);
}
