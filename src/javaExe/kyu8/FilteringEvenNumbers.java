package javaExe.kyu8;

import java.util.ArrayList;
import java.util.List;

public class FilteringEvenNumbers {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) % 2 == 0) {
                listOfNumbers.remove(i);
                i = 0;
            }
        }
        return listOfNumbers;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        System.out.println("numbers = " + numbers);
        List<Integer> numbersFiltered = filterOddNumber(numbers);
    }
}
