function iceBrickVolume(radius, bottleLength, rimLength) {
  // Your code should be here ;)
  let height = bottleLength - rimLength;
  let width = 2 * radius;
  let length = radius

  let result = height * width * length;
  return result;
}


// SECOND SOLUTION
const iceBrickVolume = (r, x, y) => 2 * r * r * (x - y);