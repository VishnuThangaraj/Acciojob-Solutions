// https://course.acciojob.com/idle?question=db0d2d11-15bb-47e7-9315-fd7c67c2bbb4

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

function lowerUpper(ch) {
  // check if upperCase
    if(ch == ch.toUpperCase()){
        return "U";
    }
    return "L";
}

readline.question('', (ch) => {
  console.log(lowerUpper(ch));
  readline.close();
});
