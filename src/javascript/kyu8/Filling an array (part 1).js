const arr = n => (n ? [...new Array(n).keys()] : []);




// SECOND SOLUTION
function arr(n){
  var newArr = [];
  for(var i = 0; i < n; i++){
    newArr.push(i);
  }
  return newArr;
}