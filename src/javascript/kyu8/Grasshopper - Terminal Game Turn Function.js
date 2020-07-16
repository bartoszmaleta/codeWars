
function doTurn () {
    rollDice();
    move();
    combat();
    getCoins();
    buyHealth();
    printStatus();

}

// SECOND SOLUTION
function doTurn () {
    var actions = [rollDice, move, combat, getCoins, buyHealth, printStatus];
    actions.forEach(e => e());
}
