// https://course.acciojob.com/idle?question=33d63104-18df-470b-a50a-ee5ba62580d3

const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let t = 0;
let testCases = [];

rl.on('line', function(line) {
  if (t === 0) {
    t = parseInt(line);
  } else {
    testCases.push(line);
    if (testCases.length === t) {
      rl.close();
    }
  }
}).on('close', function() {
  for (let i = 0; i < t; i++) {
    console.log(reverseWords(testCases[i]));
  }
  process.exit(0);
});

function reverseWords(s) {
  let result = "";
	let current = "";

	for(let ind=0; ind<s.length; ind++){
		let letter = s[ind];
		if(letter == " " ){
			result =  current +" "+ result;
			current = "";
		}else{
			current += letter;
		}
	}

	result = current +" "+ result;

	return result;
}
