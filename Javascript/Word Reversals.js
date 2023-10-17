//https://course.acciojob.com/idle?question=16410112-d54f-4f03-830b-b4bd0c12c8f7

function reverseWords(str){
    // write code here
	let updated = "";
	let temp = " ";
	//iterate through the string
	for(let i=0; i<str.length; i++){
		//get the character
		let current = str[i];

		if(current === " " || i==str.length-1){
			//edge case 
			if(i==str.length-1){
				temp = current + temp;
			}
			//add temp tp updated and reset temp 
			updated+=temp;
			temp = " ";
		}else{
			//add to front of temp
			temp = current + temp;
		}
	}

	console.log(updated);
    // use console.log to print output
 }

/*Do not change the code below*/
const readline = require('readline');
 const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
  terminal: false
 });
 let noGuessName = []
 rl.on('line', function(line){
  reverseWords(line)
  })

   		
