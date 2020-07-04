
function removeChar(str){
 //You got this!
  str = str.substring(1);
  str = str.substring(0, str.length - 1);
  return str;

};


// SECOND SOLUTION
function removeChar(str) {
    return str.slice(1, -1);
}