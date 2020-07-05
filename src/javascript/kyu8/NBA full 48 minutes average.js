function pointsPer48(ppg, mpg) {
  if (ppg === 0 || mpg === 0) {
    return 0;
  }
//   let result = ((48 * ppg) / mpg);
//   console.log(result);
//   result = result.toFixed(1);
//   console.log(result);
//   return parseFloat(result);
  return parseFloat(((48 * ppg) / mpg).toFixed(1));
}

// SECOND SOLUTION
const pointsPer48 = (ppg, mpg) => ? +(ppg * 48 / mpg).toFixed(1) : 0;


// THIRD SOLUTION
function pointsPer48(ppg, mpg) {
    return +(ppg / mpg * 48).toFixed(1) || 0;
}