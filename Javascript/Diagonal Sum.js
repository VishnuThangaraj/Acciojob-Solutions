// https://course.acciojob.com/idle?question=5eb11b5f-ecb6-4a1e-8a82-df9e59671a9d

function DiagonalSum(n,mat){

    let row = 0, col = 0;
    const result = [0, 0];

    // Calculate left Diagonal
    while(row < n && col < n){
        result[0] += mat[row++][col++];
    }

    // Calculate right diagonal
    row = 0, col = n-1;
    while(row < n && col >=0){
        result[1] += mat[row++][col--];
    }

    return result;
  }

/*Do not change any code below*/
var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var inputSize;

//multipleline input from User
readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;
  if (lineNumber == 0) {
    size = parseInt(inputArr[0]);
  } else if (lineNumber < size) {
  }

  //Exit Condition
  if (lineNumber == size) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  const N = parseInt(inputArr[0]);
  inputArr.shift();
  let Matrix = [];
  for (let i = 0; i < N; i = i + 1) {
    const Arr = inputArr[i].split(" ").map((x) => +x);
    Matrix.push(Arr);
  }

  console.log(DiagonalSum(N, Matrix).join(" "));
}
