// https://course.acciojob.com/idle?question=09d1a3ab-046f-4594-b5b4-41040ef6650f

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;

readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;
  
  if (lineNumber == 1) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
 

    let Arr = inputArr[1].split(" ").map((x) => parseInt(x));

    console.log(segregateZerosAndOnes(Arr).join(' '));
  }

function segregateZerosAndOnes(arr) {
  let left = 0;
  let right = arr.length - 1;

  while (left < right) {
    // Move left pointer to the right until we encounter a 1
    while (arr[left] === 0 && left < right) {
      left++;
    }

    // Move right pointer to the left until we encounter a 0
    while (arr[right] === 1 && left < right) {
      right--;
    }

    // Swap the values at the two pointers
    if (left < right) {
      let temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
  }

  return arr;

}
