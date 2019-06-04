/**
 * This class holds the GoogleSomething class object and its methods which can be used and pushed onto the stack
 * @author Michael Fasano
 * michael.fasano@stonybrook.edu
 * 110798138
 */

import java.util.*;
public class GoogleSomething implements Command {
    private String query;
    public GoogleSomething(Scanner scanner) {
        query = scanner.nextLine();
    }
    public boolean validCommand(CommandStack stack) {
        return false;
    }
    public String toString() {
        return ("Google:" + query);
    }
    public String toShortString() {
        return ("G:" + query + "-->");
    }
}
