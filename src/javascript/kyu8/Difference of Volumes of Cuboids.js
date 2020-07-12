function findDifference(a, b) {
    return Math.abs(Math.abs(a.reduce( (x,y) => x * y, 1)) - Math.abs(b.reduce( (x,y) => x * y, 1)));
}