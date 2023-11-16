// https://course.acciojob.com/idle?question=6f187f0f-b5dc-43b5-982a-2658b6d75297

function StringSum(str){
  //return string Sum
    let sum = 0;
  for(let num of str){
      sum += parseInt(num);
  }
    return sum;
}


const rl = require('readline')
const reader = rl.createInterface({
  input: process.stdin,
  output: process.stdout
})
reader.on('line',(line)=>{
  let str = line;
  str=str.trim();
  console.log(StringSum(str));
})

