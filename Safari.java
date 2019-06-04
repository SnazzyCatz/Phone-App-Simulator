import sun.invoke.empty.Empty;
/**
 * This class creates a safari class which extends applications. It contains the method
 * that will be used to read in input from the user to decide what commands they want to be done
 * @author Michael Fasano
 * michael.fasano@stonybrook.edu
 * 11079138
 */
import java.util.*;
public class Safari extends Applications{
    private boolean Continue = true;
    private String option = "";
    private String tracker = "Home-->";

    /**
     * This gets the tracker value
     * @return tracker
     *      This returns a string representing tracker
     */
    public String getTracker() {
        return tracker;
    }

    /**
     * This sets the tracker value
     * @param tracker
     *      This sets the tracker value to whatever you'd like
     */
    public void setTracker(String tracker) {
        this.tracker = tracker;
    }

    /**
     * This reads inputs from the user to decide which command they would like to be done
     * @param scanner
     * @throws EmptyStackExceptions
     */
    public void readCommand(Scanner scanner) throws EmptyStackExceptions {
        while (Continue) {
            System.out.println("Please Pick Your Option:\nG:Google Something\nF:Go to Favorite/Bookmark\nL:Follow A Link\nB:Back\nS:Switch\nH:Home\nP:Print");
            option = scanner.nextLine();
            option = option.toLowerCase();
            switch(option) {
                case "g":
                    System.out.println("What Would You Like To Search For:");
                    GoogleSomething search = new GoogleSomething(scanner);
                    getStack().push(search);
                    tracker+=search.toShortString();
                    System.out.println("Search Has Been Done");
                    break;
                case "l":
                    System.out.println("Input The Link:");
                    FollowLink link = new FollowLink(scanner);
                    getStack().push(link);
                    tracker+=link.toShortString();
                    break;
                case "f":
                    System.out.println("What Bookmark Would You Like To Go To?");
                    GoToBookmark bookmark = new GoToBookmark(scanner);
                    getStack().push(bookmark);
                    tracker+=bookmark.toShortString();
                    break;
                case "b":
                    try {
                        tracker.replace(getStack().peek().toShortString(), "");
                        goBack();
                    }catch(EmptyStackExceptions e) {
                        System.out.println("Could Not Go Back");
                    }
                    break;
                case "s":
                    iCatchUp.setCheck("M");
                    Continue = false;
                    break;
                case "h":
                    while(!getStack().isEmpty()) {
                        tracker.replace(getStack().peek().toShortString(),"");
                        getStack().pop();
                    }
                    iCatchUp.setCheck("H");
                    Continue = false;
                    break;
                case "p":
                    System.out.println(tracker);
                    break;
            }
        }
    }

    /**
     * This method pops off the top of the stack to go "back"
     * @throws EmptyStackExceptions
     */
    public void goBack() throws EmptyStackExceptions {
        if(getStack().isEmpty()) {
            throw new EmptyStackExceptions("Can't Go Back Any Further");
        }
        else {
            getStack().pop();
        }
    }
}
