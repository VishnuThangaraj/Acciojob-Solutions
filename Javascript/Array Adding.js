// https://course.acciojob.com/idle?question=a426a64f-8962-4a98-9433-3200d900ad67

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

function calSum(a, b, n, m) {
  // Write your code here
    const result = [];
    let index1 = a.length-1, index2 = b.length-1, reminder = 0;
    const size = Math.max(index1, index2); // loop should run size of max array
    
    for(let loop = 0; loop <= size; loop++){
        let val1 = (index1 >= 0) ? a[index1--] : 0; 
        let val2 = (index2 >= 0) ? b[index2--] : 0; 
        
        let sum = val1 + val2 + reminder;
        reminder = (sum > 9) ? 1 : 0;
        sum %= 10;
        
        result.unshift(sum);
    }

    if(reminder == 1)
        result.unshift(1);

    return result;
}

readline.question('', n1 => {
  readline.question('', arr1 => {
    readline.question('', n2 => {
      readline.question('', arr2 => {
        arr1 = arr1.split(' ').map(Number);
        arr2 = arr2.split(' ').map(Number);
		n1 = parseInt(n1);
		n2 = parseInt(n2);  
        let res = calSum(arr1, arr2, n1, n2);
		  console.log(res.join('\n'));
        readline.close();
      });
    });
  });
});
