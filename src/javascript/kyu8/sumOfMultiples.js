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