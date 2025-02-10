package Java8Feature1;

public interface Child1 extends Parent {
    @Override
    default void show() {
        System.out.println("inside child1");
    }
}
