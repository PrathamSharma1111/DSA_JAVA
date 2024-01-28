public class Stack_usingArray {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack_usingArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println(value + " pushed to stack");
        } else {
            System.out.println("Stack overflow, cannot push " + value);
        }
    }

    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println(poppedValue + " popped from stack");
            return poppedValue;
        } else {
            System.out.println("Stack underflow, cannot pop from an empty stack");
            return -1; // Return a sentinel value indicating an empty stack
        }
    }

    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty");
            return -1; // Return a sentinel value indicating an empty stack
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack_usingArray stack = new Stack_usingArray(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element of the stack: " + stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // Trying to pop from an empty stack

        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}

