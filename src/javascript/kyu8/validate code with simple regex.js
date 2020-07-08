function validateCode (code) {
  let fn = code.toString().charAt(0);
  return fn === '1' || fn === '2' || fn === '3' ? true : false;
}

// SECOND SOLUTION
const validateCode = code => code.toString().charAt(0) === '1' || code.toString().charAt(0) === '2' || code.toString().charAt(0) === '3' ? true : false;