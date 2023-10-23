// https://course.acciojob.com/idle?question=c42728ed-c139-4c1f-a968-764051d1b6c1

 function round(num) {
  return Math.round(num);
 }

const rl = require('readline')
 

 const reader = rl.createInterface({
  input: process.stdin,
  output: process.stdout
 })
 

 reader.on('line', (line) => {
  const n=parseFloat(line);

 ///console.log(n)

  
  console.log(round(n));
 

 })
