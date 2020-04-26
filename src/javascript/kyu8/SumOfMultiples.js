function sumMul(n,m){
//your idea here
    if (n >= m) {
      return 'INVALID';
    }

    var result = 0;
    var numberToAdd = n;
    while (n < m) {
      result +=n;
//       console.log(n);
      n += numberToAdd;
    }

    return result;
}

// ANTOHER SOLUTIONs
function sumMul(n,m){
  if (n >= m) return "INVALID";

var sum = 0;
  for (var i = n; i < m; i+=n) {
    sum += i;
  }
  return sum;
}

//

function sumMul(n,m){
  return m<=n ? "INVALID" : Math.floor(m/n)*(Math.floor(m/n)+1)*(n/2);
}