package Java8Feature1;

public interface Parent {
     default void show(){
        System.out.println("inside parent");
    }
}
