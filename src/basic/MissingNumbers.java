package basic;

public class MissingNumbers {
    public static void main(String[] args) {
        int[] input = {1, 1, 2, 3, 5, 5, 7, 9, 9, 9};
        int[] register = new int[100];

        for (int i : input) {
            register[i] = 1;
        }
        for (int i = 1; i < input.length; i++) {
            if (register[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
