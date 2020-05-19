package java.kyu7.twoFightersAndOneWinnerOOP;

public class Kata {
    // public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        // if (!fighter1.name.equals(firstAttacker)) {
            // return declareWinner(fighter1, fighter2, firstAttacker);
        // }
// 
        // fighter2.health -= fighter1.damagePerAttack;
        // if (fighter2.health <= 0) {
            // return firstAttacker;
        // }
        // return declareWinner(fighter1, fighter2, firstAttacker);
    // }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        boolean turn1 = true;
        if (firstAttacker.equals(fighter1.name)) {
            turn1 = true;
        } else {
            turn1 = false;
        }
        
        // ONE LINE VALIDATION!!!!!
        // boolean turn1 = fighter1.name == firstAttacker;
        System.out.println(turn1);
		while (true) {
			if (turn1) {
				fighter2.health -= fighter1.damagePerAttack;
				if (fighter2.health <= 0)
				return fighter1.name;
			} else {
				fighter1.health -= fighter2.damagePerAttack;
				if (fighter1.health <= 0)
					return fighter2.name;
			}
			turn1 = !turn1;
		}
	}

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Bartosz", 20, 5);
        Fighter fighter2 = new Fighter("John", 4, 5);

        System.out.println(declareWinner(fighter1, fighter2, "John"));
    }
}