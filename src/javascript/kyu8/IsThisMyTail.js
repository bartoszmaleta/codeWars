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