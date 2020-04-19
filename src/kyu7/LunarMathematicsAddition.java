package kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LunarMathematicsAddition {
    public static long add(long number1, long number2)
    {
        List<Integer> resultListInteger = new ArrayList<>();

        String number1String = String.valueOf(number1);
        String number2String = String.valueOf(number2);

        String[] number1Array = number1String.split("");
        List<String> number1ListString = new ArrayList<>();
        number1ListString = Arrays.asList(number1Array);

        String[] number2Array = number2String.split("");
        List<String> number2ListString = new ArrayList<>();
        number2ListString = Arrays.asList(number2Array);

        List<Integer> number1ListInteger = new ArrayList<>();
        List<Integer> number2ListInteger = new ArrayList<>();

        for (String str : number1ListString) {
            Integer number = Integer.parseInt(str);
            number1ListInteger.add(number);
        }


        for (String str : number2ListString) {
            Integer number = Integer.parseInt(str);
            number2ListInteger.add(number);
        }

        System.out.println("number 1 list string " + number1ListString);
        System.out.println("number 2 list string " + number2ListString);


        System.out.println("number 1 list integer " + number1ListInteger);
        System.out.println("number 2 list integer " + number2ListInteger);

        Iterator<Integer> iteratorNumber1 = number1ListInteger.iterator();
        Iterator<Integer> iteratorNumber2 = number2ListInteger.iterator();

//        int counter = 0;
//        while (counter < number2ListInteger.size()) {
//            int numberOfNumber1List = number1ListInteger.get(counter);
//            int numberOfNumber2List = number2ListInteger.get(counter);
//
//            if (numberOfNumber2List < numberOfNumber1List) {
//                resultListInteger.add(numberOfNumber1List);
//            } else {
//                resultListInteger.add(numberOfNumber2List);
//            }
//        }

        for (int i = 0; i < number2ListInteger.size(); i++) {
            int numberOfNumber1List = number1ListInteger.get(i);
            int numberOfNumber2List = number2ListInteger.get(i);

            System.out.println(numberOfNumber1List);
            System.out.println(numberOfNumber2List);

            if (numberOfNumber2List < numberOfNumber1List) {
                resultListInteger.add(numberOfNumber1List);
            } else {
                resultListInteger.add(numberOfNumber2List);
            }
        }



//        while(iteratorNumber2.hasNext()) {
//            System.out.println("iterator number2 = " + iteratorNumber2.next());
//            System.out.println("iterator number1 = " + iteratorNumber1.next());
//
//            if (iteratorNumber2.next() < iteratorNumber1.next()) {
//                resultListInteger.add(iteratorNumber1.next());
//            } else {
//                resultListInteger.add(iteratorNumber2.next());
//            }
//        }

        System.out.println("result list integer = " + resultListInteger);





        /* The moon people believe in you. */
        return -1;
    }

    public static void main(String[] args) {
        add(322, 410);
    }
}

//https://www.codewars.com/kata/5c4b5f06b1fd9b3fec8cb03e/train/java         // this one here
//https://www.codewars.com/kata/56f7493f5d7c12d1690000b6/train/java
//        https://www.codewars.com/kata/56f3a1e899b386da78000732/train/java