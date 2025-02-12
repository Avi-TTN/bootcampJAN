package BeyondJava8Feature1;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        List<Optional<Integer>> ls = Arrays.asList(Optional.of(1),Optional.of(2),Optional.of(3),Optional.empty());
        Optional<Integer> ans = ls.stream()
                .flatMap(Optional::stream)
                .filter(x -> x > 2).findFirst();
        System.out.println(ans.get());

    }
}
