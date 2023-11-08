// https://course.acciojob.com/idle?question=abd0bef9-8536-4932-9c79-673e8d839463

function findTargetIndex(n, arr, target) {
    // Write your code here
    arr.sort(); // Sort the array

    for(let index=n-1; index>=0; index--){
        if(arr[index] == target) return (n-index)-1;
    }

    return -1; // Element not found
}

const readline = require("readline").createInterface({
    input: process.stdin,
    output: process.stdout
});

let inputArr = [];
let lineNumber = -1;
let n, arr, target;

readline.on("line", line => {
    lineNumber++;

    if (lineNumber === 0) {
        n = parseInt(line);
    }

    if (lineNumber === 1) {
        arr = line.trim().split(" ").map(Number);
    }

    if (lineNumber === 2) {
        target = parseInt(line);
        console.log(findTargetIndex(n, arr, target));
        readline.close();
    }
});
