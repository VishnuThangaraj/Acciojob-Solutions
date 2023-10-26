// https://course.acciojob.com/idle?question=86268336-53f2-481c-acf9-43fa353105b8

function doesItContain(line, substring) {
  // write code here
  // return the output , do not use console.log here
	return line.includes(substring);
}


/*do not change the code below*/

const rl = require("readline");

const reader = rl.createInterface({
  input: process.stdin,
  output: process.stdout,
});

reader.on("line", (line) => {
  const [line1, ch, hc] = line.split(",");

  console.log(doesItContain(line1, ch));
});


