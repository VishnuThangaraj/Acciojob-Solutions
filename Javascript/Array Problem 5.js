// https://course.acciojob.com/idle?question=f98feeb1-40eb-4b6f-a600-067714166864

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

function ArrayProblem(arr, k) {
  let count = 0;

    for(let index=1; index<arr.length; index++){
        if(arr[index] + arr[index-1] == k)
            count++;
    }

    return count;
}

readline.question('', (input) => {
  const [n, k] = input.split(' ').map(Number);
  readline.question('', (input) => {
    const arr = input.split(' ').map(Number);
    console.log(ArrayProblem(arr, k));
    readline.close();
  });
});
