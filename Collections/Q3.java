package Collections;

public class Q3 {
    public static void main(String[] args) {
        SpecialStack stk = new SpecialStack(5);
        stk.pop();
        stk.push(5);
        stk.push(1);
        stk.push(2);
        System.out.println(stk.pop());
        stk.push(4);
        stk.push(6);
        stk.push(8);
        stk.push(9);
        System.out.println(stk.getMin() + " : is Minimum in Stack");;
    }
}

