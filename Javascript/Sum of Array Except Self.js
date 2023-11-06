// https://course.acciojob.com/idle?question=3cf411ff-c59c-4202-ae5c-6b0292d31764

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

function sumArrayExceptSelf(nums, n) {
	let sum = 0;

    for(let num of nums) sum+= num;

    const result = [];

    for(let num of nums){
        result.push(sum-num);
    }

    return result;
}

readline.question('', n => {
  let nums = [];
  readline.on('line', num => {
    nums = num.split(' ').map(Number);
      let ans = sumArrayExceptSelf(nums, n);
      console.log(ans.join(' '));
      readline.close();
  });
});
