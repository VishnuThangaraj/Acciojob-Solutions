// https://course.acciojob.com/idle?question=a33a78a1-76d9-45f9-b6a3-9c7d51df6ee2

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', N => {
  readline.question('', A => {
    readline.question('', T => {
      const arr = A.split(' ').map(Number);
      console.log(lastIndex(arr, Number(T), Number(N)-1));
      readline.close();
    });
  });
});

function lastIndex(A, T, startIndex) {
  for(let index=A.length-1; index>=0; index--)
	  if(A[index] == T) return index;

	return -1;
}
