function problem(x){
  //your code here
  if (typeof x === 'string' || x instanceof String) {
    return 'Error';
  } else {
    let result = (x * 50) + 6;
    return result;
  }
}