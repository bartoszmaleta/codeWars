package javaExe.kyu7;

import java.util.*;

public class DifferenceBetweenTwoCollections {
    public static List<Character> diff(Collection<Character> a, Collection<Character> b) {
        Set<Character> aSet = new HashSet<>(a);
        Set<Character> bSet = new HashSet<>(b);

        Set<Character> intersection = new HashSet<>(aSet);
        intersection.retainAll(bSet);

        Set<Character> union = new HashSet<>(aSet);
        union.addAll(bSet);

        Set<Character> symmetricDifference = new HashSet<>(union);
        symmetricDifference.removeAll(intersection);

        List<Character> result = new ArrayList<>(symmetricDifference);
        result.sort(Character::compareTo);

        return result;
    }

}
