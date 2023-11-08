// https://course.acciojob.com/idle?question=9c4cf63c-6578-4027-ba5e-e736058a929d

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function count1(n) {
  let count = 0;

    while (n > 0) {
        if(n%10 == 1) count++;

        n = Math.floor(n/10);
    }
    return count;
}

rl.on('line', (n) => {
  console.log(count1(Number(n)));
  rl.close();
});
