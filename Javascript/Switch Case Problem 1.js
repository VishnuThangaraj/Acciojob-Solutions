// https://course.acciojob.com/idle?question=45ea42b3-c108-43e0-b57e-57ae90b7792e

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', N => {
	N = parseInt(N);
  //Write code here and print output here
	switch(N){
		case(55):
			console.log("Study is important");
			break;
		default:
			console.log("No value");
	}
  readline.close();
});
