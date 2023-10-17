// https://course.acciojob.com/idle?question=eedc80e6-d75c-431b-a481-063d38c38003

function uniqueChars(str1) {
   unique = new Set();
	result = "";
	// store unique characters in the set
	for(let index=0; index<str1.length; index++){
		letter = str1[index];
		// check for duplicates
		if(!unique.has(letter))
			result += letter;
		// Add to set
		unique.add(letter);
	}

	return result;
}

/* Do not change the code below  */

const rl = require("readline");
const reader = rl.createInterface({
  input: process.stdin,
  output: process.stdout,
});
reader.on("line", function (line1) {
  console.log(uniqueChars(line1));
  reader.close();
});
