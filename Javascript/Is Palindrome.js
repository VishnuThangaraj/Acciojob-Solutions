// https://course.acciojob.com/idle?question=23a3dd19-36f8-45c8-885c-fb2882ab29d3

function isPalindrome(s) {
  // write your code here
	let start = 0, end = s.length-1;

	while(start < end){
		if(s[start++] !== s[end--])
			// not a palindrome
			return false;
	}

	return true; // string is palindrome
}

/* Do not change the code below  */

const rl = require("readline");
const reader = rl.createInterface({
  input: process.stdin,
  output: process.stdout,
});
reader.on("line", function (line) {
  console.log(isPalindrome(line));
  reader.close();
});
