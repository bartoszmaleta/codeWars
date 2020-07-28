function howManyDalmatians(number) {
    let dogs = ['Hardly any', 'More than a handful!', "Woah that's a lot of dogs!", "101 DALMATIANS!!!"];
    return respond = number <= 10 ? dogs[0] : number <= 50 ? dogs[1] : number > 100 ? dogs[3] : dogs[2];
}

// SECOND SOLUTION
const dogs = ["Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIANS!!!"];
const howManyDalmatians2 = number  => number <= 10 ? dogs[0] : (number <= 50 ? dogs[1] : (number == 101 ? dogs[3] : dogs[2]));

// THIRD SOLUTION
howManyDalmatians3 = n => n <= 10 ? "Hardly any" : n <= 50 ? "More than a handful!" : n == 101 ? "101 DALMATIANS!!!" : "Woah that's a lot of dogs!"
