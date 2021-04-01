package java8;

import java.util.stream.IntStream;

public class RandomNumber {
    public static void main(String[] args) {
        getRandomNumberFirstWay(100, 200);
        getRandomNumberSecondWay(100, 200);
    }

    public static void getRandomNumberFirstWay(int min, int max) {
        for (int i = 0; i < 5; i++) {
            System.out.println((int) Math.floor(Math.random() * (max - min + 1)) + min);
        }
    }

    public static void getRandomNumberSecondWay(int min, int max) {
        IntStream.generate(() -> {
            return (int) (Math.random() * (max - min) + min);
        }).limit(5).forEach(System.out::println);
    }
}
