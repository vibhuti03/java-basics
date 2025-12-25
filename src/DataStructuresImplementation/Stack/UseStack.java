package DataStructuresImplementation.Stack;

public class UseStack {
    public static void main(String[] args) {
        Stack ourStack = new StackImplementation(5);

        System.out.println(ourStack.peek());
        ourStack.push("Hello");
        ourStack.push("World");
        System.out.println(ourStack.size());
        System.out.println(ourStack.pop() + " " + ourStack.pop() );
        ourStack.push("New world is here");
        System.out.println(ourStack.peek());
        System.out.println(ourStack.isEmpty());
    }
}
