function superSize(num){
    let numStrSorted = num.toString().split('').sort().reverse().join('');
    return parseInt(numStrSorted, 10);
}


// SECOND SOLUTION
function superSize2(num){
    let numStr = num.toString();
    let arrayNumStr = numStr.split('');
    let sorted = arrayNumStr.sort().reverse()

    let numStrSorted = sorted.join('');

    return parseInt(numStrSorted, 10);
}

// THIRD SOLUTION
function superSize(num){
    return +(''+num).split('').sort().reverse().join('');
}

// FOURTH SOLUTION
const superSize = num => +(num+'').split('').sort((a,b)=>b-a).join('')