// https://course.acciojob.com/idle?question=a48120ce-3cf5-4ea3-bbf1-f8f1deeeaf96

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', n => {
  let triangle = pascalTriangle(parseInt(n));
  for (let i = 0; i < triangle.length; i++) {
    console.log(triangle[i].join(' '));
  }
  readline.close();
});

function pascalTriangle(numRows) {
  const result = [];
    const temp = [];
    temp.push(1); result.push(temp);

    for(let loop=1; loop<numRows; loop++){
        const current = [];
        const l = result[result.length-1];
        current.push(1);

        for(let index=1; index<loop; index++){
            current.push(l[index-1]+ l[index]);
        }

        current.push(1);
        result.push(current);
    }

    return result;
}
