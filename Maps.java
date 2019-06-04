import java.util.*;

/**
 * This class creates a map which extends application and it contains the methods that will
 * be used later to read input from the user in the main method
 * @author Michael Fasano
 * michael.fasano@stonybrook.edu
 * 110798138
 */
public class Maps extends Applications {
    private  boolean Continue = true;
    private String option = "";
    private String tracker = "Home-->";

    /**
     * This methods gets the tracker value
     * @return String
     *      This method returns a string
     */
    public String getTracker() {
        return tracker;
    }

    /**
     * This method sets the tracker value
     * @param tracker
     *      This method sets the tracker to a new value
     */
    public void setTracker(String tracker) {
        this.tracker = tracker;
    }

    /**
     * This method takes a scanner parameter to read in inputs from the user to decide what command will be executed
     * @param scanner
     *      The scanner reads what should be done in the switch
     */
    public void readCommand(Scanner scanner) {
        while(Continue) {
            System.out.println("Please Pick Your Option:\nF:Find A Place\nP:Plan A Route\nN:Start Navigation\nB:Back\nS:Switch\nH:Home\nM:Print");
            option = scanner.nextLine();
            option = option.toLowerCase();
            switch(option) {
                case "f":
                    System.out.println("Where Would You Like To Go?");
                    FindPlace location = new FindPlace(scanner);
                    getStack().push(location);
                    System.out.println("Locations Found");
                    break;
                case "p":
                    System.out.println("Where Are You and Where Would You Like To Go(Input Source Then Where You Want To Go)?");
                    PlanRoute route = new PlanRoute(scanner);
                    getStack().push(route);
                    tracker += route.toShortString();
                    System.out.println("Route Found");
                    break;
                case "n":
                    System.out.println("Where Shall We Go Today(Input Source Then Destination)?");
                    //THIS CASE DOES NOT WORK YET STILL HAVE TO FIGURE OUT HOW TO DO THIS
                    StartNavigation navigation = new StartNavigation(getStack());
                    getStack().push(navigation);
                    tracker += navigation.toShortString();
                    System.out.println("Starting Route Navigation");
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
                    iCatchUp.setCheck("S");
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
                case "m":
                    System.out.println(tracker);
                    break;

            }
        }
    }

    /**
     * This method pops off the top of the stack.
     */
    public void goBack() throws EmptyStackExceptions{
        if(getStack().isEmpty()) {
            throw new EmptyStackExceptions("Can't Go Back Any Further");
        }
        else {
            getStack().pop();
        }
    }
}
