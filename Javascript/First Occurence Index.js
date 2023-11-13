// https://course.acciojob.com/idle?question=f03dab51-36ef-4e58-b5de-8995417f59ac

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let input = [];

rl.on('line', (line) => {
  input.push(line);
}).on('close', () => {
  let A = input[1].split(' ').map(Number);
  let T = Number(input[2]);
  console.log(firstIndex(A, T, 0));
});

function firstIndex(A, T, startIndex) {
    for(let index=0; index<A.length; index++){
        if(A[index] == T) return index;
    }
    
    return -1;
}
