// https://course.acciojob.com/idle?question=bc347fe3-12c2-422c-a8d8-45276cf09e32

var readline = require("readline").createInterface(process.stdin);

let inputArr = [];
var lineNumber = -1;

readline.on("line", readInputs);

function readInputs(line) {
  inputArr.push(line);
  lineNumber++;
  
  if (lineNumber == 0) {
   
   letter=inputArr[0];
   
  }
  
  if(lineNumber==0)
  {logic("s");
  readline.close();}
}

function logic(input) {
 

    let n = parseInt(inputArr[0].split(' ')[0]);
	
    let m = parseInt(inputArr[0].split(' ')[1]);

 (switchCase3(n, m));
  
}


function switchCase3(a, b) {
	 switch(a%b){
		 case 0:
			 console.log("Remainder is too small");
			 break;
		case 1:
			 console.log("Remainder is small");
			 break;
		case 2:
			 console.log("Remainder is large");
			 break;
		 default:
			 console.log("Remainder is too large");
	 }
}
