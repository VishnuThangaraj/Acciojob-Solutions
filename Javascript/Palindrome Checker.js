// https://course.acciojob.com/idle?question=340d0f67-3062-487f-ac95-adcb744c410c

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', n => {
  //Write your code here and print the required output
	// reverse the number 
	let copy = n;
	let reverse = 0;

	while(copy > 0){
		reverse = (reverse*10) + copy%10;
		copy = Math.floor(copy/10);
	}

	if(reverse == n)
		console.log(true); // same if reversed
	else
		console.log(false);
  readline.close();
});
