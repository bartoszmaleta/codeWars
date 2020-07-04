function numberToPower(number, power){
  // Code here
  let result = number;
  if (power === 0) {
    return 1;
  }

  for (i = 1; i < power; i++) {
    result = result * number;
    console.log(result);
  }
  console.log(result);

  return result;
}

// SECOND SOLUTION
function numberToPower(number, power){
  var total = 1;
  for (var i = 1; i <= power; i++) {
    total = total * number;
  }
  return total;
}

// THIRD SOLUTION
const numberToPower = (number, power) => power > 0 ? number * numberToPower(number, power - 1) : 1;