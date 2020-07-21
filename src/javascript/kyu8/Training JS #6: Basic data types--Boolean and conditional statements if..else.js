function trueOrFalse(val) {
    return val ? true.toString() : false.toString();
}

// SECOND SOLUTION
function trueOrFalse2(val){
    return Boolean(val).toString();
}

// THIRD SOLUTION
function trueOrFalse3(val){
    return !val ? 'false':'true'
}