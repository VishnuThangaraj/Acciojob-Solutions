//https://course.acciojob.com/idle?question=079f6ebf-4868-4e4a-b75e-651967ef5ab9

const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let input = [];

rl.on('line', (line) => {
  input.push(line);
});

rl.on('close', () => {
  let [n, key] = input[0].split(' ').map(Number);
  let arr = input[1].split(' ').map(Number);
  findIndex(key, arr);
});

function findIndex(key, arr) {
  //iterate from last
	for(var index = arr.length-1; index >=0; index--){
		if(arr[index]==key){
			//key found
			console.log(index);
			return;
		}
	}
}
