package DataStructuresImplementation.Stack;

public class StackImplementation implements Stack{
    private String[] stack;
    int top = -1; //Empty stack


    StackImplementation(int size){
        stack = new String[size];
    }


    @Override
    public void push(String item) {
        if(top> stack.length){
            return;
        }
        else{
            top++;
            stack[top] = item;
        }

    }

    @Override
    public String pop() {
        if (top<0){
            return "Pop - Stack empty";
        }
        else{
            /*
            String value = ourStack[top];
            top--;
            return value;
             */
            return stack[top--];
        }
    }

    @Override
    public String peek() {
        if (top<0){
            return "Peek - Stack empty";
        }
        return stack[top];
    }

    @Override
    public boolean isEmpty() {
        if (top<0)
            return true;
        return false;
    }

    @Override
    public int size() {
        return top;
    }
}
