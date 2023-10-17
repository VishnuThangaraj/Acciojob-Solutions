// https://course.acciojob.com/idle?question=208cee53-a998-404f-a455-5307d71abacd

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', n => {
  if(n == 28){
	  console.log("i am young");
  }else{
	  console.log("i am not young");
  }
  readline.close();
});
