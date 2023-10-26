// https://course.acciojob.com/idle?question=85ea37ff-4aa2-4b45-ad88-ce8c425f040a

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function printWord(N) {
  for(let loop = 1; loop<=N; loop++)
	  console.log("AccioSchool");
}

rl.question('', (N) => {
  printWord(parseInt(N));
  rl.close();
});
