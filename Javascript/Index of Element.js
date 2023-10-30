// https://course.acciojob.com/idle?question=71ec4228-63be-4027-9fa4-08135d2a16d6

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

function indexOfElement(N, X, arr) {
  const result = [];
    const noVal = -1;

    for(let index=0; index<N; index++)
        if(arr[index] == X) result.push(index+1);

    if(result.length == 0) console.log(noVal);
    else
        console.log(...result);
}

readline.question('', (input) => {
  const [N, X] = input.split(' ').map(Number);
  readline.question('', (input) => {
    const arr = input.split(' ').map(Number);
    indexOfElement(N, X, arr);
    readline.close();
  });
});
