package basic;

public class Fibonacci {
    public static void main(String[] args) {
        //byForLoop();

        for (int i = 0; i < 15; i++) {
            System.out.println(byRecursive(i));
        }
    }

    private static int byRecursive(int i) {
        if (i <= 1) {
            return 1;
        }
        return byRecursive(i - 1) + byRecursive(i - 2);
    }

    private static void byForLoop() {
        int a = 1, b = 1, c = 1;

        for (int i = 0; i < 15; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
