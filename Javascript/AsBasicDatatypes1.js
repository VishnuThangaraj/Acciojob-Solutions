// https://course.acciojob.com/idle?question=1de4f5e9-1012-47d7-95a3-20de59d699ec

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

function printOperations(x, y, z) {
  console.log(x+y+z);
  console.log(x*y-z);
}

readline.question('', (input) => {
  const [x, y, z] = input.split(' ').map(Number);
  printOperations(x, y, z);
  readline.close();
});
