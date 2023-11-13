// https://course.acciojob.com/idle?question=e2214e07-d190-4c58-8287-52e6b136e293

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

function frequencyOfDigit(n,d){
	let count = 0;

    while(n >0){
       if(n%10 == d) count++;

        n = Math.floor(n/10);
    }
    return count;
}

readline.question('', n => {
  readline.question('', d => {
	
	console.log(frequencyOfDigit(n,d));  
	readline.close();
  });
});
