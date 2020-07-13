function arrayMadness(a, b) {
    return  a.reduce((previous, current) => previous + Math.pow(current, 2), 0) > b.reduce((previous, current) => previous + Math.pow(current, 3), 0);
}


// HELPER
function arrayMadness2(a, b) {
    const aSum = Math.abs(a.reduce((previous, current) => previous + Math.pow((current), 2), 1));
    console.log('aSum = ' + aSum);

    const bSum = Math.abs(b.reduce((previous, current) => previous + current, 1));
    console.log('bSum = ' + bSum);

    console.log('square = ' + Math.pow(a[2]));


    const aSum2 =   a.reduce((x, y) => x + Math.pow(y, 2), 0);
    console.log('aSum2 = ' + aSum2);

    const bSum2 =   b.reduce((x, y) => x + Math.pow(y, 3), 0);
    console.log('bSum2 = ' + bSum2);

    let resultA = 0;
    for (let i = 0; i < a.length; i++) {
        resultA += Math.pow(a[i], 2);
    }
    console.log('resultA = ' + resultA);

    let resultB = 0;
    for (let i = 0; i < b.length; i++) {
        resultB += Math.pow(b[i], 2);
    }
    console.log('resultB = ' + resultB);


    if (resultA > resultB) {
        return true;
    }


    return false;
}

// SECOND SOLUTION
const arrayMadness3 = (a, b) => a.reduce((acc, x) => acc + x**2, 0) > b.reduce((acc, x) => acc + x**3, 0)
