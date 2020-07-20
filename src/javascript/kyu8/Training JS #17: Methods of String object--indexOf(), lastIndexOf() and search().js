function firstToLast(str,c){
    return str.lastIndexOf(c) === -1 ? -1 : str.lastIndexOf(c) - str.indexOf(c);
}

// SECOND SOLUTION
const firstToLast2 = (str, c) => str.lastIndexOf(c) === -1 ? -1 : str.lastIndexOf(c) - str.indexOf(c)