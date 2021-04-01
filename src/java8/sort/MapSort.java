package java8.sort;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapSort {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("b", 4);
        map.put("a", 3);
        map.put("z", 1);

        Comparator<Map.Entry<String, Integer>> comparator = (o1, o2) -> o1.getValue().compareTo(o2.getValue());

        System.out.println("Comparing Manually");
        map.entrySet().stream()
                .sorted(comparator)
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        System.out.println("Comparing by key");
        map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        System.out.println("Comparing by value");
        map.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
    }
}
