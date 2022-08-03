
import java.util.Scanner;

/**
 * Requests a valid age and zip from the user
 *
 * @author danaw
 */
public class PromptForNumber {
    // TODO: put you code here!

    public static int promptForNumberInRange(Scanner user, String message, int min, int max) {
        System.out.println(message);
        int userInput = user.nextInt();
        while ((userInput < min || userInput > max)) {
            System.out.println("ERROR: Invalid value");
            System.out.println(message);
            userInput = user.nextInt();
        }
        return userInput;
    }

    /**
     * Requests a valid age and zip from the user
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the age and zip from the user and validate
        int age = promptForNumberInRange(input, "Enter your age: ", 1, 120);
        int zip = promptForNumberInRange(input, "Enter your zip: ", 1000, 99999);

        // Display the data to the user
        System.out.printf("Your age is %d.\n", age);
        System.out.printf("Your zip is %d.\n", zip);
    }
}
