package Java8Feature2;

import java.util.Arrays;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,2,3,5,6,7,8,9,10);
        int sum1 = ls.stream().filter(x -> x > 5).mapToInt(x -> x).sum();
        System.out.println(sum1);
        int sum2 = ls.stream().filter(x -> x > 5).reduce(0, Integer::sum);
        System.out.println(sum2);
    }
}
