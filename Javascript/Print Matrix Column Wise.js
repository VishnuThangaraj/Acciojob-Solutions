// https://course.acciojob.com/idle?question=31900452-fb2e-45cd-93b0-fb4d6afbfac0

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let input = [];

rl.on('line', (line) => {
  input.push(line);
});

rl.on('close', () => {
  let t = Number(input.shift());
  while (t--) {
    let [n, m] = input.shift().split(' ').map(Number);
    let matrix = [];
    for (let i = 0; i < n; i++) {
      matrix.push(input.shift().split(' ').map(Number));
    }
    printMatrixColumnwise(matrix, n, m);
  }
});

function printMatrixColumnwise(mat, n, m) {
    const result = [];
    
  for(let col=0;col<m; col++){
      for(let row=0; row<n; row++){
          result.push(mat[row][col]);
      }
  }

    console.log(...result);
}
