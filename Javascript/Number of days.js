// https://course.acciojob.com/idle?question=5d72d915-1e0a-48f9-a537-29a99f6e0cb1

 function NumberofDays(m) {

     if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
         return 31;
     }else if(m ==2){ // feb
         return 28;
     }else{
         return 30;
     }
  
 }

const rl = require('readline')
 

 const reader = rl.createInterface({
  input: process.stdin,
  output: process.stdout
 })
 

 reader.on('line', (line) => {
  //const [a, b,c] = line.split(" ")
 const m=parseInt(line);

 

  
  console.log(NumberofDays(m));
 

 })

