function preFizz(n) {
    let arr = [];
    for (let i = 1; i <= n; i++) {
        arr.push(i);
    }
    return arr;

}

// SECOND SOLUTION
const preFizz2 = n => Array.from({length: n}, (_, i) => i + 1)

// THIRD SOLUTION
let preFizz3 = n => [...Array(n)].map((x, i) => i + 1);