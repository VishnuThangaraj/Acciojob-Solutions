// https://course.acciojob.com/idle?question=f8dc968d-e012-4b18-83d5-df7dcbd38b38

function sumOfTwoNumbers(a, b) {
  console.log(a+b);
}

/*Do not change the code below */
const rl = require("readline");

const reader = rl.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let a, b;

reader.on("line", (line) => {
  if (!a) {
    a = parseInt(line);
  } else if (!b) {
    b = parseInt(line);
    sumOfTwoNumbers(a, b)
    reader.close();
  } else {
    // we already have both variables, do nothing
  }
});
