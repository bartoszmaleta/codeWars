function whoIsPaying(name){
  //your code here
  if (name.length < 2 || name === 'Me') {
    let nameArray = [name];
    return nameArray;
  }

  let firstTwoLetters = name.substring(0, 2);
  let result = [name, firstTwoLetters];
  return result;

}

// SECOND SOLUTION
function whoIsPaying(name) {
    if (name.length <= 2) {
        return [name];
    }
    return [name, name.slice(0, 2)];
}

// THIRD SOLUTION
function whoIsPaying(name) {
    return (name.length > 2) ? ([name, name.substr(0, 2)]) : [name];
}