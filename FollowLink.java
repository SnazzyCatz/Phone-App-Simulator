import java.util.*;
public class FollowLink implements Command {
    private String link;

    /**
     * This method has a scanner parameter so that the user can input what they would like
     * for their link
     * @param scanner
     */
    public FollowLink(Scanner scanner) {
        link = scanner.nextLine();
    }

    /**
     * This method takes a stack to decide if a command is valid or not which in this case
     * means the safari stack can't take a map commmand, however, because of the way that
     * the main method is written this is already taken care of.
     * @param stack
     * @return boolean
     */
    public boolean validCommand(CommandStack stack) {
        return false;
    }

    /**
     * This method returns a string representing the full version of where
     * you are in the stack at the moment
     * @return String
     */
    public String toString() {
        return ("current screen" + link);
    }

    /**
     * This method returns a string to show a shorthand version of where you are
     * in the stack at the moment
     * @return String
     */
    public String toShortString() {
        return ("L:" + link);
    }
}
