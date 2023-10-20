// https://course.acciojob.com/idle?question=9b7d25a5-b596-48e3-9653-31337b06f33e

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function greater(arr, N) {
  let count = 0;

	for(let num of arr)
		if(num > 20)
			count++;

	return count;
}

rl.question('', (N) => {
  rl.question('', (arr) => {
    arr = arr.split(' ').map(Number);
    const ans = greater(arr, N);
    console.log(ans);
    rl.close();
  });
});
