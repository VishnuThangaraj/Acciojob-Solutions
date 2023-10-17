//https://course.acciojob.com/idle?question=01ffbfbe-fdbe-4d68-90a4-18a94e27ef11

function oddball_sum(nums){
 // write code here
 // use console.log to display the output 
// do not return here
	var total = 0;

	//iterate through the array
	for(var i=0; i<nums.length; i++){
		if(nums[i]%2 != 0){ //odd number found
			total+=nums[i];
		}
	}

	console.log(total);
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
  noGuessName= line.split(" ").map(a=>parseInt(a))
  oddball_sum(noGuessName)
  })
