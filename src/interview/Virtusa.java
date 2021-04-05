package interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Two's sum equals to given value
 */
public class Virtusa {
    public static void main(String[] args) {
        int[] intArr = {2, 3, 7, 5, 6, 1, 4};
        int target = 7;

        //findSum(intArr, target);

        //return index and value both
        findSumEfficiently(intArr, target);

        //return only values
        //findSumEfficiently1(intArr, target);
    }

    private static void findSum(int[] intArr, int target) {
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (target == (intArr[i] + intArr[j])) {
                    System.out.println(intArr[i] + " " + intArr[j]);
                }
            }
        }
    }

    private static void findSumEfficiently(int[] intArr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < intArr.length; i++) {
            int diffValue = target - intArr[i];
            if (map.containsKey(diffValue)) {
                //System.out.println(map.get(diffValue) + " " + i);
                System.out.println(intArr[i] + " " + diffValue);
            }
            map.put(intArr[i], i);
        }
    }

    private static void findSumEfficiently1(int[] intArr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < intArr.length; i++) {
            int diffValue = target - intArr[i];
            if (set.contains(diffValue)) {
                System.out.println(intArr[i] + " " + diffValue);
            }
            set.add(intArr[i]);
        }
    }
}
