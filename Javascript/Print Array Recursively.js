// https://course.acciojob.com/idle?question=42087e6a-fcc5-431d-b78a-e1c57a7bb814

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', n => {
  readline.question('', arr => {
    arr = arr.split(' ').map(Number);
    printArray(arr, n);
    readline.close();
  });
});

let res = "";
function printArray(arr, n) {
  printArrayRecursive(arr, 0, n);
	console.log(res);
}

function printArrayRecursive(arr, i, n) {
  
	// Write your code here
	if(i==n) return;
	res += arr[i] + " ";
    printArrayRecursive(arr, i+1, n);
}
