import java.util.*;

public class CommandStack {
    Stack<Command> stack = new Stack<Command>();
    public void push(Command command) {
        stack.push(command);
    }
    public Command pop() {
        return stack.pop();
    }
    public Command peek() {
        return stack.peek();
    }
    public boolean isEmpty() {
        if(stack.isEmpty() == true) {
            return true;
        }
        else {
            return false;
        }
    }
    public String getScreenCommand() {
        return (stack.peek().toShortString());
    }
    public String toString() {
        return (stack.peek().toString());
    }
}
