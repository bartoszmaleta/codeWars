function colorOf(r,g,b){
    r = r.toString(16);
    g = g.toString(16);
    b = b.toString(16);

  if (r === '0') {
    r = r + '0';
  }
  if (g === '0') {
    g = g + '0';
  }
  if (b === "0") {
    b = b + '0';
  }

  if (r < 10 && r > 0) {
    r = '0' + r;
  }
  if (g < 10 && g > 0) {
    g = '0' + g;
  }
  if (b < 10 && b > 0) {
    b = '0' + b;
  }

  if (parseInt(r, 16) < 16 && parseInt(r, 16) > 10) {
    r = '0' + r;
  }
  if (parseInt(g, 16) < 16 && parseInt(g, 16) > 10) {
    g = '0' + g;
  }
  if (parseInt(b, 16) < 16 && parseInt(b, 16) > 10) {
    b = '0' + b;
  }

  return '#'.concat(r, g, b);
}

// SECOND SOLUTION
function colorOf(r,g,b){
  r.toString(16).length < 2 ? r = '0' + r.toString(16) : r = r.toString(16);
  g.toString(16).length < 2 ? g = '0' + g.toString(16) : g = g.toString(16);
  b.toString(16).length < 2 ? b = '0' + b.toString(16) : b = b.toString(16);

  return '#' + r + g + b;
}

// THIRD SOLUTION
function colorOf(r, g, b) {
  let R = r.toString(16)
  let G = g.toString(16)
  let B = b.toString(16)

  if (r < 16) R = '0' + R
  if (g < 16) G = '0' + G
  if (b < 16) B = '0' + B

  return '#' + R + G + B
}