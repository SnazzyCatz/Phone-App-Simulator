/**
 * This class contains the planroute information and methods to go with it.
 * @author Michael Fasano
 * michael.fasano@stonybrook.edu
 * 110798138
 */

import java.util.*;
public class PlanRoute implements Command {
    private String source;
    private String destination;

    /**
     * This creates a PlanRoute object that take sa scanner to decide where you are and where you're looking for
     * @param scanner
     */
    public PlanRoute(Scanner scanner) {
        source = scanner.nextLine();
        destination = scanner.nextLine();
    }

    /**
     * This method returns a string to show you the destination that the user inputted
     * @return String
     */
    public String getDestination() {
        return destination;
    }

    /**
     * This method returns a string to show you the location of the user that they inputted
     * @return String
     */
    public String getSource() {

        return source;
    }

    /**
     * This method checks to see if a valid command has been inputted which means the safari stack can't take a map commmand
     * and vice versa, however, because of the way that the main method is written this is already taken care of.
     * @param stack
     * @return boolean
     */
    public boolean validCommand(CommandStack stack) {

        return false;
    }

    /**
     * This method returns a long version of the string to show where you are currently in the stack
     * @return String
     */
    public String toString() {
        return ("Your Current Location is:" + source + "\nYour Destination is:" + destination);
    }

    /**
     * This returns a shorthand version of the string to show where you are in the stack
     * @return
     */
    public String toShortString() {
        return ("P:" + source + "-" + destination);
    }
}
