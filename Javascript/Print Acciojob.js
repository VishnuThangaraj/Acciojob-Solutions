// https://course.acciojob.com/idle?question=46f24e9e-fdff-4067-bf4b-8b5e4e65a6ea

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', n => {
  solve(parseInt(n));
  readline.close();
});

function solve(n) {
  for (let loop = 1; loop<=n; loop++){
	  console.log("ACCIOJOB");
  }
}
