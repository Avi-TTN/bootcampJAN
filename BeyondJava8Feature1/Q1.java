package BeyondJava8Feature1;


import java.util.stream.Stream;


public class Q1 {
    public static void main(String[] args) {
        Stream.iterate(0, x -> x < 10, x -> x + 2).forEach(System.out::println);
    }
}
