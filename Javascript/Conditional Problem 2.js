// https://course.acciojob.com/idle?question=2f5bfb63-8713-432e-90e3-789ee00bc337

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('', (input) => {
  if(input >= 30){
	  console.log("more important");
  }else{
	  console.log("less important");
  }
  rl.close();
});
