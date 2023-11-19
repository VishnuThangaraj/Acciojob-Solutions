// https://course.acciojob.com/idle?question=fa562213-5799-4908-b7c2-e3eaccc837a9

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

function hey(str) {
  let result = "";

    for(let letter of str){
        if(letter == "e") result+="ee";
    }

    return "h"+result+"y";
}

readline.question('', str => {
  let result = hey(str);
  console.log(result);
  readline.close();
});
