// https://course.acciojob.com/idle?question=c2985a2b-5ee0-4569-a77b-7459b1efd8d7

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', n => {
  readline.question('', arr => {
    arr = arr.split(' ').map(Number);
    arrayOperations(arr, n);
    readline.close();
  });
});

function arrayOperations(arr, n) {
  let max = 0, sum = 0;

	for(let num of arr){
		max = Math.max(max, num);
		sum += num;
	}

	console.log(`${sum} ${Math.floor(sum / arr.length)} ${max}`);
}
