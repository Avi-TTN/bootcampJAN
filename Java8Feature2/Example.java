package Java8Feature2;
public interface Example {
    default void methodDefault(){
        System.out.println("inside default");
    }
    static void methodStatic(){
        System.out.println("inside static");
    }
}
