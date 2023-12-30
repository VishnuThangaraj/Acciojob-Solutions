// https://course.acciojob.com/idle?question=ea62270d-e330-4190-9d03-e25e6c84d41e

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

function sumOfDigi(n) {
  let result = 0;
    while(n > 0){
        result += n%10;
        n = Math.floor(n/10);
    }
    return result;
}

readline.question('', n => {
  let result = sumOfDigi(parseInt(n));
  console.log(result);
  readline.close();
});
