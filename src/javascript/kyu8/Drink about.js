function peopleWithAgeDrink(old) {
    return old >= 21 ? 'drink whisky' : old >= 18 ? 'drink beer' : old >= 14 ? 'drink coke' : old <= 13  ? 'drink toddy' : '';
}

// SECOND SOLUTION
const peopleWithAgeDrink2 = old => 'drink ' + (old < 14 ? 'toddy' : old < 18 ? 'coke' : old < 21 ? 'beer' : 'whisky');