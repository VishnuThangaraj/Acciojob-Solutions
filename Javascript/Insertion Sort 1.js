// https://course.acciojob.com/idle?question=757b5de7-d2dd-4e4d-bee5-13de2526d9d1

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', n => {
  readline.question('', a => {
    a = a.split(' ').map(Number);
    insertionSort1(a, parseInt(n));
    readline.close();
  });
});

function insertionSort1(a, n) {
  for(let i=1; i<n; i++){
      let key = a[i];
      let j = i-1;

      while(j>=0 && a[j]>key){
          a[j+1] = a[j];
          j--;
          // Print the array
          console.log(...a);
      }
      a[j+1] = key;
  }
    // Print the array
    console.log(...a);
}
