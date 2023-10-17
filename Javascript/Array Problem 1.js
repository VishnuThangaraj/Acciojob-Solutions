// https://course.acciojob.com/idle?question=203c6532-1438-4d70-8854-94f35fe1b0ba

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', n => {
  readline.question('', arr => {
    arr = arr.split(' ').map(Number);
    let ans = ArrayProblem1(n, arr);
    console.log(ans);
    readline.close();
  });
});

function ArrayProblem1(n, arr) {
  let max = arr[0];
	let result = 0;

	for (let index = 1; index < arr.length; index++) {
		if(arr[index] > max){ //current element is greater than all previous elements
			max = arr[index];
			result = index;
		}
	}
	return result; //return max index
}
