function countWords(str) {
  return str.trim() === '' ? 0 : str.trim().split(/[\s]+/g).length;
}

// SECOND SOLUTION
const countWords = str => (str.trim() === '' ? 0 : str.trim().split(/[\s]+/g).length);