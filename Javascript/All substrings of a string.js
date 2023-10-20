// https://course.acciojob.com/idle?question=94779a98-b326-4d58-a107-b50cc370b894

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function SubString(str) {

	for(let start=0; start<str.length; start++){
		let result = "";
		for(let end =start; end<str.length; end++){
			result += str[end];
			console.log(result);
		}
	}			
}

rl.question('', (str) => {
  SubString(str);
  rl.close();
});
