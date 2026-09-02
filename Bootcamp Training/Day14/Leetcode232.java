import java.util.Stack;
public class Leetcode232 {
    static class MyQueue {
        Stack<Integer> stack1;
        Stack<Integer> stack2;
        public MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }
        public void push(int x) {
            stack1.push(x);
        }
        public int pop() {
            moveIfNeeded();
            return stack2.pop();
        }
        public int peek() {
            moveIfNeeded();
            return stack2.peek();
        }
        public boolean empty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
        private void moveIfNeeded() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
        }
    }
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Pop: " + queue.pop());
        System.out.println("Pop: " + queue.pop());
        queue.push(4);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Is Empty: " + queue.empty());
    }
}
