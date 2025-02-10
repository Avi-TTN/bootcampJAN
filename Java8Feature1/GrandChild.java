package Java8Feature1;

public class GrandChild implements Child1,Child2{
    @Override
    public void show() {
        Child1.super.show();
        Child2.super.show();
    }
}
