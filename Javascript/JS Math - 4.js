// https://course.acciojob.com/idle?question=dfece1a0-5fbf-4130-aad1-603422bd2e78

function sumMaxMin(n1, n2, n3, n4, n5) {
  // return the value
  // Do not console.log here
    const nums = [n1, n2, n3, n4, n5];

    return Math.max(...nums) + Math.min(...nums);
}

/*Do not change the code below */
const rl = require("readline");

const reader = rl.createInterface({
  input: process.stdin,
  output: process.stdout,
});

reader.on("line", (line) => {
  const [a, b, c, d, e] = line.split(" ");

  console.log(sumMaxMin(a, b, c, d, e));
});
