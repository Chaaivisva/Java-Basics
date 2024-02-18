public class Stack {

    static int maxSize;
    static int top;
    static int[] stackArray;

    Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    boolean isEmpty() {
        return (top == -1);
    }

    boolean isFull() {
        return (top == maxSize - 1);
    }

    void push(int value) {
        if(top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println(value + " pushed into stack.");
        } else {
            System.out.println("Stack is full.");
        }
    }

    int pop() {
        if(top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println(poppedValue + " popped from stack.");
            return poppedValue;
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    int peek() {
        if(top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.pop();
        stack.pop();

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Is Empty: " + stack.isFull());
        System.out.println("Is Full: " + stack.isEmpty());
    }
}