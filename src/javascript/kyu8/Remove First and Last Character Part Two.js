function array(arr){
  let word = arr;
  let words = word.split(',')

    if (words.length < 3) {
    return null;
  }

  words.shift();
  words.pop();
  let wordsString = words.join(" ");
  return wordsString;
}

// SECOND SOLUTION
function array(arr){
    return arr.split(",").slice(1, -1).join(" ") || null;
}

// THIRD SOLUTION
function array(arr){
    let data = arr.split(',');
    data.pop();
    data.shift();
    return data.length ? data.join(' ') : null;
}