// https://course.acciojob.com/idle?question=c50068f5-2c4c-4d0d-a803-c781896636d1

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;
var inputSize;
var K;
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
    console.log(MergeSort(N, Arr).join(" ").trim());
  }
}

function SortIt(arr, start, mid, end){
    let firstPointer = start; //pointing start of first half
    let secondPointer = mid+1; //pointing start of second half
    // create new array
    const newArr= [];

    while(firstPointer <= mid && secondPointer <=end){
        if(arr[firstPointer]<arr[secondPointer]){ //if first half element is smaller add to new array
            newArr.push(arr[firstPointer++]);
        }else{ // if second half element is smaller add to new array
            newArr.push(arr[secondPointer++]);
        }
    }
    // if there is any balance unadded element in first half will be added now else skip
    while(firstPointer<=mid){
        newArr.push(arr[firstPointer++]);
    }
    //if there is any balance unadded element in second half will be added now else skip
    while(secondPointer<=end){
        newArr.push(arr[secondPointer++]);
    }
    //add the sorted elements of the range in default array
    for(let add=0;add<newArr.length;add++){
        arr[start+add]=newArr[add];
    }
}

function mergeIt(arr, start, end){
    if(start==end){
			return; // return if its single element
		}
     let mid = Math.floor((start+end)/2); //find the mid element to seperate into two parts

    mergeIt(arr,start,mid); //first half
    mergeIt(arr,mid+1,end); //second half

    SortIt(arr,start,mid,end); // sort the part
}
 

const MergeSort = (N, Arr) => {
  // your code here
  //do not console.log here return the array(sorted)
    // MergeSort using recursion
    mergeIt(Arr, 0, N);

    return Arr;
};

