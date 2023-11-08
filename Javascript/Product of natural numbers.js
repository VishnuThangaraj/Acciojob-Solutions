// https://course.acciojob.com/idle?question=87e75921-1f5a-4df9-bab1-ee5bea40c5db

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

function product(n) {
  if(n==1) return 1;

    return n * product(n-1);
}

readline.question('', n => {
  console.log(product(Number(n)));
  readline.close();
});
