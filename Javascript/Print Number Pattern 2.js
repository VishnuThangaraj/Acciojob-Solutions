// https://course.acciojob.com/idle?question=8e5ac095-1d55-41cc-aaa7-75f2c24f953a

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (n) => {

    for(let loop=1; loop <= n; loop++){
        let result = "";
        for(let num=loop; num>=1; num--){
            result += num;
        }
        // Printing
        console.log(result);
    }
  rl.close();
});
