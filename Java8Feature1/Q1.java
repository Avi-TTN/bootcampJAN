package Java8Feature1;

public class Q1 {
    public static void main(String[] args) {
        CompareInterface obj1 = (a,b) -> a > b;
        IncrementInterface obj2 = a -> a + 1;
        ConcaetenationInterface obj3 = (a, b) -> a + b;
        UpperCaseInterface obj4 = a -> a.toUpperCase();

        System.out.println(obj1.compare(5,10));
        System.out.println(obj2.increment(2));
        System.out.println(obj3.concaetnate("New", "er"));
        System.out.println(obj4.upperCaseConvert("hello world!!!"));

    }
}
