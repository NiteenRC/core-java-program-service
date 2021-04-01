package java8.string;

import java.util.Arrays;

public class Reduce {
    public static void main(String[] args) {
        String str = "abcd";

        System.out.println("Reverse a String");
        String reversed = str.chars()
                .mapToObj(x -> (char) x)
                .reduce("", (x, y) -> y + x, (a, b) -> a + b);
        System.out.println(reversed);

        System.out.println("Concat a  string");
        String[] strArr = {"abc", "xyz", "qwe"};
        Arrays.stream(strArr)
                .reduce((x, y) -> x + "-" + y)
                .ifPresent(System.out::println);

        int[] arr = {1, 2, 8, 6};
        System.out.println("Sum of array integers");
        Arrays.stream(arr)
                .boxed()
                //.mapToObj(Integer::valueOf)   //alternative to boxed
                .reduce(Integer::sum)   //method reference
                //.reduce((x, y) -> x + y)
                .ifPresent(System.out::println);

        System.out.println("Max integer in arr");
        Arrays.stream(arr)
                .boxed()
                .reduce(Integer::max)
                //.reduce(Integer::min)
                //.reduce((x, y) -> x > y ? x : y)    //Max value
                //.reduce((x, y) -> x > y ? y : x)  //Min value
                .ifPresent(System.out::println);
    }
}
