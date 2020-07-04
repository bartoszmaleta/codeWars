function hero(bullets, dragons){
//Get Coding!
  if ((dragons * 2) > bullets) {
    return false;
  }
  return true;
}


// SECOND SOLUTION
function hero(bullets, dragons){
    return ((dragons * 2) > bullets) ? false : true;
}

// THIRD SOLUTION
function hero(bullets, dragons){
  return bullets >= dragons * 2
}