// https://course.acciojob.com/idle?question=7edca375-b129-440b-acbd-d38837585fc5

function evenOdd(number) {
    //write your code here
	if(number % 2== 0){ // even number
		console.log(0);
	}else{ // odd number
		console.log(1);
	}
}

/* Do not change the code below  */

const rl = require("readline");
const reader = rl.createInterface({
  input: process.stdin,
  output: process.stdout,
});
reader.on("line", function (line) {
  const number = parseInt(line);
  evenOdd(number);
  reader.close();
});
