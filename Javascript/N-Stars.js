// https://course.acciojob.com/idle?question=24eb1955-7e70-45d9-8ce8-f9d9a8268aca

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', n => {
	let start = "";
  for(let st=0; st<n; st++){ //creating first row start
	  start+="* ";
  }
	console.log(start); //print first row
	for(let st=0; st<n; st++){
	 console.log("*");
  }
  readline.close();
});
