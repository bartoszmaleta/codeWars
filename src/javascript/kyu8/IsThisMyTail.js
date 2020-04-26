function correctTail(body, tail) {
  var bodylength = body.length;


  sub = body.substr(bodylength-(tail.length))

  if (sub == tail) {
    return true;
  }
  else {
    return false;
 }
};



function correctTail(bod, tail) {
  return bod[bod.length-1] === tail
}



const correctTail = (body, tail) => body.slice(-1) === tail[0]