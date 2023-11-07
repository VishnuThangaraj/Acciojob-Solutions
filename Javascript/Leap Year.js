// https://course.acciojob.com/idle?question=2c8693a8-885f-4c9b-9191-8faaf9ff9913

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', year => {
  //Write your code here and print the required output
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        console.log(1);
    }else{
        console.log(0);
    }

  readline.close();
});
