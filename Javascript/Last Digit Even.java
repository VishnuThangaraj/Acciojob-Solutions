function check_last_digit(nums) {
	let last_digit = nums%10;

	if(last_digit % 2 == 0)
		console.log(1); // even
	else
	 console.log(0); // odd
}

const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
  terminal: false
});

let inputNumbers = [];
rl.on('line', function(line) {
  inputNumbers = line.split(" ").map(a => parseInt(a));
  check_last_digit(inputNumbers);
});
