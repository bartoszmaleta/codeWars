function howMuchWater(water, load, clothes) {
    if (clothes > load * 2) {
        return 'too much clothes';
    }
    if (clothes < load) {
        return 'Not enough clothes';
    }

    return +(water * Math.pow(1.1, Math.abs(load - clothes))).toFixed(2);

}

// SECOND SOLUTION
function howMuchWater2(water, load, clothes) {
    return (clothes > load * 2) ? 'Too much clothes' : (clothes < load) ? 'Not enough clothes' : +(water * Math.pow(1.1, Math.abs(load - clothes))).toFixed(2);
}

// THIRD SOLUTION
howMuchWater3 = (L,X,N) => N > 2 * X ? "Too much clothes" : N < X ? "Not enough clothes" : +(L * 1.1 ** (N - X)).toFixed(2);
