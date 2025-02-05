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
class SpecialStack{
    private int[] stack;
    private int[] minStack;
    private int top;
    private int minTop;
    private int capacity;

    public SpecialStack(int capacity){
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.minStack = new int[capacity];
        this.top = -1;
        this.minTop = -1;
    }

    public void push(int val){
        if(isFull()){
            System.out.println("Stack is full, Can't push");
            return;
        }
        stack[++top] = val;
        System.out.println(val + " : added in Stack");
        if(minTop == -1){
            minStack[++minTop] = val;
        }
        else if(minStack[minTop] > val){
            minStack[++minTop] = val;
        }
        else{
            minStack[++minTop] = minStack[minTop-1] ;
        }
    }

    public int pop(){
        if(isEmpty()) {
            System.out.println("Stack is Empty, Can't pop");
            return -1;
        }
        int val = stack[top--];
        minTop--;
        return val;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity-1;
    }
    public int getMin(){
        return minStack[minTop];
    }
}
