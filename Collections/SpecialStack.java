package Collections;

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
