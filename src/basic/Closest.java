package basic;

/**
 * Find the int value that is greater than 9 and closest to 9
 */
public class Closest {
    public static void main(String[] args) {
        int[] arr = {8, 14, 16, 10};
        int min = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i > 9 && min > i) {
                min = i;
            }
        }
        System.out.println(min);
    }
}
