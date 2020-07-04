
function between(a, b) {
  // your code here
  let arr = [];
  for (let i = a; i <= b; i++) {
    arr.push(i);
    console.log(i);
    console.log(arr);
  }
  console.log(arr);
  return arr;
}

// SECOND SOLUTION
const between = (a, b) => Array.from(new Array(b - a + 1), (_, i) => a + i);