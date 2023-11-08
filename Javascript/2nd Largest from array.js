// https://course.acciojob.com/idle?question=d5b5b101-0636-4654-bd4d-bfecce8e5d00

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
  let n = parseInt(input[0]);
  let arr = input[1].split(' ').map(Number);
  SecondLargest(arr, n);
});

function SecondLargest(arr, n) {
  const result = [-9999, -9999];

    for(let num of arr){
        if(num > result[0]){
            result[1] = result[0];
            result[0] = num;
        }else if(num > result[1]){
            result[1] = num;
        }
    }

    console.log(result[1]);
}
