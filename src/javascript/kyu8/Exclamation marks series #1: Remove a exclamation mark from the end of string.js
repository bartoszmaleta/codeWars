function remove(s) {
    let words = s.split(' ');
    words[words.length - 1].replace('!', '');
    let lastWord = words[words.length - 1];
    let newLastWord = '';

    lastWord.charAt(0) === '!' ? newLastWord += '!' : '';

    for (let i = 0; i < lastWord.length; i++) {
        lastWord.charAt(i) === '!' ? newLastWord += '' : newLastWord += lastWord.charAt(i);
    }
    words.pop();
    words.push(newLastWord);
    return words.join(' ');
}

// SECOND SOLUTION
const remove = s => s.replace(/!+$/, '');

// THIRD SOLUTION
function remove(s){
    return s.replace(/!+$/, '');
}

// FOURTH SOLUTION
function remove(s)
{
    while(s && s.slice(-1) == "!")
    {
        s = s.slice(0,-1)
    }
    return s;
}

// FIFTH SOLUTION
function remove(s){
    for (var i = 0; s.endsWith("!"); i++) {
        s.endsWith("!") ? s = s.slice(0 , -1) : s;
    }
    return s;
}