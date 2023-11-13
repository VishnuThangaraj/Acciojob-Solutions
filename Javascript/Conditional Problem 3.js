// https://course.acciojob.com/idle?question=fa2265ac-6e4a-480f-b428-5056768d05f0

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', n => {
  // write code here
    if(n > 1)
        console.log("You entered more");
    else
        console.log("You entered less");
  readline.close();
});
