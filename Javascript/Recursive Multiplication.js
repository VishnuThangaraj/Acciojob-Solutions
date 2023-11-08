// https://course.acciojob.com/idle?question=a34b9f55-9ebc-479e-9446-b52e69107909

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

function multiplyRecursively(n, m) {
  if(m==0){
      return 0;
  }
    return n + multiplyRecursively(n,m-1);
}

readline.question('', n => {
  readline.question('', m => {
    console.log(multiplyRecursively(parseInt(n), parseInt(m)));
    readline.close();
  });
});
