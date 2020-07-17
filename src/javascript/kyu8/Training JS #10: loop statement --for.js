function pickIt(arr) {
    var odd = [], even = [];
    for (let i = 0; i < arr.length; i++) {
        let number = arr[i];
        if (number % 2 !== 0) {
            odd.push(number);
        } else {
            even.push(number);
        }
    }
    return [odd, even];
}

// SECOND SOLUTION
function pickIt2(arr) {
    var odd = [], even = [];
    for (let i = 0; i < arr.length; i++) {
        let number = arr[i];
        (number % 2 !== 0) ? odd.push(number) : even.push(number);
        // ((x % 2) ? odd : even).push(x)       // SHORTER!!!

    }
    return [odd, even];
}

// THIRD SOLUTION
const pickIt3 = arr => {
    return [arr.filter(v => v % 2 !== 0), arr.filter(v => v % 2 === 0)];
}