package basic;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(1, 15);
    }

    private static void fizzBuzz(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
