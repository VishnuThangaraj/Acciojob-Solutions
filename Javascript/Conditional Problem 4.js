// https://course.acciojob.com/idle?question=685c8feb-aa75-4369-be77-df68cbf993bc

var readline = require("readline").createInterface(process.stdin);

readline.question('', (line) =>{
	conditionalProblem(line[0]);
	readline.close()
});

function conditionalProblem(letter) {
	
	switch(letter){
		case('A'):
			console.log('I am the first letter');
			break;
		case('B'):
			console.log('I am the second letter');
			break;
		case('C'):
			console.log('I am the third letter');
			break;
		case('D'):
			console.log('I am the fourth letter');
			break;
		case('E'):
			console.log('I am the fifth letter');
			break;
		default:
			console.log('I don\'t belong here');
	}
			
}
