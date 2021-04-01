package interview;

public class Nous {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8, 11, 13};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = j; k < arr.length - 1; k++) {
                    if (arr[i] == (arr[j] + arr[k]) && j != k) {
                        System.out.println(arr[i] + "==>" + arr[j] + " + " + arr[k]);
                    }
                }
            }
        }
    }
}
