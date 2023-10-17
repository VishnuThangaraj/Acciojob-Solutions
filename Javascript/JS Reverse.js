//https://course.acciojob.com/idle?question=193a0fec-9788-4682-810c-395dc5c22118

function JsReverse(num) {
  //return the string
  //do not console.log here
	let result = 0;

	while(num > 0){
		result = result*10 + num%10; 
		//math.floor removes the decimals after the division
		num = Math.floor(num/=10);
	}

	return result;
}

/*Do not change the code below */
const rl = require("readline");

const reader = rl.createInterface({
  input: process.stdin,
  output: process.stdout,
});

reader.on("line", (line) => {
  const n = parseInt(line);
  console.log(JsReverse(n));
});
