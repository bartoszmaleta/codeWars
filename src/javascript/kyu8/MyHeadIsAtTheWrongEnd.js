function fixTheMeerkat(arr) {
  return arr.reverse();
}

// ANTOHER SOLUTIONs
function fixTheMeerkat(arr) {
  return [arr[2], arr[1], arr[0]];
}


//
const fixTheMeerkat = ([tail, body, head]) => [head, body, tail]

