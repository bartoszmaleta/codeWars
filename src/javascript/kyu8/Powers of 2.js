function powersOfTwo(n){
    let numbers = [];
    for (let i = 0; i <= n; i++) {
        numbers.push(Math.pow(2, i));
    }
    return numbers;
}

// SECOND SOLUTION
function powersOfTwo2(n) {
    return Array.from({length: n + 1}, (v, k) => 2 ** k);
}

// THIRD SOLUTION
function powersOfTwo3(n) {
    return [...Array(n + 1)].map((_, i) => 2 ** i);
}
