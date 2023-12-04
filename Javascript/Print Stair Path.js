// https://course.acciojob.com/idle?question=e2241a29-475e-4aec-8ad3-6a535bf58316

const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function printStairPaths(n, pathSoFar) {
  if(n == 0){
      console.log(pathSoFar);
      return;
  }
    for(let step = 1; step <=3; step++){
        if(step <= n){
            printStairPaths(n-step, pathSoFar+""+step);
        }
    }
}

rl.on('line', (input) => {
  let n = parseInt(input);
  printStairPaths(n, '');
  rl.close();
});
