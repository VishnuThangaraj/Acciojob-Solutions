// https://course.acciojob.com/idle?question=fba72d31-dfb6-4db7-8d05-1ff67555e229

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', n => {
  readline.question('', arr => {
    arr = arr.split(' ').map(Number);
    console.log(sumofArrayRec(arr, arr.length));
    readline.close();
  });
});

function sumofArrayRec(arr, n) {
	
	if(n < 1) return 0;

    return arr[n-1] + sumofArrayRec(arr, n-1);
}
