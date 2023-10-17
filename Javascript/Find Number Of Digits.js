// https://course.acciojob.com/idle?question=2b98dab6-8c91-4f4d-8bb7-829fc1155a26

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

function numOfDigi(n) {
	let count = 0;
  while(n>0){
	  count++; //increase count
	  n = Math.floor(n/10); // cut off the last digit
  }
	return count;
}

readline.question('', n => {
  const result = numOfDigi(parseInt(n));
  console.log(result);
  readline.close();
});
