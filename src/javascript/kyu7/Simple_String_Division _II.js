function solve(s,k) {
    s=s.split(' ')
    let x=0;
    for (let i=0;i<s.length;i++){
        for (let j=0;j<s.length;j++){
          if (i===j){}
          else if ((s[i]+s[j])%k===0){x++}
        }
      }
      return x
}