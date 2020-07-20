function lowercaseCount(str){
    let counter = 0;
    for (let i = 0; i < str.length; i++) {
        isLower(str.charAt(i)) ? counter++ : '';
    }
    return counter;
}

function isLower(character) {
    return (character === character.toLowerCase()) && (character !== character.toUpperCase());
}

// SECOND SOLUTION
function lowercaseCount(str) {
    return (str.match(/[a-z]/g) || []).length;
}

// THIRD SOLUTION
const lowerCaseCount = (str) => (str.match(/[a-z]/g) || []).length;
