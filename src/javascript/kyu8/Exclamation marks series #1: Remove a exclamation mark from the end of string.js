function remove(s){
    if (s.charAt(s.length - 1) === '!') {
        s = s.substring(0, s.length - 1);
        return s;
    }
    return s;
}

// SECOND SOLUTION
function remove(s){
    return (s.charAt(s.length - 1) === '!' ? s.substring(0, s.length - 1) : s);
}