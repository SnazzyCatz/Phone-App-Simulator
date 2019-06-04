import java.util.*;

/**
 * This is the driver class that uses all the helper classes
 * @author Michael Fasano
 * michael.fasano@stonybrook.edu
 * 110798138
 */
public class iCatchUp extends Applications {
    private static boolean Continue = true;
    private static String check = "";
    private static Maps map = new Maps();
    private static Safari safari = new Safari();
    private static String quit = "";

    public static Safari getSafari() {
        return safari;
    }

    public static Maps getMap() {

        return map;
    }

    /**
     * Options:
     * Home
     S - Safari
     M - Maps
     Q - Quit
     Maps
     F - Find a place
     P - Plan a route
     N - Start Navigation
     Safari
     G - Google something
     F - Go to a favorite/bookmark
     L - Follow a link
     Both Safari and Maps
     B - Back
     S - Switch
     H - Home
     * @param args
     * @throws EmptyStackExceptions
     */
    public static void main(String args[]) throws EmptyStackExceptions {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter What You Would Like To Do:\nS:Safari\nM:Maps\nQ:Quit");
        check = input.nextLine();
        check = check.toUpperCase();
        while(Continue) {
            if(check.equals("S")) {
                if(safari.getStack().isEmpty()) {
                    safari.setTracker("Home-->SafariHome-->");

                }
                try {
                    safari.readCommand(input);
                }catch(Exception e) {
                    System.out.println("An Error Has Occurred");
                }
            }
            if(check.equals("M")) {
                if(map.getStack().isEmpty()) {
                    map.setTracker("Home-->MapsHome-->");
                }
                try {
                    map.readCommand(input);
                }catch(Exception e) {
                    System.out.println("An Error Has Occurred");
                }
            }
            if(check.equals("H")) {
                System.out.println("Welcome Home, What Would You Like To Do?\nS:Safari\nM:Maps\nQ:Quit");
                check = input.nextLine();
                check = check.toUpperCase();
            }
            if(check.equals("Q")) {
                Continue = false;
            }
        }
    }
    public static String getCheck() {
        return check;
    }

    public static void setCheck(String check) {
        iCatchUp.check = check;
    }
}
