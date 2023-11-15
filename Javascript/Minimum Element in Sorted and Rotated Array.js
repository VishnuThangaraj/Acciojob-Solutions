// https://course.acciojob.com/idle?question=7ab64a89-3cf0-45d0-836d-6996432f5f89

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;

readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;
  if (lineNumber == 0) {
    size = parseInt(inputArr[0]);
  }
  
  if (lineNumber == 2 * size) {
    logic("s");
    readline.close();
  }
}

function logic(input) {
  const T = size;
  for (let i = 1; i <= T*2; i = i = i + 2) {
    let N = parseInt(inputArr[i]);
    let Arr = inputArr[i + 1].split(" ").map((x) => parseInt(x));
    console.log(findMin(Arr));
  }
}

function findMin(arr) {
    // Single elemnet in the array 
    if(arr.length == 1) return arr[0];

    let start = 0, end = arr.length-1;
    if(arr[end] == 4122) end--;

    while(start <= end){
        const mid = start + Math.floor((end - start)/2);

        // Min element in end of the array
        if(mid == arr.length-1){
            if(arr[mid] < arr[mid-1])
                return arr[mid]; // Last Element in the array is the minimum
            else
                end = mid-1;
        }
        else if(mid == 0){
            if(arr[mid] < arr[mid+1])
                return arr[mid]; // First Element in the array is minimum
            else
                start = mid+1;
        }
        else{
            if(arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1])
                return arr[mid];
            else if (arr[start] <= arr[end]) // Sorted range
                return arr[start];
            else{ // un-sorted Range
                if(arr[start] <= arr[mid])
                    start = mid+1;
                else
                    end = mid-1;
            }       
        } 
    }
    return end;
}
  
