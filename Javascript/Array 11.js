// https://course.acciojob.com/idle?question=106c24fb-b071-40c1-aa8e-601f6096409d

const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let input = [];

rl.on('line', (line) => {
  input.push(line);
}).on('close', () => {
  let n = Number(input[0]);
  let arr = input[1].split(' ').map(Number);
  console.log(array11(arr, 0));
});

function array11(nums, index) {
  if(index >= nums.length){
	  return 0; //index out of range
  }

	let count = array11(nums,index+1);

	if(nums[index] == 11){
		count++; //11 found
	}

	return count;
}
