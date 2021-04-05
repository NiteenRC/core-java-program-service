package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        //System.out.println("Current Local Time: " + java.time.LocalTime.now());

        List<String> list = Arrays.asList("Amit", "Niteen", "Charu", "Abhijit");

        List<String> sorted = list.stream().sorted().collect(Collectors.toList());//.forEach(System.out::println);

        for (String str : sorted) {

        }
    }
}
