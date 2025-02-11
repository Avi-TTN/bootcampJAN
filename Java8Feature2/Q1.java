package Java8Feature2;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q1 {
    public static void main(String[] args) {
        Consumer<String> c1 = str -> System.out.println("Hello " + str);
        Supplier<LocalDate> s1 = () -> LocalDate.now();
        Predicate<Integer> p1 = num -> (num%2 == 0);
        Function<String, Integer> f1 = str -> Integer.parseInt(str);
        c1.accept("Avi");
        System.out.println(s1.get());
        System.out.println(p1.test(4));
        System.out.println(f1.apply("5"));
    }

}
