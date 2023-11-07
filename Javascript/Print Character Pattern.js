// https://course.acciojob.com/idle?question=687fa3e9-43fd-4000-8e0d-71330c8742e1

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', n => {
  // Write your code here
    const alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    for(let loop=1; loop<=n; loop++){
        let result = "";
        for(let j=0; j<loop; j++){
            result += alpha[loop-1];
        }
        console.log(result);
    }
  readline.close();
});
