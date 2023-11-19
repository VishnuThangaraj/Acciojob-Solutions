// https://course.acciojob.com/idle?question=f6f001ea-3a4d-4155-bfe3-0cea7ccf4945

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (t) => {
  t = Number(t);
  let count = 0;
  rl.on('line', (input) => {
    if(count < t) {
      console.log(countWords(input));
      count++;
    }
    if(count === t) {
      rl.close();
    }
  });
});

function countWords(s) {
  let words = 1;

    for(let index=1; index<s.length-1; index++){
        if(s[index-1] != " " && s[index]  == " ")
            words++;
    }

    return words;
}
