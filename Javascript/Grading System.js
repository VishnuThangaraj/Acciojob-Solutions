// https://course.acciojob.com/idle?question=69509951-7b18-4428-b0a3-35849e6d405c

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('', (n) => {
  // Your code here
	if(n > 90){
		console.log("Excellent");
	}else if(n > 80){
		console.log("Good");
	}else if(n > 70){
		console.log("Fair");
	}else if(n > 60){
		console.log("Meets Expectations");
	}else {
		console.log("Below Expectations");
	}
  rl.close();
});
