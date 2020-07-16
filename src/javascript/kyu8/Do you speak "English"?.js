const spEng = sentence => /english/gi.test(sentence);

// SECOND SOLUTION
function spEng2(sentence){
    let sentenceLower = sentence.toLowerCase();
    return sentenceLower.includes('english');
}

// THIRD SOLUTION
function spEng3(s){
    return /english/i.test(s);
}