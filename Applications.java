/**
 * This is the class the is extended by both maps and safari which use it as a base for what they will hold which are the methods written in here
 * that will be used in them and in the main method
 * @author Michael Fasano
 * michael.fasano@stonybrook.edu
 * 110798138
 */

import java.util.*;
public abstract class Applications {
    private CommandStack stack = new CommandStack();

    /**
     * This returns a commandstack object from the commandstack class
     * @return CommandStack
     */
    public CommandStack getStack() {
        return stack;
    }

    /**
     * This allows you to set the stack
     * @param stack
     */
    public void setStack(CommandStack stack) {
        this.stack = stack;
    }

    /**
     * This is the method that will read most of user input into maps and safari
     * @param scanner
     * @throws EmptyStackExceptions
     */
    public void readCommand(Scanner scanner) throws EmptyStackExceptions {
/**
 * This method will be used to pop off the stack when implemented in maps and safari
 */
    }
    public void goBack() throws EmptyStackExceptions {

    }
}
