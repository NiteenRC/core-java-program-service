package java8.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Coconut", "Banana", "Apple", "Apple");

        Optional<String> optional = list.stream()
                .filter(x -> x.equals("Bananaa"))
                .findAny();

        if (optional.isPresent()) {
            System.out.println(optional.get());
        }

        optional.ifPresent(x -> x.length());
    }
}
