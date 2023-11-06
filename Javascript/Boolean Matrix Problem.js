// https://course.acciojob.com/idle?question=280b0fc0-6c4d-4aae-9364-5044e0e9bbce

const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

readline.question('', m_n => {
  const [m, n] = m_n.split(' ').map(Number);
  let mat = [];
  let count = 0;
  readline.on('line', line => {
    mat.push(line.split(' ').map(Number));
    count++;
    if(count === m) {
      let ans = BooleanMatrixProblem(m, n, mat);
      for(let i = 0; i < m; ++i) {
        console.log(ans[i].join(' '));
      }
      readline.close();
    }
  });
});

// Function to change the row to 1
function changeRow(row, size, mat){
    
    for(let col=0; col<size; col++)
        mat[row][col] = 1;
}

function BooleanMatrixProblem(m, n, mat) {
  
	for(let row =0; row<m; row++){
        for(let col=0; col<n; col++){
            if(mat[row][col] == 1){
                changeRow(row, n, mat);
                break;
            }
        }
    }

    return mat;
}
