package java8.string;

public class Distinct {
    public static void main(String[] args) {
        String str = "niteen"; //nite
        str.chars().mapToObj(x -> (char) x).distinct().forEach(System.out::print);
    }
}