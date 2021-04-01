package interview;

public class Altimetrik {
    public static void main(String[] args) {
        distinct("niteen");//output: nite

    }

    private static void distinct(String str) {
        if (str == null) {
            throw new RuntimeException("Should not be null");
        }
        str.chars().mapToObj(x -> (char) x).distinct().forEach(System.out::print);
    }
}