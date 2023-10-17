// https://course.acciojob.com/idle?question=2a3f2234-b037-4750-a02c-bc006a410ab1

function floor(n) {
  //return the floor value
  // do not console.log here
	return Math.floor(n);
}

/*Do not console.log here */
const rl = require("readline");

const reader = rl.createInterface({
  input: process.stdin,
  output: process.stdout,
});

reader.on("line", (line) => {
  const n = parseFloat(line);
  console.log(floor(n));
});

