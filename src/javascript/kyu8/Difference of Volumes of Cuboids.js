function findDifference(a, b) {
    return Math.abs(Math.abs(a.reduce((previous, current) => previous * current, 1)) - Math.abs(b.reduce((previous, current) => previous * current, 1)));
}