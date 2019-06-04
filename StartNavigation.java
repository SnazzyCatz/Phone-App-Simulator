/**
 * This class should create a navigation command based on a plan route command
 * which would tell it where to navigate to
 * @author Michale Fasano
 * michael.fasano@stonybrook.edu
 * 110798138
 */

import java.util.*;
public class StartNavigation implements Command {
    private String source;
    private String destination;

    /**
     * This should take a stack and peek the top of it to see the top which should be
     * a PlanRoute and get a source and destination from it to use for navigation
     * @param commandStack
     */
    public StartNavigation(CommandStack commandStack) {

    }

    /**
     * This takes a stack to check if the top of the stack is a PlanRoute otherwise
     * it should return false
     * @param stack
     * @return boolean
     */
    public boolean validCommand(CommandStack stack) {
            return false;
    }

    /**
     * This returns a string to show where you are in the stack.
     * @return String
     */
    public String toString() {
      return("Your Currently at:" + source + "\nYour Destination is:" + destination);
    }

    /**
     * This returns a shorthand version of the string to show where you are in the stack
     * @return String
     */
    public String toShortString() {
        return ("N:" + source + "-" + destination);
    }
}
