var quote = function(fighter) {
    // your code here
    let fl = fighter.charAt(0);
    if (fl === 'C' || fl === 'c') {
        return "I'd like to take this chance to apologize.. To absolutely NOBODY!"
    } else {
        return "I am not impressed by your performance."
    }
};

var quote = function(fighter) {
    return fighter.charAt(0).toUpperCase() === 'C' ? "I'd like to take this chance to apologize.. To absolutely NOBODY!" : "I am not impressed by your performance.";
};

const quote = fighter => fighter.toLowerCase() === 'conor mcgregor' ? "I'd like to take this chance to apologize.. To absolutely NOBODY!" : "I am not impressed by your performance."