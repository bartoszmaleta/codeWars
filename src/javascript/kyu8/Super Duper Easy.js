function problem(x){
  //your code here
  if (typeof x === 'string' || x instanceof String) {
    return 'Error';
  } else {
    let result = (x * 50) + 6;
    return result;
  }
}

// SECOND SOLUTION
const problem = x => typeof x === 'string' ? 'Error' : x * 50 + 6;

// THIRD SOLUTION
function problem(x){
  return typeof x === "number" ? x * 50 + 6 : "Error";
}