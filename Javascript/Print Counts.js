// https://course.acciojob.com/idle?question=5fcf3a1e-cb02-41aa-a68a-65b5ae159d1c

const rl = require("readline");

const reader = rl.createInterface({
  input: process.stdin,
  output: process.stdout,
});

reader.on("line", (line) => {
  let str = line;

  //  const A = JSON.parse(str);

  PrintCharFreq(str)
});

function PrintCharFreq(myStr) {
    const storage= new Map();

    for(let letter of myStr){
        if(storage.has(letter)){
            storage.set(letter, storage.get(letter)+1);
        }else{
            storage.set(letter, 1);
        }
    }

    const result = "abcdefghijklmnopqrstuvwxyz";

    // Printing result
    for(let letter of result){
        if(storage.has(letter)){
            console.log(letter+" = "+storage.get(letter));
        }
    }
}
