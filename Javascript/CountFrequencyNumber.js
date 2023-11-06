// https://course.acciojob.com/idle?question=38c05e70-89d7-4c68-afd3-fe94246658cd

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

function countFreqDigit(n, d) {
  let count = 0;

    while(n >0){
        if(n%10 == d){
            count++; 
        }
        n = Math.floor(n/10);
    }

    return count;
}

readline.question('', (input) => {
  const [n, d] = input.split(' ').map(Number);
  console.log(countFreqDigit(n, d));
  readline.close();
});
