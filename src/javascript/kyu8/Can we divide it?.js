function isDivideBy(number, a, b) {
    return (number % a === 0) && (number % b === 0);
}

// SECOND SOLUTION
const isDivideBy = (number, a, b) => number % a === 0 && number % b === 0;