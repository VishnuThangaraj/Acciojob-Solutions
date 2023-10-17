// https://course.acciojob.com/idle?question=e958fa46-11df-46f0-9153-6907e969d40d

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', n => {
  readline.question('', arr => {
    const arrNum = arr.split(' ').map(Number);
    const ans = ArrayProblem2(n, arrNum);
    console.log(ans);
    readline.close();
  });
});

function ArrayProblem2(n, arr) {
  let count = 0;

	for(let num of arr)
		if (num > 35)
			count++;

	return count;
}
