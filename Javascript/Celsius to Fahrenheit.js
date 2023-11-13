// https://course.acciojob.com/idle?question=6d435b0a-c2ab-4beb-b476-e311ee9bffdf

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', tempInCelsius => {
  //Write your code here and print the required output
    console.log((tempInCelsius*(9/5))+32); // (C* (9/5)) + 32 = F
  readline.close();
});
