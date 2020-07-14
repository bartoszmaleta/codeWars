function sc(floor){
    let result = '';
    if (floor <= 1) return '';
    if (floor < 7) {
        for(let i = 0; i < floor - 1; i++) {
            result += 'Aa~ ';
        }
        return result + 'Pa! Aa!';
    }
    if (floor > 6) {
        for (let i = 0; i < floor - 1; i++) {
            result += 'Aa~ ';

        }
        return result + 'Pa!';
    }
}

// SECOND SOLUTION
function sc2(floor) {
    if (floor <= 1) return '';
    return 'Aa~ '.repeat(floor - 1) + 'Pa!' + (floor <= 6 ? ' Aa!' : '');
}