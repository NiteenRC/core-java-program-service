package basic;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        //printPrimeNumbersJava7();
        printPrimeNumbersJava8();
    }

    private static void printPrimeNumbersJava7() {
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static void printPrimeNumbersJava8() {
        IntStream.range(1, 100).filter(PrimeNumber::isPrime).forEach(System.out::println);
    }

    private static boolean isPrime(int in) {
        for (int i = 2; i <= in / 2; i++) {
            if (in % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrimeJava8(int in) {
        IntPredicate intPredicate = i -> in % i == 0;

        return IntStream.range(2, in / 2)
                .noneMatch(intPredicate);
    }
}
