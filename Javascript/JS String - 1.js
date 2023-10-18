// https://course.acciojob.com/idle?question=429798ef-93c5-4644-af7e-deb378fe8833

function numOfWords(line){
	let count = 1;

	// iterate the string 
	for(let character of line)
		if(character === " ")
			count++; // word found

	return count;
  
  }
  
const rl = require('readline')
 

 const reader = rl.createInterface({

  input:process.stdin,
  output:process.stdout
 })
 

 reader.on('line',(line)=>{
 

  console.log(numOfWords(line));
 

 })

 
