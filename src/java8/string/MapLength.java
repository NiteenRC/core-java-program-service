package java8.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapLength {
    public static void main(String[] args) {
        List<String> stringStream = Arrays.asList("Apple", "Banana", "Coconut");

        Map<Character, String> map1 = stringStream.stream().collect(Collectors.toMap(x -> x.charAt(0), x -> x));
        map1.entrySet().stream()
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        Map<String, Integer> map2 = stringStream.stream().collect(Collectors.toMap(x -> x, x -> x.length()));
        map2.entrySet().stream()
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));


        List<String> stringList = Arrays.asList("Apple", "Banana", "Coconut", "Banana", "Apple", "Apple");
        stringList.stream().
                collect(Collectors.toMap(x -> x.charAt(0), x -> x, (x, y) -> x + "-" + y, LinkedHashMap::new))
                .entrySet().stream()
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

    }
}
