// https://course.acciojob.com/idle?question=4125e49c-5ff1-4805-8fc1-5844f7290107

function sum_array(arr) {
 // write code here
 // use console.log for displaying the output
    let sum = 0;

    for(let nums of arr){
        for(let num of nums){
            sum += num;
        }
    }

    console.log(sum);
 }

const readline = require('readline');
 const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
  terminal: false
 });
 

 rl.on('line', function(line){
  sum_array(JSON.parse(line))
  })


