package Java8Feature2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Q4 {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(null, 2,3,4,5);
        Optional<Integer> product = ls.stream().map(x -> Optional.ofNullable(x).orElse(1)).reduce((a,b) -> a * b);
        System.out.println(product.get());
    }
}
