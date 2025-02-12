package BeyondJava8Feature1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q4 {
    public static void main(String[] args) {
        List<Integer> unmodifiableList = IntStream.range(1,11).boxed().collect(Collectors.toUnmodifiableList());
        System.out.println(unmodifiableList.getClass());
    }
}
