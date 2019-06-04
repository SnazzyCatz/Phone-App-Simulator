import java.util.*;

/**
 * This class creates a bookmark which is a command that the user can
 * input to bring them to a bookmarked page.
 * @author Michael Fasano
 * michael.fasano@stonybrook.edu
 * 110798138
 */
public class GoToBookmark implements Command {
    private String bookmark;

    /**
     * This method takes a scanner parameter to ask which bookmark the user
     * would like to go to
     * @param scanner
     */
    public GoToBookmark(Scanner scanner) {
        bookmark = scanner.nextLine();
    }

    /**
     * This method returns a boolean which checks if a valid command has been inputted which means the safari
     * stack can't take a map commmand and vice versa, however, because of the way that the main method is written this is already taken care of.
     * @param stack
     * @return
     */
    public boolean validCommand(CommandStack stack) {
        return false;
    }

    /**
     * This method returns a long version of the string representing where in the stack you are
     * @return String
     */
    public String toString() {
        return ("Going to bookmark at:" + bookmark);
    }

    /**
     * This method returns a shorthand version of the string representing where in the stack you are
     * @return String
     */
    public String toShortString() {
        return ("F:" + bookmark + "-->");
    }
}
