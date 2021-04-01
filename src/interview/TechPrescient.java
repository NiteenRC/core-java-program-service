package interview;

public class TechPrescient {
    public static void main(String[] args) {
        // Find last 1 and count upto first element
        findPos(11000);

        // Find difference from second array
        findDifference();
    }

    private static void findDifference() {
        int[] a = {5, 3, 4, 2, 1};
        int[] b = {4, 3, 5, 1};

        for (int i : a) {
            int count = 0;
            for (int j : b) {
                if (i == j) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
            count = 0;
        }
    }

    private static void findPos(int i) {
        int count = 0;
        boolean flag = false;
        while (i > 0) {

            if (i % 10 == 1) {
                flag = true;
            }

            if (flag) {
                count++;
            }

            i = i / 10;
        }
        System.out.println(count);
    }
}
