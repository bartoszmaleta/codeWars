function include(arr, item){
  return arr.indexOf(item) >= 0;
}

// SECOND SOLUTIOcN
const include2 = (arr, item) => arr.indexOf(item) >= 0;

// THIRD SOLUTIOcN
function include3(arr, item){
    return arr.includes(item);
}