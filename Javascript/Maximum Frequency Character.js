// https://course.acciojob.com/idle?question=91f4bd09-cfa9-42f9-8b32-9edebcc8cd24

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

function MaximumFrequencyChar(s){
    const storage = new Map();
    let result = 0, count = -1; 

    for(let letter of s){
        if(storage.has(letter)){
            storage.set(letter, storage.get(letter)+1);
        }else{
            storage.set(letter, 1);
        }
    }

    // Find the max
    const alphabet = "abcdefghijklmnopqrstuvwxyz";

    for(let letter of alphabet){
        if(storage.has(letter)){
            if(storage.get(letter) > count){
                count = storage.get(letter);
                result = letter;
            }
        }
    }

    return result;
}

readline.question('', s => {
  console.log(MaximumFrequencyChar(s));
  readline.close();
});
