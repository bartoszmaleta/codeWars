function solution(a, b){
  // your code here
  let shorter;
  let longer;
  if (a.length > b.length) {
    longer = a;
    shorter = b;
  } else {
    longer = b;
    shorter = a;
  }

  return shorter + longer + shorter;
}


function solution(a, b){
  return (a.length > b.length) ? b + a + b : a + b + a;
}