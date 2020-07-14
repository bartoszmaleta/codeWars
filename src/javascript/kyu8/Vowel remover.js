function shortcut(string) {
    let result = '';
    for (let i = 0; i < string.length; i++) {
        (string.charAt(i) === string.charAt(i).toLowerCase() && isVowel(string.charAt(i))) ? result += '' : result += string.charAt(i);
    }
    return result;
}

function isVowel(str) { return /[aeiou]/.test(str); }

// return string.replace(/[aeiou]/gi, '');


// SECOND SOLUTION
function shortcut(string){
    return string.replace(/[aeiou]/gi, '');
}

// THIRD SOLUTION
function shortcut(string){
    return string.replace(/[aeiou]/g,'')
}