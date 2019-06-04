import java.util.Scanner;

public class FindPlace implements Command {
    private String destination;

    public FindPlace(Scanner scanner) {
        System.out.println("Enter A Location:");
        destination = scanner.nextLine();
    }

    public boolean validCommand(CommandStack stack) {
        return false;
    }

    public String toString() {
        return ("Your Destination is:" + destination);
    }

    public String toShortString() {
        return ("F:" + destination + "-->");
    }
}
