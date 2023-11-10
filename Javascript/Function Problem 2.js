// https://course.acciojob.com/idle?question=b27b4039-2b8b-4834-9a6b-f8622057be7a

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

function fun(n, m) {
  console.log(n+m);
}

readline.question('', (input) => {
  const [n, m] = input.split(' ').map(Number);
  fun(n, m);
  readline.close();
});
